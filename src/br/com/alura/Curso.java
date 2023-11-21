package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	
	private String nome;
	private String instrutor;
	//Melhor usar List<Aula> a ArrayList<Aula>, pois a implementação fica
	//mais genérica. (Polimorfismo). Baixo acoplamento.
	//Melhor encapsulada.
	//private List<Aula> aulas = new LinkedList<Aula>();
	//ArrayList tem uma performance melhor que List. Mas na inserção de
	//elementos a ArrayList empurra os elementos para inserir. Desta
	//forma a performance cai para um ArrayList com muitos elementos.
	//A LinkedList é mais rápida nesta situação, pois trabalha com 
	//ponteiros. Mas, é mais lenta para recuperar um elemento específico.
	//Pois busca de forma sequencial.
	private List<Aula> aulas = new ArrayList<Aula>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		//return aulas;
		//Não permite que seja modificado "ReadOnly".
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
		// java.lang.UnsupportedOperationException
		//Força o uso do adiciona (Encapsulamento).
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	
	

}
