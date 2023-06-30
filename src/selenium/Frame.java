package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a676538\\eclipse-workspace\\Demo_Yukti\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home");
		driver.manage().window().maximize();
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame("a077aa5e");
		System.out.println("*********** we are switch to the iframe********");
		driver.findElement(By.xpath("html/body/a/img")).click();

	}

}
