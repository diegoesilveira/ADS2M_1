package com.senac.agenda.model;

public class Pessoa{
	
	private String Nome, Telefone;
	

	public Pessoa() {
		Nome = null;
		Telefone = null;
		
	}


	public String getTelefone() {
		return Telefone;
	}


	public void setTelefone(String telefone) {
		this.Telefone = telefone;
	}
	
	
	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	
	

}
