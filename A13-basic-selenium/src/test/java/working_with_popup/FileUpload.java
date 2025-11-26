package working_with_popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("C:/Users/User/git/A13-basic-selenium/A13-basic-selenium/src/test/java/working_with_popup/FileUpload.html");

		Thread.sleep(3000);
		
		String path = "C:\\Users\\User\\OneDrive\\Desktop\\Jenkins.pdf";
		WebElement upload = driver.findElement(By.cssSelector("input[type='file']")); 	
		upload.sendKeys(path);
		
		
		Thread.sleep(2000);

		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclsrc=aw.ds&gad_source=1&gad_campaignid=19863995494&gbraid=0AAAAADLp3cHdE-vRLfFQHZTMaZbchjU16&gclid=Cj0KCQiAxJXJBhD_ARIsAH_JGjij-n0wv8K6syoYeYU_8e4cJ6b9VWxHgzsbl9YS5a6om5uD4gUf_hgaAjwgEALw_wcB");
		
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		WebElement resume = driver.findElement(By.id("resumeUpload"));
		resume.sendKeys(path);
		
		Thread.sleep(7000);
		driver.quit();
	}
}
