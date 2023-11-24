package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	
	//Set em inglês significa conjunto.
	//Ordem aleatória dos objetos.
	//Não possui métodos que retornam a ordem dos elemntos. aluno.get(0);
	//Não aceita elementos repetidos.
	//HashSet = tabela de espalhamento.
	//Velocidade de busca maior que list, arraylist, etc.
	public static void main(String[] args) {
		//Collection é mão de set.
		//HashSet implementa set que é filha de collection.
		//Collection<String> alunos = new HashSet<>();
		Set<String> alunos = new HashSet<>();
		alunos.add("Marcos José");
		alunos.add("Marcelo Teixeira");
		alunos.add("Márcia Cardoso");
		//Mesmo se adicionar outra vez o elemento,
		//o Set não repete.
		alunos.add("Marcos José");
		
		System.out.println(alunos.size());
		
		System.out.println(alunos);
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		//Vantagem na velocidade de busca
		boolean marcosEstaMatriculado = alunos.contains("Marcos José");
		System.out.println(marcosEstaMatriculado);
		
		//Ocorre erro pq só aceita List. Pois lista é um tipo de 
		//coleção que sabe dizer a ordem dos elementos.
		//Muito comum usar diversas coleções ao mesmo tempo.
		//Collections.sort(alunos);
		
		//Se quiser uma ordenação.
		//List<String> alunosEmLista = new ArrayList<>();
		
	}

}
