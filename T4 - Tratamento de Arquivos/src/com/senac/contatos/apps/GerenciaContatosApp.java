package com.senac.contatos.apps;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.senac.contatos.controller.GerenciaContatos;

public class GerenciaContatosApp {

	public static void main(String[] args) {
		GerenciaContatos gerenciaContatos = null;
		
		try 
		{
			gerenciaContatos = new GerenciaContatos();
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
