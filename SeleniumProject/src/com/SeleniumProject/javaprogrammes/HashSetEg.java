package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args)
	{
		Set<Object> s=new HashSet<Object>();
		
		s.add("Selenium");
		s.add(440000);
		s.add("UFT");
		s.add("Apple");
		s.add("Apple");
		
		Iterator<Object> it=s.iterator();
		
		
		while(it.hasNext())
		{
			Object x=it.next();
			System.out.println(x);
		}
	}

}
