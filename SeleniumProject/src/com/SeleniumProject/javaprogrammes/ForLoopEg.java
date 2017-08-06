package com.SeleniumProject.javaprogrammes;

public class ForLoopEg {

	public static void main(String[] args) 
	{
		int i;
		for(i=1; i<=100 ; i++)
		{
			System.out.println(i);
			if (i==75) 
			{
				break;
			}
		}
		
		for (i = 100; i >= 1; i--) 
		{
			System.out.println(i);
		}

	}

}
