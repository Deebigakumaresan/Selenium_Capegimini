package SelectClassMethods;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTestCase {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window ID: " + parentWindow);
        
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        
        Thread.sleep(3000);
        
        Set<String> allWindowsid = driver.getWindowHandles();
        
        for(String window : allWindowsid) {
            if(!window.equals(parentWindow)) {
                driver.switchTo().window(window);
            }
        }
        
        String currentURL = driver.getCurrentUrl();
        if(currentURL.contains("orangehrm.com")) {
            System.out.println("URL validation passed");
        } 
        else {
            System.out.println("URL validation failed");
        }
        
        String title = driver.getTitle();
        if(!title.isEmpty()) {
            System.out.println("Title validation passed");
        } 
        else {
            System.out.println("Title validation failed");
        }
        
        driver.close();
        
        driver.switchTo().window(parentWindow);

        if(driver.getCurrentUrl().contains("login")) {
            System.out.println("Login page is displayed");
        } else {
            System.out.println("Login page not displayed");
        }
        
        driver.quit();
    }
}