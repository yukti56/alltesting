package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class class_two {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a676538\\eclipse-workspace\\Demo_Yukti\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
		
		//driver.get("https://www.flipkart.com/");
		driver.get("https://demoqa.com/droppable");

		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		//action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		
		//System.out.println(driver.findElement(By.xpath("//input[@name='Anil]")).isDisplayed());
		
		//System.out.println(driver.findElement(By.xpath("//input[@type='checkbox]")).isSelected());
		
		//action.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
		//driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']//ancestor::div[6]/button")).click();
		
		//Thread.sleep(3000);
		
		//Actions act= new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//img[@alt='Electronics']/parent::div"))).perform();
		
		WebElement titleA=driver.findElement(By.xpath("//div[@id='simpleDropContainer']/div[1]"));
		WebElement titleC=driver.findElement(By.xpath("//div[@id='simpleDropContainer']/div[2]"));
		
		action.moveToElement(titleA).clickAndHold().moveToElement(titleC).build().perform();
		//Thread.sleep(3000);
		//action.moveToElement(titleA).perform();
		//Thread.sleep(2000);
		//action.clickAndHold().perform();
		//Thread.sleep(2000);
		//action.moveToElement(titleC).perform();
		Thread.sleep(3000);
		action.release().perform();
		
		

		
		
		

	}

}
