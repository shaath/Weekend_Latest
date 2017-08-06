package webdriverprogrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText_GetAttributeEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		String text=driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(text);
		
		String href=driver.findElement(By.linkText("Gmail")).getAttribute("class");
		System.out.println(href);
		
		String tag=driver.findElement(By.linkText("Gmail")).getTagName();
		System.out.println(tag);
		

	}

}
