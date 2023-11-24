package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	
	//Set em ingl�s significa conjunto.
	//Ordem aleat�ria dos objetos.
	//N�o possui m�todos que retornam a ordem dos elemntos. aluno.get(0);
	//N�o aceita elementos repetidos.
	//HashSet = tabela de espalhamento.
	//Velocidade de busca maior que list, arraylist, etc.
	public static void main(String[] args) {
		//Collection � m�o de set.
		//HashSet implementa set que � filha de collection.
		//Collection<String> alunos = new HashSet<>();
		Set<String> alunos = new HashSet<>();
		alunos.add("Marcos Jos�");
		alunos.add("Marcelo Teixeira");
		alunos.add("M�rcia Cardoso");
		//Mesmo se adicionar outra vez o elemento,
		//o Set n�o repete.
		alunos.add("Marcos Jos�");
		
		System.out.println(alunos.size());
		
		System.out.println(alunos);
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		//Vantagem na velocidade de busca
		boolean marcosEstaMatriculado = alunos.contains("Marcos Jos�");
		System.out.println(marcosEstaMatriculado);
		
		//Ocorre erro pq s� aceita List. Pois lista � um tipo de 
		//cole��o que sabe dizer a ordem dos elementos.
		//Muito comum usar diversas cole��es ao mesmo tempo.
		//Collections.sort(alunos);
		
		//Se quiser uma ordena��o.
		//List<String> alunosEmLista = new ArrayList<>();
		
	}

}
