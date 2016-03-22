/**
 * 
 */
package br.edu.nafa.Zoo.model;

import org.bson.types.ObjectId;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Luiz Fachin
 *
 */
@Getter @Setter
@NoArgsConstructor
public class Funcionario {

	private ObjectId _id;
	private String nome;
}
