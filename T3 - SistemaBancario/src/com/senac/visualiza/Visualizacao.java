package com.senac.visualiza;
import java.util.*;


public class Visualizacao {

	Scanner entrada = new Scanner (System.in);
	
	public String cadastroNome () {	
			System.out.println("Digite seu nome: ");
			return entrada.next();
		}
	
	public String cadastroEndereco () {
		System.out.println("Digite o endere�o: ");
		return entrada.next();
	}
	
	public int cadastroTelefone () {
		System.out.println("Digite o telefone: ");
		return entrada.nextInt();
	}
	
	public double valorSaque () {
		System.out.println("Digite o valor do saque: ");
		return entrada.nextDouble();
	}
	
	public double valorDeposito () {
		System.out.println("Digite o valor do dep�sito: ");
		return entrada.nextDouble();
		
	}
	
	public int cadastroNumConta () {
		System.out.println("Digite o n�mero da conta: ");
		return entrada.nextInt();
	}
	
	public int cadastroNumVerifica () {
		System.out.println("Digite o n�mero de verifica��o: ");
		return entrada.nextInt();
	}
	
	public int cadastroLimiteEspecial () {
		System.out.println("Digite o limite da conta: ");
		return entrada.nextInt();
	}
	
	public int menuview () {
		
		System.out.println("Sistema Banc�rio");
		System.out.println("1 - Cadastrar cliente normal");
		System.out.println("2 - Cadastrar cliente especial");
		System.out.println("3 - Cadastrar cliente investimento");
		System.out.println("4 - Obter saldo");
		System.out.println("");
		System.out.println("");
		
		return entrada.nextInt();
		
	}
	
	
	
		
	
	}

	

