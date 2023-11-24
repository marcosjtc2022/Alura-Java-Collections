package br.com.alura;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do java", 
				"Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Criando uma Aula",20));
		javaColecoes.adiciona(new Aula("Modelando com coleções",22));
		
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
		
		
		System.out.println("O aluno " + a1 + " está matriculado ?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno marcosCardoso = new Aluno("Marcos Cardoso",123);	
		System.out.println("O aluno Marcos Cardoso está matriculado ?");
		System.out.println(javaColecoes.estaMatriculado(marcosCardoso));
		
		System.out.println(a1.equals(marcosCardoso));
		
		//Obrigatoriamente o seguinte é true:
		
		System.out.println(a1.hashCode() == marcosCardoso.hashCode());
		
	}

}
