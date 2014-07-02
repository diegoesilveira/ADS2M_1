package com.senac.contatos.apps;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.senac.contatos.controller.Contatos;

public class ContatosApp {

	public static void main(String[] args) {
		Contatos gerenciaContatos = null;
		
		try 
		{
			gerenciaContatos = new Contatos();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println( "Erro arquivo não encontrado." );
		} 
		catch (IOException e) 
		{
			System.out.println( "Falha para abrir arquivo." );
		}
		if ( gerenciaContatos != null)
			gerenciaContatos.record20Contacts();
	}

}
