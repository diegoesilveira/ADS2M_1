package com.senac.conta;
import com.senac.exception.*;

public class Conta {
	
	private double saldo;
	private int numConta;
	private int numVerificacao;
	
	public Conta () {
		
	}
	
	public Conta (double saldo, int numConta, int numVerificacao) {
		
		this.saldo = saldo;
		this.numConta = numConta;
		this.numVerificacao = numVerificacao;
		
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getNumVerificacao() {
		return numVerificacao;
	}
	public void setNumVerificacao(int numVerificacao) {
		this.numVerificacao = numVerificacao;
	}
	
	public void depositar (double valor) {
		
	}
	
	public void sacar (double valor) throws ExcecaoSaldoInsuficiente {
		if (valor > 0) {
			saldo = saldo - valor;
		} else {
			
		}
	}
	
	

}
