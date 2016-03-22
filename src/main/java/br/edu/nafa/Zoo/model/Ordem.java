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
public class Ordem extends Classificacao implements AdicionarLista<Familia>{

	@Getter @Setter private ObjectId _id;
	private List<Familia> familias;
	
	public void adicionar(Familia familia) {
		if (familias == null) {
			familias = new ArrayList<Familia>();
			familias.add(familia);
		} else {
			familias.add(familia);
		}
	}
	
}
