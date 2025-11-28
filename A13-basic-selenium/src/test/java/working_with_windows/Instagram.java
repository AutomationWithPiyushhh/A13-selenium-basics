package working_with_windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
//		step 1> get the home address
		String PID = driver.getWindowHandle();
		
//		Step 2> perform the task which will open the new window/s
		driver.findElement(By.linkText("Meta Pay")).click();
		
//		step 3> get all the session IDs 
		Set<String> IDs = driver.getWindowHandles();

//		step 4> switch to your choice window
//				based on condition
		for (String i : IDs) {
			System.out.println(i);
			driver.switchTo().window(i);
						
			if (driver.getTitle().contains("Meta")) {
				break;
			}
		}
		
		driver.findElement(By.linkText("Check availability")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(PID);
		
		Thread.sleep(3000);		
		driver.close();
	}
}
