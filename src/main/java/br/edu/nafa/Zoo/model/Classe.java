/**
 * 
 */
package br.edu.nafa.Zoo.model;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Luiz Fachin
 *
 */
@NoArgsConstructor
public class Classe extends Classificacao implements AdicionarLista<Ordem> {

	@Getter @Setter private ObjectId _id;
	private List<Ordem> ordens;
	
	public void adicionar(Ordem ordem) {
		if (ordens == null) {
			ordens = new ArrayList<Ordem>();
			ordens.add(ordem);
		} else {
			ordens.add(ordem);
		}
	}
}
