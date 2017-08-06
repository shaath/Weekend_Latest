package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> x=new ArrayList<Object>();
		//Writing the data into arraylist
		
		x.add("Selenium");
		x.add("Apple");
		x.add(40000);
		x.add(true);
		x.add('M');
		x.add(2, "Sharath");
		
		//Finding the length of tthe arrraylist
		System.out.println(x.size());
		
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
		}
	}

}
