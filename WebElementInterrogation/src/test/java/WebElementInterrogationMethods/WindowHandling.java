package WebElementInterrogationMethods;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        // Get Parent Window ID
        String parentID = driver.getWindowHandle();
        System.out.println("Parent Window ID: " + parentID);

        // Click Facebook link
        driver.findElement(By.linkText("Facebook")).click();
        Thread.sleep(2000);

        // Click Twitter link
        driver.findElement(By.linkText("Twitter")).click();
        Thread.sleep(2000);

        // Get all Window IDs
        Set<String> allWindows = driver.getWindowHandles();

        // Verify and switch to child windows
        for (String windowID : allWindows) {
            
            if (!windowID.equals(parentID)) {
                
                driver.switchTo().window(windowID);
                Thread.sleep(2000);
                System.out.println("Child Window ID: " + windowID);
                System.out.println("Child Window Title: " + driver.getTitle());
                
            }
        }

        driver.quit();
    }
}