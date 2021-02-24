package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		// *NullPointerException* programação defenciva nome nao pode ser null
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser null");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public  String toString() {
		return "[Aluno: " + this.nome +  ",matricula: " + this.numeroMatricula + "]";
	}
	
	// mudando o *equals* eu consigo tornar dois objetos iguais 
	// se dois objetos são equals eles precisam passar o mesmo hashCode
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		//neste *equals* os nomes devem ser iguais
		return this.nome.equals(outro.nome);
	}
	

}
