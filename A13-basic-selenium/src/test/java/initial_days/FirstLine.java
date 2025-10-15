package initial_days;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstLine {

	public static void main(String[] args) {
//		ChromeDriver 	driver1 = new ChromeDriver();
//		EdgeDriver 		driver2 = new EdgeDriver();
//		FirefoxDriver 	driver3 = new FirefoxDriver();

//		after upcasting
//		RemoteWebDriver driver1 = new ChromeDriver();
//		RemoteWebDriver driver2 = new EdgeDriver();
//		RemoteWebDriver driver3 = new FirefoxDriver();

//		after polymorphism
//		RemoteWebDriver driver = new ChromeDriver();
//						driver = new EdgeDriver();
//						driver = new FirefoxDriver();

//		upcast till webdriver (more load of RemoteWebDriver class).
		WebDriver driver = new ChromeDriver();
				  driver = new EdgeDriver();
				  driver = new FirefoxDriver();

//		ChromeDriver 	driver1 = new ChromeDriver();
//			type	  	   ref  keyword  constructor
//										1. launch the empty chrome browser
//										2. Start the server
//										3. load, register, re-initialize the non static members 
	}

}