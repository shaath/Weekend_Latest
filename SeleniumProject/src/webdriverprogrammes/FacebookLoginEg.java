package webdriverprogrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginEg {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("gande3@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.findElement(By.id("u_0_r")).click();
		

	}

}
