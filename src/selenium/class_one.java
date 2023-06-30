package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","chromdriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get ("https://www.tutorialspoint.com/index.htm");
		

	}

}
