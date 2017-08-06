package webdriverprogrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLoginEg {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		//Launching the firefox
//		FirefoxDriver driver=new FirefoxDriver();
		//Launch gmail
		driver.get("http://gmail.com");
		//maximizing the window
//		driver.manage().window().maximize();
		
		//Identify email textbox
		WebElement email=driver.findElement(By.id("identifierId"));
		
//		email.click();
		//Entering email id into email text box
		email.sendKeys("testingtoolstrainer449");
		
//		email.clear();
		//Clicking on next button
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Sleeper.sleepTightInSeconds(5);
		//Entering text into pssword textbox
		driver.findElement(By.name("password")).sendKeys("1234567890");
		//Clicking on next button
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
	}

}
