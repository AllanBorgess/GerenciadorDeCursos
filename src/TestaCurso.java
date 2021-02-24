package br.com.alura;

import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
	
		//criando o objetos "Curso" javaColeçoes 
		Curso javaColecoes = new Curso("Dominando as coleçoes no Java" , "Pualo silveira");
		
		//usando o metodo adiciona
		javaColecoes.adiciona(new Aula("Trabalhando com arrayList", 20));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 21));
		javaColecoes.adiciona(new Aula("Modelando com coleçoes", 24));
		
		List<Aula> aulas = javaColecoes.getAulas();
	
		
		System.out.println(aulas);
		
		javaColecoes.ordena();
		
		System.out.println(aulas);
		System.out.println("O tempo total é "+javaColecoes.getTempoTotal() + " minutos");
		
		System.out.println(javaColecoes);

	}

}
