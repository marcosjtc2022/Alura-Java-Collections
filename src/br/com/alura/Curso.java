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
	// Melhor usar List<Aula> a ArrayList<Aula>, pois a implementação fica
	// mais genérica. (Polimorfismo). Baixo acoplamento.
	// Melhor encapsulada.
	// private List<Aula> aulas = new LinkedList<Aula>();
	// ArrayList tem uma performance melhor que List. Mas na inserção de
	// elementos a ArrayList empurra os elementos para inserir. Desta
	// forma a performance cai para um ArrayList com muitos elementos.
	// A LinkedList é mais rápida nesta situação, pois trabalha com
	// ponteiros. Mas, é mais lenta para recuperar um elemento específico.
	// Pois busca de forma sequencial.
	//List é uma interface, portanto não se usa o new. Por isso, também,
	//ao se usar o list pode-se usar o new para ArrayList ou LinkedList,
	//ou seja uma interface que suporta várias implementações.
	private List<Aula> aulas = new ArrayList<Aula>();
	
	private Set<Aluno> alunos = new HashSet<>();
	//Mantém a ordem na qual os objetos foram adicionados.
	//private Set<Aluno> alunos = new LinkedHashSet<>();
	
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	//Guarda a ordem das linhas.
	//private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();
	
	//Vários alunos.
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
		// Não permite que seja modificado "ReadOnly".
		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
		// java.lang.UnsupportedOperationException
		// Força o uso do adiciona (Encapsulamento).
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
		//Associa aluno e a matrícula como chave do map.
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		//Método contains utiliza o equals. a1.equals(marcosCardoso)
		return this.alunos.contains(aluno);
	}
	
	public Aluno BuscaMatriculado(int numero) {
		if (!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException();
		return matriculaParaAluno.get(numero);
	}

}
