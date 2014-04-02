package com.senac.conta;


public class Investimento extends Conta {
	
	private int datacriacao;
	private int taxa;
	
	public Investimento (double saldo, int numConta, int numVerificacao, int datacriacao, int taxa) {
		
		super (saldo, numConta, numVerificacao);
		this.datacriacao = datacriacao;
		this.taxa = taxa;
		
	}
	
	public int getDatacriacao() {
		return datacriacao;
	}
	public void setDatacriacao(int datacriacao) {
		this.datacriacao = datacriacao;
	}
	public int getTaxa() {
		return taxa;
	}
	public void setTaxa(int taxa) {
		this.taxa = taxa;
	}
	
	public void dividendos (int taxa) {
		
		setSaldo(getSaldo() + ((getSaldo() / 100) * taxa));
		
	}
	
	

}
