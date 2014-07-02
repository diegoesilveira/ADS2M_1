package com.senac.registrobanco.view;

import com.senac.bank.console.BankConsole;

public class View extends BankConsole{

	public void printDividendsOperation()
	{
		System.out.println( "3 - Dividendos" );
	}
	
	public void printMenu()
	{
		System.out.println( " -----MENU----- "
				+ "\n1 - Deposito"
				+ "\n2 - Retirar" );
	}
}
