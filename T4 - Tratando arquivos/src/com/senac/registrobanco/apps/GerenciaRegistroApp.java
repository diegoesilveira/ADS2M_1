package com.senac.registrobanco.apps;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.senac.registrobanco.controller.GerenciaRegistro;

public class GerenciaRegistroApp {

	public static void main ( String args[] )
	{
		GerenciaRegistro gerenciaRegistro = null;
		
		try 
		{
			gerenciaRegistro = new GerenciaRegistro();
		} 
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println( "I/O failed." );
		}
		
		if (gerenciaRegistro != null) {
		if ( !gerenciaRegistro.isRegistersEmpty() )
			gerenciaRegistro.recordBankRegisterForEachContact();
		else {
			try 
			{	
				gerenciaRegistro.updateBankRegisters();
			} 
			catch (FileNotFoundException e) {
				System.out.println( "File not found." );
			}
		}
		
		gerenciaRegistro.saveFiles();
		}
	}
}
