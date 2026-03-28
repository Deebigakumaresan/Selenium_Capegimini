package WindowScrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnHiddenElement {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 1: Navigate to Demo Web Shop
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);

        // Locate the search textbox
        WebElement searchbox = driver.findElement(By.id("small-searchterms"));

        // Create JavascriptExecutor reference
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Step 2: Type "Mobiles" using JavaScript Executor
        js.executeScript("arguments[0].value='Mobiles'", searchbox);
        Thread.sleep(2000);
    }
}