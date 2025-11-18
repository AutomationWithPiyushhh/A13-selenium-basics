package working_with_jse;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.location='https://www.naukri.com/';");

//		driver.get("https://www.naukri.com/");

//		Actions act = new Actions(driver);
//		act.scrollByAmount(0, 500).build().perform();

//		jse.executeScript("window.scrollBy(0,1000);");
//		Thread.sleep(1000);
//		jse.executeScript("window.scrollBy(0,1000);");
//		Thread.sleep(1000);
//		jse.executeScript("window.scrollBy(0,1000);");
//		Thread.sleep(1000);

		jse.executeScript("window.scrollTo(0,1000);");
		Thread.sleep(1000);
		jse.executeScript("window.scrollTo(0,2000);");
		Thread.sleep(1000);
		jse.executeScript("window.scrollTo(0,3000);");
		Thread.sleep(1000);

		
		
		
		Thread.sleep(3000);
		driver.quit();

	}
}
