package br.fiap.cliente;

public class Cliente {

	int id;
	String nome;

	public Cliente(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}


	@Override
	public String toString() {
		String aux = "";
		
	
		aux += "\tNome do Cliente: " + getNome();
		aux += "\n\tID do Cliente: " + getId();
		
		return aux;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
