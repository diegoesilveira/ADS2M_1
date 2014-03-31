package com.senac.banco.apps;

import com.senac.banco.system.Manager;

public class Application 
{

	public static void main(String[] args) 
	{
		Manager bankManager = new Manager();
		do
		{
			bankManager.menuOperations();
		}
		while (true);
	}

}
