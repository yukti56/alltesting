package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demo_testing2 {
	WebDriver driver;
	
	
	@BeforeSuite
	public void suiteSetup1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a676538\\eclipse-workspace\\Demo_Yukti\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("start-maximized");
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, Options);
		
 driver=new ChromeDriver(capabilities);
		
	}
	@BeforeClass
	public void firstclass()

	{
		driver.get("https://www.flipkart.com/");
	}
	@AfterTest
	public void seclass()
	{
		System.out.println("after class of class demo_testing");
	}
	
	@BeforeTest
	public void bfirst()
	{
		System.out.println("Before test of class demo_testing");
	}
	@AfterTest
	public void afirst()
	{
		System.out.println("after test of class demo_testing");
	}
	@Test
	public void ValidateURL()
	{
		String actualresult = driver.findElement(By.xpath("//span[text()='Login']")).getText();
		String f=null;
		Boolean condition= driver.findElement(By.xpath("//span[text()='Login']")).isDisplayed();
		//Assert.assertEquals(actualresult,"Login","login is not sucessfully");
		//Assert.assertNotEquals(null, null);
		//Assert.assertFalse(false);
		//Assert.assertTrue(false);
		//Assert.assertNull(f);
		//Assert.assertNotNull(actualresult);
		
		SoftAssert soft= new SoftAssert();
		soft.assertEquals(actualresult,"Logn","login is not sucessfully");
		System.out.println("present after assert statmanent");
		soft.assertAll();
		
	}
		/**@Test(groups = {"smoke","order"})
		public void orderpens() {

			System.out.println("Place order for pens");
		}**/
		
		//@Test(invocationCount=20)
		//public void ordertestbook()
		//{
		//	System.out.println("Place order for testbooks");
		//}

	}

