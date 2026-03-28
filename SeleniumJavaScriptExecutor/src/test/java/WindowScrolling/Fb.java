package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	public static void main(String[] args) throws InterruptedException {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Open Facebook signup page
        driver.get("https://www.facebook.com/r.php/");

        // Select gender option
        driver.findElement(By.xpath("//div[contains(@id,'_R_')]")).click();

        // Wait for dropdown to appear
        Thread.sleep(3000);

        // Locate hidden input element
        WebElement hiddenEle = driver.findElement(By.xpath("//input[contains(@id,'_r_')]"));

        // Create JavascriptExecutor object
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Enter value into hidden element
        js.executeScript("arguments[0].value='Secret';", hiddenEle);

    }
}