package search_context_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("admin");
		
//		WebElement password = driver.findElement(By.id("pass"));
//		WebElement password = driver.findElement(By.tagName("input"));
		WebElement password = driver.findElement(By.className("_9npi"));
		password.sendKeys("12e3rtweyjhgfdserwwrthg");
		
		Thread.sleep(3000);
		
		
		WebElement forgotPwd = driver.findElement(By.linkText("Forgot"));
		forgotPwd.click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
