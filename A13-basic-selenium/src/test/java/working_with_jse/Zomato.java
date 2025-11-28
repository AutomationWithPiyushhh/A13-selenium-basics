package working_with_jse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.zomato.com/");

		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		WebElement we = driver.findElement(By.className("h-36"));
		Actions act = new Actions(driver);
//		act.scrollByAmount(0,1000).build().perform();
//		act.scrollToElement(we).build().perform();

//		jse.executeScript("window.scrollBy(0,1000);");
//		Thread.sleep(1000);
//		jse.executeScript("window.scrollBy(0,-1000);");

//		act.scrollToElement(we).build().perform();
//		webelement.scrollIntoView(boolean)
		jse.executeScript("arguments[0].scrollIntoView(true)", we);

		Thread.sleep(3000);
		driver.quit();
	}
}
