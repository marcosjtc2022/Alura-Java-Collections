package br.com.alura;

public class TestaBuscaAlunosNoCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do java", 
				"Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Criando uma Aula",20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es",22));
		
		Aluno a1 = new Aluno("Marcos Cardoso",123);
		Aluno a2 = new Aluno("Paulo Cardoso",124);
		Aluno a3 = new Aluno("Micael Cardoso",125);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		Aluno aluno = javaColecoes.BuscaMatriculado(128);
		System.out.println(" Aluno � = " + aluno);
		
		
		
	}

}
