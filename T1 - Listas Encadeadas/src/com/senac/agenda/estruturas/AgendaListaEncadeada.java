package com.senac.agenda.estruturas;


public class AgendaListaEncadeada <T>{
	
	protected Nodo<T> head;
	protected Nodo<T> tail;
	
	public AgendaListaEncadeada() {
		head = null;
		tail = null;
	}
	
	public void inserir(Nodo<T> novo){
		
		novo.setAvanca(head);
		if(head!= null)
			head.setPrevious(novo);
		head=novo;
		if (tail == null)
			tail = novo;
		
	}
	
	public void inserir(Nodo<T> novo, Nodo<T> anterior)
	{
		if (anterior == null) {
			novo.setAvanca(head);
			head = novo;
			if (tail == null)
				tail = head;
		} else {
			novo.setAvanca(anterior.getAvanca());
			novo.setPrevious(anterior);
			anterior.setAvanca(novo);
			if (anterior == tail)
				tail = novo;
		}
	}
	
	public void append(Nodo<T> novo)
	{
		if (tail != null) {
			tail.setAvanca(novo);
			novo.setPrevious(tail);
		} else {
			head = novo;
		}
		tail = novo;
	}
	
	public Nodo<T> getTail()
	{
		return tail;
	}
	
	public Nodo<T> getHead()
	{
		return head;
	}

	public void remove(Nodo<T> nodo) {
		Nodo<T> anterior = nodo.getPrevious();
		Nodo<T> avanca = nodo.getAvanca();
		if (anterior != null)
			anterior.setAvanca(avanca);
		else
			head = avanca;
		if (avanca != null)
			avanca.setPrevious(anterior);
		else
			tail = anterior;
	}

	

}
