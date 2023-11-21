package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do java", 
				"Paulo Silveira");
		
//		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println(aulas);
//		aulas.add(new Aula("Trabalhando com ArrayList",21));
		
		//Linha acima em apenas uma linha.
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
		//Melhor encapsulamento. Analogia com o motor do carro, pedais e marcha.
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Criando uma Aula",20));
		javaColecoes.adiciona(new Aula("Modelando com coleções",22));
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		
		
		//Tanto aulas quanto javaColecoes referenciam o mesmo objeto.
		//System.out.println(aulas);
		System.out.println(javaColecoes.getAulas());
		//System.out.println(aulas == javaColecoes.getAulas());
		
		
//		Em vez de declararmos a referência a uma ArrayList<Aula> (ou LinkedList<Aula>), o ideal é deixarmos mais genérico, utilizando a interface List. Por quê? Pelo motivo que já vimos ao estudar orientação a objetos aqui no Alura: não temos motivo para ser super específico na instância que iremos usar. Se declararmos apenas como List, poderemos mudar de implementação, como para uma LinkedList, sem problema algum de compilação, por não termos nos comprometido com uma implementação em específico.
		

	}

}
