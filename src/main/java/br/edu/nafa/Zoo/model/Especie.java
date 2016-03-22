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
public class Especie extends Classificacao implements AdicionarLista<Animal>{

	@Getter @Setter private ObjectId _id;
	private List<Animal> animais;
	
	public void adicionar(Animal animal) {
		if (animais == null) {
			animais = new ArrayList<Animal>();
			animais.add(animal);
		} else {
			animais.add(animal);
		}
	}

}
