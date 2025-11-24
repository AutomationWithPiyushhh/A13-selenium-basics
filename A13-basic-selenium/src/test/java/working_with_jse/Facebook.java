package working_with_jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		WebElement cna = driver.findElement(By.partialLinkText("new"));
		WebElement login = driver.findElement(By.name("login"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("arguments[1].click();", login, cna);

		
		WebElement firstName = driver.findElement(By.name("firstname"));
//		firstName.sendKeys("Hira");
//		arguments[0].value='Hira';
		jse.executeScript("arguments[0].value='Hira';", firstName);
		
		WebElement custom = driver.findElement(By.xpath("//label[text()='Custom']/input")); 
//		custom.click();
		
		WebElement gender = driver.findElement(By.id("custom_gender"));
//		gender.sendKeys("male");
		jse.executeScript("arguments[0].value='Male';", gender);
	
		
		
//		Thread.sleep(5000);
//		driver.quit();
	}
}
