/**
 * 
 */
package br.edu.nafa.Zoo.model;

import java.time.LocalDate;

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
public class Animal {

	private ObjectId _id;
	private Especie especie;
	private String nome;
	private String subspecieVulgar;
	private String subspecieCientifica;
	private LocalDate dataNascimento;
	private String genero;
	private Float peso;
	private String coloracao;
	private Float comprimentoTotal;
	
	public Animal(Especie especie, String nome, String subspecieVulgar, String subspecieCientifica,
			LocalDate dataNascimento, String genero, Float peso, String coloracao, Float comprimentoTotal) {
		this.especie = especie;
		this.nome = nome;
		this.subspecieVulgar = subspecieVulgar;
		this.subspecieCientifica = subspecieCientifica;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.peso = peso;
		this.coloracao = coloracao;
		this.comprimentoTotal = comprimentoTotal;
	}
}