package SelectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectionMethod {

    public static void main(String[] args) throws InterruptedException {
        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the registration page
        driver.get("https://demo.automationtesting.in/Register.html");
        
        // Wait for 2 seconds to ensure page loads
        Thread.sleep(2000);
        
        // Locating the skills dropdown element using its ID
        WebElement dropdown = driver.findElement(By.id("Skills"));
        
        // Creating an object of the Select class to interact with the dropdown
        Select sel = new Select(dropdown);
        
        // Method 1: Selecting by index (starts from 0)
        // This selects the 10th option in the list
        sel.selectByIndex(9);
        
        Thread.sleep(2000);
        
        // Method 2: Selecting by the "value" attribute in the HTML
        sel.selectByValue("Data Analytics");
        
        // By Visible Text
        sel.selectByVisibleText("Engineering");
        Thread.sleep(2000);
        
        // By Contains Visible Text (to select JavaScript)
        sel.selectByContainsVisibleText("script");
        Thread.sleep(2000);
        
        // Optional: Close the driver when finished
        // driver.quit();
        driver.quit();
    }
}