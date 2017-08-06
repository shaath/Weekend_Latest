package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		Object[] x=new Object[5];
		
		//Finding the length of the array
		
		System.out.println(x.length);
		//Writing the data into an array
		
		x[2]="Selenium";
		x[4]=40000;
		x[2]=40000;
		
		//Reading the data from array
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}
	}

}
