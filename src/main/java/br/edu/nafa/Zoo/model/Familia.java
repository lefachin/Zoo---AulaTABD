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
public class Familia extends Classificacao implements AdicionarLista<Genero> {

	@Getter @Setter private ObjectId _id;
	private List<Genero> generos;
	
	public void adicionar(Genero genero) {
		if (generos == null) {
			generos = new ArrayList<Genero>();
			generos.add(genero);
		} else {
			generos.add(genero);
		}
	}

}
