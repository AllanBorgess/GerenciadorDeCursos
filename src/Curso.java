package br.com.alura;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {
	
	private String Nome ;
	private String Instrutor;
	private List<Aula> aulas =  new ArrayList<Aula>();
	private Set<Aluno>alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	
	
	public Curso(String nome, String instrutor) {
		Nome = nome;
		Instrutor = instrutor;
	}

	public String getNome() {
		return Nome;
	}
	
	public String getInstrutor() {
		return Instrutor;
	}
	
	
	//Collections.unmodifiableList(lista) exibe uma copia imutavel da lista , uma lista apenas de exibição.
	public List<Aula> getAulas(){
		return Collections.unmodifiableList(aulas);
	}
	//criando o metodo adiciona
	void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void ordena() {
		Collections.sort(aulas);
	}
	
	 // metodo que soma o tempo em minutos de todos as aulas.
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	public String toString () {
		return "[Curso: " + Nome + ",tempo total: " + this.getTempoTotal() + "," + "aulas: "+ this.aulas + "]";
				
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		
	}
	public Set<Aluno> getAlunos(){
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	//encontrar aluno pelo numero da matricula
	public Aluno buscaMatriculado(int numero){
		return matriculaParaAluno.get(numero);
	}


}
