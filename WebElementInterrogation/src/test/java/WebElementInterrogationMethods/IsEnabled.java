package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.shoppersstack.com/products_page/34");
        Thread.sleep(10000);

        WebElement checkbtn = driver.findElement(By.id("Check"));

        // Verifying if the button is enabled
        System.out.println("Is my Check Button enabled: " + checkbtn.isEnabled());

        driver.quit();
    }
}