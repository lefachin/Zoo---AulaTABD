/**
 * 
 */
package br.edu.nafa.Zoo.model;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Luiz Fachin
 *
 */
public class Genero extends Classificacao implements AdicionarLista<Especie>{

	@Getter @Setter private ObjectId _id;
	private List<Especie> especies;
	
	public void adicionar(Especie especie) {
		if (especies == null) {
			especies = new ArrayList<Especie>();
			especies.add(especie);
		} else {
			especies.add(especie);
		}
	}

}
