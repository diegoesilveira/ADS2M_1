package com.senac.agenda.estruturas;


public class AgendaListaEncadeada <T>{
	
	protected Nodo<T> inicioLista;
	protected Nodo<T> fimLista;
	
	public AgendaListaEncadeada() {
		inicioLista = null;
		fimLista = null;
	}
	
	public void inserir(Nodo<T> novo){
		
		novo.setAvanca(inicioLista);
		if(inicioLista!= null)
			inicioLista.setPrevious(novo);
		inicioLista=novo;
		if (fimLista == null)
			fimLista = novo;
		
	}
	
	public void inserir(Nodo<T> novo, Nodo<T> anterior)
	{
		if (anterior == null) {
			novo.setAvanca(inicioLista);
			inicioLista = novo;
			if (fimLista == null)
				fimLista = inicioLista;
		} else {
			novo.setAvanca(anterior.getAvanca());
			novo.setPrevious(anterior);
			anterior.setAvanca(novo);
			if (anterior == fimLista)
				fimLista = novo;
		}
	}
	
	public void append(Nodo<T> novo)
	{
		if (fimLista != null) {
			fimLista.setAvanca(novo);
			novo.setPrevious(fimLista);
		} else {
			inicioLista = novo;
		}
		fimLista = novo;
	}
	
	public Nodo<T> getTail()
	{
		return fimLista;
	}
	
	public Nodo<T> getInicioLista()
	{
		return inicioLista;
	}

	public void remove(Nodo<T> nodo) {
		Nodo<T> anterior = nodo.getPrevious();
		Nodo<T> avanca = nodo.getAvanca();
		if (anterior != null)
			anterior.setAvanca(avanca);
		else
			inicioLista = avanca;
		if (avanca != null)
			avanca.setPrevious(anterior);
		else
			fimLista = anterior;
	}

	

}
