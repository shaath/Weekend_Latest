package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
//		Idenfication of block of radio buttons
		WebElement block=driver.findElement(By.xpath(".//*[@id='SearchForm']/nav"));
//		Identication of radio buttons in the block
		List<WebElement> radios=block.findElements(By.tagName("input"));
		
		System.out.println(radios.size());
		for (int i = 0; i < radios.size(); i++) 
		{
			String text=radios.get(i).getAttribute("value");
			System.out.println(text);
			if (text.equalsIgnoreCase("MultiCity"))
			{
				radios.get(i).click();
				break;
			}
		}
	}

}
