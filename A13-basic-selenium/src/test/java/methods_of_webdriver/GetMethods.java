package methods_of_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) throws InterruptedException {

//		ctrl + space or ctrl + shift + O
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");

		String title = driver.getTitle();
		System.out.println(title);

		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);

		Thread.sleep(5000);

//		driver.close(); // closes the current window session id & do not stop the server
		driver.quit(); // closes all the windows session ids & stop the server
	}
}
