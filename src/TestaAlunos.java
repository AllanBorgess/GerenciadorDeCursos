package br.com.alura;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	

	public static void main(String[] args) {
		
		//conjunto
		Set<String>alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");

		//metodo contains é para verificar se existe determinado aluno no conjunto
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
		
		//remove o aluno do conjunto
		alunos.remove("Sergio Lopes");
		
		for (String aluno : alunos) {
			System.out.println(aluno );
		}
		//quantos alunos existem no conjunto
		System.out.println(alunos.size());
		
		System.out.println(alunos);
		
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		
	}

	
}

