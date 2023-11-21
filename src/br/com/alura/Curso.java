package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	
	private String nome;
	private String instrutor;
	//Melhor usar List<Aula> a ArrayList<Aula>, pois a implementa��o fica
	//mais gen�rica. (Polimorfismo). Baixo acoplamento.
	//Melhor encapsulada.
	//private List<Aula> aulas = new LinkedList<Aula>();
	//ArrayList tem uma performance melhor que List. Mas na inser��o de
	//elementos a ArrayList empurra os elementos para inserir. Desta
	//forma a performance cai para um ArrayList com muitos elementos.
	//A LinkedList � mais r�pida nesta situa��o, pois trabalha com 
	//ponteiros. Mas, � mais lenta para recuperar um elemento espec�fico.
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
		//N�o permite que seja modificado "ReadOnly".
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
		// java.lang.UnsupportedOperationException
		//For�a o uso do adiciona (Encapsulamento).
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	
	

}
