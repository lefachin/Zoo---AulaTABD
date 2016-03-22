package br.edu.nafa.Zoo.model;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Secao implements AdicionarLista<Animal>{

	@Getter @Setter private ObjectId _id;
	@Getter @Setter private String nome;
	private List<Animal> animais;
	@Getter @Setter private Funcionario responsavel;
	
	public Secao(String nome, Funcionario responsavel) {
		this.nome = nome;
		this.responsavel = responsavel;
	}
	
	public Secao(String nome) {
		this.nome = nome;
	}
	
	public void adicionar(Animal animal) {
		if (animais == null) {
			animais = new ArrayList<Animal>();
			animais.add(animal);
		} else {
			animais.add(animal);
		}
	}	
}
