package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmpregTest extends TestNGMaster
{
	@Test(dataProvider="data")
	public void org_Empreg(String fn,String ln)
	{
		expval=fn+" "+ln;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fn);
		driver.findElement(By.id("lastName")).sendKeys(ln);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).getText();
	
		Assert.assertEquals(actval, expval, "Employee registration Failed");
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] x=new Object[3][2];
		
		x[0][0]="Vignan";
		x[0][1]="Kumar";
		
		x[1][0]="Vijay";
		x[1][1]="Kumar";
		
		x[2][0]="Sandeep";
		x[2][1]="Reddy";
		
		return x;
	}

}
