package methods_of_webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

//		to click on particular link(To be learnt in future)
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("F")).click();

		Thread.sleep(3000);

		Navigation nav = driver.navigate();

		nav.back();

		Thread.sleep(3000);

		nav.forward();

		Thread.sleep(3000);

		nav.refresh();

		Thread.sleep(3000);

		String url1 = "https://www.facebook.com/";
		nav.to(url1);

		Thread.sleep(3000);

		URL url2 = new URL("https://www.flipkart.com/");
		nav.to(url2);

		Thread.sleep(3000);

		driver.quit();
	}
}
