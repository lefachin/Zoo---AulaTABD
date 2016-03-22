/**
 * 
 */
package br.edu.nafa.Zoo.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Luiz Fachin
 *
 */
@Getter @Setter
@NoArgsConstructor
public class Classificacao {

	private String nomeVulgar;
	private String nomeCientifico;
	private List<String> caracteristicas;
	
	public Classificacao(String nomeVulgar, String nomeCientifico) {
		super();
		this.nomeVulgar = nomeVulgar;
		this.nomeCientifico = nomeCientifico;
	}
	
	public void adicionarCaracteristicas(String caracteristica) {
		if (caracteristicas == null) {
			caracteristicas = new ArrayList<String>();
			caracteristicas.add(caracteristica);
		} else {
			caracteristicas.add(caracteristica);
		}
	}
}