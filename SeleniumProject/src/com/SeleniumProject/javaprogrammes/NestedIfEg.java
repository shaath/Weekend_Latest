package com.SeleniumProject.javaprogrammes;

public class NestedIfEg {

	public static void main(String[] args)
	{
		int a=30;
		int b=200;
		int c=1000;
		
		if(a > b & a > c)
		{
			System.out.println("A is greater");
		}	
		else if(b > c & b > a)
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is Greater");
		}
	}

}
