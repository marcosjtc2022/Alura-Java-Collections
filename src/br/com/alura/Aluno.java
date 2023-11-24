package br.com.alura;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		
		if (nome == null) {
			throw new NullPointerException("Nome n�o pode ser null");
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
	
	//Sempre que reescrever o m�todo equals , � necess�rio escrever
	//o m�todo hashCode(). 
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	//Tem que reescrever para funcionar a compara��o abaixo.
	//javaColecoes.estaMatriculado(marcosCardoso);
	@Override
	public int hashCode() {
		//Retorna o primeiro caracater do nome.
		//O caracter da primeira posi��o n�o muda memso com 
		//v�rios news. No entanto a compara��o ficaria 
		//com a performance comprometida.
		//return this.nome.charAt(0);
		//Solu��o � usar  m�todo hashCode da classe string
		return this.nome.hashCode();
	}

	

}
