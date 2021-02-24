package br.com.alura;

import java.security.NoSuchAlgorithmException;

public class TestaBuscaAlunosNoCurso {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		Curso javaColecoes = new Curso("Dominando as coleçoes no Java" , "Pualo silveira");
		
		//usando o metodo adiciona
		javaColecoes.adiciona(new Aula("Trabalhando com arrayList", 20));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 21));
		javaColecoes.adiciona(new Aula("Modelando com coleçoes", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		Aluno aluno = javaColecoes.buscaMatriculado(34672);
		System.out.println("aluno: " + aluno);
	}
}


	
