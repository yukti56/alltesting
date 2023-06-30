package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_class {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a676538\\eclipse-workspace\\Demo_Yukti\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F&hl=en&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		Robot r= new Robot();
		for(int i=0;i<5; i++) {
		r.keyPress(KeyEvent.VK_TAB);	
		}
		r.keyRelease(KeyEvent.VK_TAB);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("abc");
		//r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		

	}

}
