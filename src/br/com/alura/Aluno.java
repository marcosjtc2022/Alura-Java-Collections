package br.com.alura;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		
		if (nome == null) {
			throw new NullPointerException("Nome não pode ser null");
		}
		
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula " + this.numeroMatricula + "]" ;
	}
	
	//Sempre que reescrever o método equals , é necessário escrever
	//o método hashCode(). 
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	//Tem que reescrever para funcionar a comparação abaixo.
	//javaColecoes.estaMatriculado(marcosCardoso);
	@Override
	public int hashCode() {
		//Retorna o primeiro caracater do nome.
		//O caracter da primeira posição não muda memso com 
		//vários news. No entanto a comparação ficaria 
		//com a performance comprometida.
		//return this.nome.charAt(0);
		//Solução é usar  método hashCode da classe string
		return this.nome.hashCode();
	}

	

}
