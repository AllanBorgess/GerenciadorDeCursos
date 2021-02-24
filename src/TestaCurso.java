package br.com.alura;

import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
	
		//criando o objetos "Curso" javaCole�oes 
		Curso javaColecoes = new Curso("Dominando as cole�oes no Java" , "Pualo silveira");
		
		//usando o metodo adiciona
		javaColecoes.adiciona(new Aula("Trabalhando com arrayList", 20));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 21));
		javaColecoes.adiciona(new Aula("Modelando com cole�oes", 24));
		
		List<Aula> aulas = javaColecoes.getAulas();
	
		
		System.out.println(aulas);
		
		javaColecoes.ordena();
		
		System.out.println(aulas);
		System.out.println("O tempo total � "+javaColecoes.getTempoTotal() + " minutos");
		
		System.out.println(javaColecoes);

	}

}
