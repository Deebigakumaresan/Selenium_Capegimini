package SeleniumWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopTestCase {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 1 Navigate to Demo Web Shop
        driver.get("https://demowebshop.tricentis.com/");
        
        // 2 Click Facebook, Twitter, YouTube
        driver.findElement(By.linkText("Facebook")).click();
        driver.findElement(By.linkText("Twitter")).click();
        driver.findElement(By.linkText("YouTube")).click();
        
        // Get parent window
        String parent = driver.getWindowHandle();

        // Get all windows
        Set<String> allwindows = driver.getWindowHandles();
        
        }
}