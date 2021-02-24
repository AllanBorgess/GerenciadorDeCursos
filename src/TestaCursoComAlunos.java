package br.com.alura;

public class TestaCursoComAlunos {
	public static void main(String[] args) {
		
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
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a ->{
			System.out.println(a);
		});
		
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno Turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println(a1.equals(Turini));
		
		System.out.println();
	
	}
	

}
