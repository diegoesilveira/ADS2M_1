package com.senac.agenda.estruturas;


public class AgendaListaOrdenada <T extends Comparable<T>>
extends AgendaListaEncadeada<T> {

	public Nodo<T> procuraNodo(Nodo<T> a)
	{
		Nodo<T> atual = getInicioLista();
		Nodo<T> anterior = null;
		T chaveA = a.getData();
		
		while (atual != null) {
			T chaveAtual = atual.getData();
			int c = chaveA.compareTo(chaveAtual);
			if (c == 0)
				return atual; 
			if (c < 0)
				return anterior;
			anterior = atual;
			atual = atual.getAvanca();
		}
		return anterior;
	}
	
	@Override
	public void append(Nodo<T> novo)
	{
		inserir(novo);
	}
	
	@Override
	public void inserir(Nodo<T> novo, Nodo<T> anterior)
	{
		inserir(novo);
	}
	
	@Override
	public void inserir(Nodo<T> novo)
	{
		Nodo<T> anterior = procuraNodo(novo);
		
		if (anterior == null) {
			novo.setAvanca(inicioLista);
			if (inicioLista != null)
				inicioLista.setPrevious(novo);
			inicioLista = novo;
			if (fimLista == null)
				fimLista = novo;
		} else {
			Nodo<T> prox = anterior.getAvanca(); 
			novo.setAvanca(prox);
			novo.setPrevious(anterior);
			anterior.setAvanca(novo);
			if (fimLista == anterior)
				fimLista = novo;
			else
				prox.setPrevious(novo);
		}
	}
}


