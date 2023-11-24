package br.com.alura;

public class TestaCursoComAluno {
	
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
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		
		System.out.println("O aluno " + a1 + " est� matriculado ?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno marcosCardoso = new Aluno("Marcos Cardoso",123);	
		System.out.println("O aluno Marcos Cardoso est� matriculado ?");
		System.out.println(javaColecoes.estaMatriculado(marcosCardoso));
		
		System.out.println(a1.equals(marcosCardoso));
		
		//Obrigatoriamente o seguinte � true:
		
		System.out.println(a1.hashCode() == marcosCardoso.hashCode());
		
	}

}
