package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		WebElement forgotPwd = driver.findElement(By.partialLinkText("Forgotten"));

//		Thread.sleep(1000);

		Actions act = new Actions(driver);
		act.doubleClick().build().perform();
//		hover on forgot pwd
//		act.moveToElement(forgotPwd).build().perform();

//		Thread.sleep(1000);
//		click wherever you have hovered
//		act.click().build().perform();

//		click on particular webelement
//		act.click(forgotPwd).build().perform();

//		right click wherever you have hovered
//		act.contextClick().build().perform();

//		right click on particular webelement
//		act.contextClick(forgotPwd).build().perform();

		Thread.sleep(3000);
		driver.navigate().to("https://vinothqaacademy.com/mouse-event");

		WebElement dbl = driver.findElement(By.id("dblclick"));

		act.doubleClick(dbl).build().perform();

		Thread.sleep(3000);
//		driver.quit();

	}
}
