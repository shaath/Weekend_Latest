package day4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MultipleWindowsHanlingEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		String bing=driver.getWindowHandle();
		
		System.out.println(bing);
		
		driver.findElement(By.linkText("MSN")).click();
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String wId=it.next();
			System.out.println(wId);
			driver.switchTo().window(wId);
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			try
			{
				driver.findElement(By.linkText("MONEY")).click();
				Sleeper.sleepTightInSeconds(3);
				System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
				break;
			}
			catch (Exception e) 
			{
				System.out.println("The expected link not available in this page");
			}
			
		}

		driver.switchTo().window(bing);
		driver.findElement(By.linkText("Maps")).click();
		driver.close();
//		driver.quit();
	}

}
