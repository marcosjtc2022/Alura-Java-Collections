package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TratandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		// sysou + ctrl + backspace.
		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		for (String aula : aulas) {
			System.out.println("Aula: " + aula);

		}

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);

		// Se colcar <= no size vai ocorrer erro indexboundexception.
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));

		}

		//ctrl + shift + f = formatação.
		aulas.forEach(aula -> {
			System.out.println("Percorrendo " + aula);
		});
		
		aulas.add("Aumentando o conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println("Ordenado = " + aulas);

	}

}
