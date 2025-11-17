package working_with_ss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebook {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");


//		Take the ss of webpage
//		downcasting
		TakesScreenshot tks = (TakesScreenshot) driver;
		File source = tks.getScreenshotAs(OutputType.FILE);

//		/A13-basic-selenium/errorshots/dummy.png
//		./errorshots/dummy.png => . means project level
		File destination = new File("./errorshots/fb.png");
		FileHandler.copy(source, destination);
		
//		Take the ss of webelement
		WebElement login = driver.findElement(By.name("login"));
		File source1 = login.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("./errorshots/login.png");
		FileHandler.copy(source1, destination1);
		
		driver.quit();

	}
}
