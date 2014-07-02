package com.senac.registrobanco.view;

import com.senac.bank.console.BankConsole;

public class BancoView extends BankConsole{

	public void printDividendsOperation()
	{
		System.out.println( "3 - Operacao Dividendos" );
	}
	
	public void printMenu()
	{
		System.out.println( "### MENU ###"
				+ "\n1 - Operacao deposito"
				+ "\n2 - Operacao retirar" );
	}
}
