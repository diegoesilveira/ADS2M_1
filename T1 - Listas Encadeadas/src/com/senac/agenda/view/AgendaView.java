package com.senac.agenda.view;

import java.util.Scanner;

public class AgendaView {
	
	private static final Scanner teclado = new Scanner(System.in);
	
	public void imprimeInteiro(Integer valor) {
		System.out.println(valor);
	}

	public void mostraMensagem(String messagem) {
		System.out.println(messagem);
	}

	public void mostraTela(String tela) {
		System.out.print(tela+": ");
	}

	public String LeString(String tela) {
		mostraTela(tela);
		return LeString();
	}
	
	public String LeString() {
		return teclado.nextLine();
	}
	
	public String gravaString(String mensagem) {
		mostraTela(mensagem);
		return gravaString();
	}

	
	

}
