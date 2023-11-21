package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es do java", 
				"Paulo Silveira");
		
//		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println(aulas);
//		aulas.add(new Aula("Trabalhando com ArrayList",21));
		
		//Linha acima em apenas uma linha.
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
		//Melhor encapsulamento. Analogia com o motor do carro, pedais e marcha.
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Criando uma Aula",20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es",22));
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		
		
		//Tanto aulas quanto javaColecoes referenciam o mesmo objeto.
		//System.out.println(aulas);
		System.out.println(javaColecoes.getAulas());
		//System.out.println(aulas == javaColecoes.getAulas());
		
		
//		Em vez de declararmos a refer�ncia a uma ArrayList<Aula> (ou LinkedList<Aula>), o ideal � deixarmos mais gen�rico, utilizando a interface List. Por qu�? Pelo motivo que j� vimos ao estudar orienta��o a objetos aqui no Alura: n�o temos motivo para ser super espec�fico na inst�ncia que iremos usar. Se declararmos apenas como List, poderemos mudar de implementa��o, como para uma LinkedList, sem problema algum de compila��o, por n�o termos nos comprometido com uma implementa��o em espec�fico.
		

	}

}
