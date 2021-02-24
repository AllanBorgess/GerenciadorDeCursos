package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListDeAula {

	public static void main(String[] args) {
		
		//Criando as minhas aulas
		Aula a1 = new Aula("Revisitando as Arraylists",21);
		Aula a2 = new Aula("Listas de objetos",15);
		Aula a3 = new Aula("Relacionamento de listas e objetos",15);
		
		//criando a minha lista do tipo "Aula"
		ArrayList<Aula> aulas = new ArrayList<>();
		//adicionando os objetos "Aula" dentro da ArrayList "Aula"
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		//ordena de maneira lexcograficamente os titulos do objeto aula.
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//ordena por tempo de cada aula do objeto aula.
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
	}
}
