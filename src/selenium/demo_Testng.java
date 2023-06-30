package selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo_Testng {
	@BeforeSuite
	public void firstsuite()
	{
		System.out.println("Before suite of class demo_testing");
	}
	@AfterTest
	public void sesuite()
	{
		System.out.println("after suite of class demo_testing");
	}
	
	@BeforeClass
	public void firstclass()
	{
		System.out.println("Before class of class demo_testing");
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
	@BeforeMethod
	public void login()
	{
		System.out.println("Place order for login");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("Place order for logout");
	}
	
	@Test
	public void orderTV()
	{
		System.out.println("Place order for TV");
	}
	
	@Test(groups = "smoke")
	public void ordermobile()
	{
		System.out.println("Place order for mobile");
	}

}
