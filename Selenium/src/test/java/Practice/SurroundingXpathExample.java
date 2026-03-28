package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SurroundingXpathExample {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();

        // Wait for page to load
        Thread.sleep(3000);

        // Click Add to cart for "Build your own computer"
        driver.findElement(By.xpath(
                "//a[text()='Build your own computer']/../..//input[@value='Add to cart']"
        )).click();

        // Wait to see result
        Thread.sleep(3000);

        // Close browser
        driver.quit();
    }
}