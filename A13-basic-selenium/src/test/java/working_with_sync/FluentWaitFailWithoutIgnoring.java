package working_with_sync;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class FluentWaitFailWithoutIgnoring {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        // Click on Start button to load the element dynamically
        driver.findElement(By.xpath("//div[@id='start']/button")).click();

        By finishText = By.id("finish");

        // ❌ FluentWait WITHOUT ignoring
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(3))
                .pollingEvery(Duration.ofSeconds(1));

        // Custom condition (will throw NoSuchElementException if not found)
        WebElement element = wait.until(driver1 -> {
            System.out.println("Trying to find element...");
            WebElement el = driver1.findElement(finishText);
            // When the element is found and displayed, return it
            return el.isDisplayed() ? el : null;
        });

        System.out.println("Text: " + element.getText());
        driver.quit();
    }
}

