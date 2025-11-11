package working_with_dd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spy {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("C:/Users/User/git/A13-basic-selenium/A13-basic-selenium/src/test/java/HTML/Spy.html");
		
		Thread.sleep(1000);
		
//		step 1> get the ref of WE
		WebElement countryDD = driver.findElement(By.id("country"));
//		step 2> create object of Select
		Select selCountry = new Select(countryDD);
//		step 3> use Select class methods
//		selCountry.selectByIndex(2);
//		selCountry.selectByValue("2");
//		selCountry.selectByVisibleText("USA");
		
		List<WebElement> countries = selCountry.getOptions();
		
		for (WebElement i : countries) {
			System.out.println(i.getText());
		}
		System.out.println(selCountry.isMultiple());
		
		WebElement langDD = driver.findElement(By.id("lang"));
		Select selLang = new Select(langDD);
		selLang.selectByIndex(0);
		selLang.selectByIndex(1);
		selLang.selectByIndex(3);
		
		Thread.sleep(2000);
		
		selLang.deselectByIndex(1);
		selLang.deselectByIndex(3);
		
		
		
		
		Thread.sleep(1500);
		driver.quit();
		
	}
}
