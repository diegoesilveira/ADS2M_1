package com.senac.banco.exceptions;

public class NoClientFoundException extends Exception {
	
	private static final long serialVersionUID = 3523522482751843335L;
	
	public NoClientFoundException()
	{
		super( "No Client Founds" );
	}

}
