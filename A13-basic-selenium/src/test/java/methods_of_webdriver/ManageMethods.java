package methods_of_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

//		Store and use the variable
//		Options opt = driver.manage();
//		Window win = opt.window();
//		win.maximize();

		Window win = driver.manage().window();

//		Method chaining
//		Maximize
//		driver.manage().window().maximize();

//		minimize
//		win.minimize();

//		fullscreen
//		win.fullscreen();

//		getsize()
//		Dimension dim = win.getSize();
//		System.out.println(dim);
//		
//		int w = dim.getWidth();
//		int h = dim.getHeight();
//		
//		System.out.println("Width is : " + w);
//		System.out.println("Height is : " + h);

//		setsize()

//		Dimension dim2 = new Dimension(1200,800);
//		
//		win.setSize(dim2);
//		win.setSize(new Dimension(1200, 800));

//		getPosition()
//		Point pt1 = win.getPosition();
//		System.out.println(pt1);
//
//		int x = pt1.getX();
//		int y = pt1.getY();
//		
//		System.out.println("x axes is : " + x);
//		System.out.println("y axes is : " + y);

//		Setposition

//		Point pt2 = new Point(-8, -8);
//		win.setPosition(pt2);

//		How to maximize without maximize method
//		Dimension dim3 = new Dimension(1382, 736);
//		Point pt2 = new Point(-8, -8);
//		win.setSize(dim3);
//		win.setPosition(pt2);

		Thread.sleep(5000);
		driver.quit();
	}
}
