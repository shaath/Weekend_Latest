package webdriverprogrammes;

import org.openqa.selenium.firefox.FirefoxDriver;


public class FFLaunchEg {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();

		driver.get("http://opensource.demo.orangehrmlive.com");
	}

}
