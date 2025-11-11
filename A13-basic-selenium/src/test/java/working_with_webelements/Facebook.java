package working_with_webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.id("email"));
		WebElement loginBtn = driver.findElement(By.name("login"));

		username.sendKeys("Jitendar");

		Thread.sleep(3000);

		username.clear();

		Thread.sleep(3000);

		username.sendKeys("Devesh");

//		Getters
		String tagOfLogin = loginBtn.getTagName();
		System.out.println("tagname of loginbtn : " + tagOfLogin);

		String dataTestId = loginBtn.getAttribute("data-testid");
		System.out.println("dataTestId of loginBtn: " + dataTestId);

		String bgClrOfLoginBtn = loginBtn.getCssValue("background-color");
		String fontsize = loginBtn.getCssValue("font-size");
		String width = loginBtn.getCssValue("width");
		String border = loginBtn.getCssValue("border");
		String cursor = loginBtn.getCssValue("cursor");

		System.out.println("bg clr : " + bgClrOfLoginBtn);
		System.out.println("fontsize : " + fontsize);
		System.out.println("width : " + width);
		System.out.println("border : " + border);
		System.out.println("cursor : " + cursor);

		String textOfLogin = loginBtn.getText();
		System.out.println("text of loginbtn: " + textOfLogin);

//		size and location
		Rectangle rect = loginBtn.getRect();
		System.out.println("dimension of that element" + rect.getDimension());
		System.out.println("width of that element" + rect.getWidth());
		System.out.println("height of that element" + rect.getHeight());
		System.out.println("location of that element" + rect.getPoint());
		System.out.println("X of that element" + rect.getX());
		System.out.println("Y of that element" + rect.getY());

//		loginBtn.click();
		if (loginBtn.isDisplayed() && loginBtn.isEnabled()) {
//			loginBtn.submit();
		}

		driver.findElement(By.partialLinkText("new")).click();
		WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']/input"));
		
//		Validation methods
		if (!maleRadio.isSelected() && maleRadio.isDisplayed() && maleRadio.isEnabled()) {
			maleRadio.click();
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
