package WebElementInterrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkVerification {
public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Navigate to website
        driver.get("https://demowebshop.tricentis.com/");
        
        // Expected URL
        String expectedLink = "https://demowebshop.tricentis.com/";
        
        // Get Current URL
        String actualLink = driver.getCurrentUrl();
        
        // Verification
        if (expectedLink.equals(actualLink)) {
            System.out.println("Link verification is passed");
        } else {
            System.out.println("Link verification is failed");
        }
        
        // Close browser
        driver.quit();
    }
}
