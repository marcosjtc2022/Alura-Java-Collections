package br.com.alura;

import java.util.Collections;

//implements Comparable<Aula> possibilita o uso da interface sort.
//(Collections.sort(aulas);)
//e implementar o m�todo compareTo
public class Aula implements Comparable<Aula> {
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	//Sobrescreve a classe m�e
	//Sa�da do println sem este m�todo = br.com.alura.Aula@5e91993f
	//M�todo toString � impl�cito quando se usa system.out.println.
	@Override
	public String toString() {		
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";		
	}

	@Override
	public int compareTo(Aula outraAula) {
		
		return this.titulo.compareTo(outraAula.titulo); 
	}
	
	
	

}
