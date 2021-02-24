package br.com.alura;
//implements Comparable e necessario para podermos mudar o metodo compareTo.
public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	//construtor do objeto aula
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	//maneira de adicionar um texto na exibiçao dos objetos da lista
	public String toString() {
		return "[Aula:" + this.titulo + "," + this.tempo + "minutos]";	}

	//compareTo compara lexcograficamente o titulo dos objetos
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	//mudando o hashCode
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	

}
