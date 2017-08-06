package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEg1 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms09.htm");
		driver.manage().window().maximize();
		//Identifcation of first check box in that block
		WebElement check=driver.findElement(By.name("option1"));
		
		//checking the status of check box
		System.out.println(check.isSelected());
		
		if (!check.isSelected())
		{
			check.click();
		}

	}

}
