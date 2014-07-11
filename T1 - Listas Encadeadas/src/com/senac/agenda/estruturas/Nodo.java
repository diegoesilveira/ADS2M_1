package com.senac.agenda.estruturas;

	
	public class Nodo<T> {
		private T data;
		private Nodo<T> avanca;
		private Nodo<T> anterior;
		
		public Nodo()   
		{
			data = null;
			avanca = null;
		}

		public Nodo(T chave) {
			this.data = chave;
			this.avanca = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Nodo<T> getAvanca() {  
			return avanca;
		}

		public void setAvanca(Nodo<T> avanca) {
			this.avanca = avanca;
		}

		public Nodo<T> getPrevious() {
			return anterior;
		}

		public void setPrevious(Nodo<T> ant) {
			this.anterior = ant;
		}
		
	}
	
	


