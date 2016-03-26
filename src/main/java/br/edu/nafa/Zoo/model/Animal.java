/**
 * 
 */
package br.edu.nafa.Zoo.model;

import java.time.LocalDate;

import org.bson.types.ObjectId;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
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
	// teste para aparecer na tela.
	private StringProperty nomePropety;
	private String nome;
	private String subspecieVulgar;
	private String subspecieCientifica;
	private LocalDate dataNascimento;
	private String genero;
	private Float peso;
	private String coloracao;
	private Float comprimentoTotal;
	private Boolean ameacado;
	
	public Animal(Especie especie, String nome, String subspecieVulgar, String subspecieCientifica,
			LocalDate dataNascimento, String genero, Float peso, String coloracao, Float comprimentoTotal,
			Boolean ameacado) {
		this.especie = especie;
		this.nome = nome;
		this.subspecieVulgar = subspecieVulgar;
		this.subspecieCientifica = subspecieCientifica;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.peso = peso;
		this.coloracao = coloracao;
		this.comprimentoTotal = comprimentoTotal;
		this.ameacado = ameacado;
	}
	
	// construtor so para o nome de cada animal para colocar na tabela
	
	public Animal(String nomePropety){
		this.nomePropety= new SimpleStringProperty(nomePropety);
	}
	
	public StringProperty nomePropety(){
		return nomePropety;
	}
}
