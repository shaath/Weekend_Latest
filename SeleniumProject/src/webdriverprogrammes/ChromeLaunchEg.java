package webdriverprogrammes;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunchEg {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://google.com");
	}

}
