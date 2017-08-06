package com.SeleniumProject.javaprogrammes;

public class ObjectEg
{
	public static void main(String[] args) 
	{
		Object[] salary={"Selenium",'M',30000,4444.44,true};

		//Finding the length of the array
				System.out.println(salary.length);
				//Reading the data from array
				
//				System.out.println(salary[2]);
				for (int i = 0; i < salary.length; i++) 
				{
					if (i!=2 )
					{
						System.out.println(salary[i]);
					}
					
				}

	}

}
