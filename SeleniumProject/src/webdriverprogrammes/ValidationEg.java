package webdriverprogrammes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ValidationEg {

	public static void main(String[] args)
	{
		String expval="bing";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		String actval=driver.getTitle();
		
		if (expval.equalsIgnoreCase(actval)) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
