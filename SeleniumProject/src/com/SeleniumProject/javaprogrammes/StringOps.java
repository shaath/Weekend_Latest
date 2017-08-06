package com.SeleniumProject.javaprogrammes;

public class StringOps {

	public static void main(String[] args) 
	{
		String var1="You are selected ";
		String var2="Selenium";
		
		System.out.println(var1+var2);
		
		System.out.println(var2.length());

		System.out.println(var2.charAt(5));
		
		System.out.println(var1.substring(4, 7));
		
		System.out.println(var1.replace("are", "have"));
		
		for (int i = 6; i  >= 0; i--)
		{
			System.out.print(var2.charAt(i));
		}
	}

}
