package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a clesse aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		// remove um elemento da lista
		aulas.remove(0);

		System.out.println(aulas);

		// modelando como minha lista sera apresentada.
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		// get pocisao da lista
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é :" + primeiraAula);

		// .size mostra quantos elementos a dentro da lista
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula " + i + ":" + aulas.get(i));
		}

		// maneira de adicionar um texto na exibiçao dos elementos da lista
		aulas.forEach(aula -> {
			System.out.println("percorrendo:"); 
			System.out.println("Aula " + aula);
		});

		// adicionaou um elemnto na lista
		aulas.add("Aumentando nossa conhecimento");
		System.out.println(aulas);

		//sort Ordenou a lista por ordem alfabetica
		Collections.sort(aulas);
		System.out.println("Depois de ordenado");
		System.out.println(aulas);
	}

}
