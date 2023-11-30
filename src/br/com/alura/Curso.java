package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	// Melhor usar List<Aula> a ArrayList<Aula>, pois a implementa��o fica
	// mais gen�rica. (Polimorfismo). Baixo acoplamento.
	// Melhor encapsulada.
	// private List<Aula> aulas = new LinkedList<Aula>();
	// ArrayList tem uma performance melhor que List. Mas na inser��o de
	// elementos a ArrayList empurra os elementos para inserir. Desta
	// forma a performance cai para um ArrayList com muitos elementos.
	// A LinkedList � mais r�pida nesta situa��o, pois trabalha com
	// ponteiros. Mas, � mais lenta para recuperar um elemento espec�fico.
	// Pois busca de forma sequencial.
	//List � uma interface, portanto n�o se usa o new. Por isso, tamb�m,
	//ao se usar o list pode-se usar o new para ArrayList ou LinkedList,
	//ou seja uma interface que suporta v�rias implementa��es.
	private List<Aula> aulas = new ArrayList<Aula>();
	
	private Set<Aluno> alunos = new HashSet<>();
	//Mant�m a ordem na qual os objetos foram adicionados.
	//private Set<Aluno> alunos = new LinkedHashSet<>();
	
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	//Guarda a ordem das linhas.
	//private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();
	
	//V�rios alunos.
	private Map<Integer, Set<Aluno>> matriculaAlunos;

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
		// return aulas;
		// N�o permite que seja modificado "ReadOnly".
		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
		// java.lang.UnsupportedOperationException
		// For�a o uso do adiciona (Encapsulamento).
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//		}
//		return tempoTotal;

		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + "aulas: " + this.aulas + "]";
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		//Associa aluno e a matr�cula como chave do map.
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		//M�todo contains utiliza o equals. a1.equals(marcosCardoso)
		return this.alunos.contains(aluno);
	}
	
	public Aluno BuscaMatriculado(int numero) {
		if (!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException();
		return matriculaParaAluno.get(numero);
	}

}
