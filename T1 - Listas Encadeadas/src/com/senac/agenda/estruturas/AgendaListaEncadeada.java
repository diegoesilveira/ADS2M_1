package com.senac.agenda.estruturas;

import com.senac.estruturas.Nodo;

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
		
	}
	

}
