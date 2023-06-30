package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a676538\\eclipse-workspace\\Demo_Yukti\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("television");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Go']")).click();
		driver.findElement(By.xpath("//span[text()='Results']/ancestor::div[4]/following-sibling::div[1]/descendant::a[1]")).click();
		String f= driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> itr= s.iterator();
		String parentwindowid= itr.next();
		String childwindow= itr.next();
		System.out.println(driver.getTitle());
		System.out.println("value of f is"+f);
		System.out.println("value of parentwindowid is"+parentwindowid);
		System.out.println("value of childwindow is"+childwindow);
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("add-to-cart-button")).click();
		//driver.close();
		driver.quit();

		
		
		
		
		
		//driver.findElement(By.name("cusid")).sendKeys("56789");
		//driver.findElement(By.name("submit")).submit();
		//driver.switchTo().alert().sendKeys("Yes");
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss();;


	}

}
