package com.senac.conta;

import com.senac.exception.ExcecaoSaldoInsuficiente;


public class Especial extends Conta {
	
	private double limite;
	
	public Especial () {
		
	}
	
	public Especial (double saldo, int numConta, int numVerificacao, double limite) {
		
		super (saldo, numConta, numVerificacao);
		this.limite = limite;
		
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void sacar (double valor) throws ExcecaoSaldoInsuficiente {
		if (valor > getLimite()) {
			throw new ExcecaoSaldoInsuficiente ();
		} 
		
		else {
			
			setSaldo(getSaldo() - valor);
		}
			
		}

}
