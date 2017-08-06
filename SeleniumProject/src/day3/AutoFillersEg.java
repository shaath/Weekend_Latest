package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutoFillersEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("r");
		Sleeper.sleepTightInSeconds(3);
		
		List<WebElement> list=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) 
		{
			String name=list.get(i).getText();
			System.out.println(name);
			if (name.equalsIgnoreCase("ranchi"))
			{
				list.get(i).click();
				break;
			}
		}

	}

}
