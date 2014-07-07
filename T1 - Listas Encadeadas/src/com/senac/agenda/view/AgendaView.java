package com.senac.agenda.view;

import java.util.Scanner;

public class AgendaView {
	
	private static final Scanner teclado = new Scanner(System.in);
	
	public void imprimeInteiro(Integer valor) {
		System.out.println(valor);
	}

	public void showMessage(String message) {
		System.out.println(message);
	}

	public void showPrompt(String prompt) {
		System.out.print(prompt+": ");
	}

	public String LeString(String prompt) {
		showPrompt(prompt);
		return LeString();
	}
	
	public String LeString() {
		return teclado.nextLine();
	}
	

	
	

}
