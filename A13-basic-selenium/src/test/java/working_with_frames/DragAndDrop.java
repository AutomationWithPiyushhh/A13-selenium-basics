package working_with_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frameEle = driver.findElement(By.className("demo-frame"));
		
//		driver.switchTo().frame(index);
//		driver.switchTo().frame(id/name);
		driver.switchTo().frame(frameEle);
		
		
//		driver.switchTo().parentFrame();  to traverse back to the immediate parent 
//		driver.switchTo().defaultContent(); to the main html page

		
		WebElement t1 = driver.findElement(By.cssSelector("img[alt='The peaks of High Tatras']"));
		WebElement t2 = driver.findElement(By.cssSelector("img[alt='The chalet at the Green mountain lake']"));
		WebElement t3 = driver.findElement(By.cssSelector("img[alt='Planning the ascent']"));
		WebElement t4 = driver.findElement(By.cssSelector("img[alt='On top of Kozi kopka']"));

		WebElement trash = driver.findElement(By.id("trash"));

		Actions act = new Actions(driver);
		act.dragAndDrop(t1, trash).build().perform();

		Thread.sleep(2000);
		driver.quit();		
	}
}
