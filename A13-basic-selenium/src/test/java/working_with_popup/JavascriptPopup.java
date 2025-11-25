package working_with_popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

		driver.switchTo().frame("iframeResult");

//		driver.findElement(By.xpath("//button[text()='Try it']")).click();

//		pop up will be appeared

		Alert ale = driver.switchTo().alert();
		String text = ale.getText();
		System.out.println(text);

		ale.sendKeys("Raju");
		ale.accept();
		ale.dismiss();

		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
