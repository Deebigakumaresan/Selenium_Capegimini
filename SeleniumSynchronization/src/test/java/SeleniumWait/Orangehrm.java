package SeleniumWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Orangehrm {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Navigate to login page
        driver.get("https://icehrmpro.gamonoid.com/login.php");
        Thread.sleep(3000);
        // 2 & 3. Click login without entering credentials
        driver.findElement(By.xpath("//button[@type='button']")).click();
        Thread.sleep(2000);
        // 4. Validate required field message
        WebElement error1 = driver.findElement(By.xpath("//div[contains(text(),'required')]"));
        System.out.println(error1.getText());

        // 5. Enter invalid credentials
        driver.findElement(By.id("username")).sendKeys("invalid");
        driver.findElement(By.id("password")).sendKeys("invalid");

        // 6. Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // 7. Validate invalid credential message
        WebElement error2 = driver.findElement(By.xpath("//div[contains(text(),'Invalid')]"));
        System.out.println(error2.getText());

        // 8. Enter valid credentials
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");

        // 9. Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);

        // 10. Validate Dashboard
        System.out.println("Login Successful");

        // 11. Navigate to Employees
        driver.findElement(By.xpath("//span[text()='Employees']")).click();

        // 12. Click Skills
        driver.findElement(By.xpath("//span[text()='Skills']")).click();

        // 13. Click Add New
        driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();

        // 14. Add new skill
        driver.findElement(By.id("name")).sendKeys("AutomationSkill");
        driver.findElement(By.xpath("//button[text()='Save']")).click();

        // Validate skill added
        WebElement skill = driver.findElement(By.xpath("//td[contains(text(),'AutomationSkill')]"));
        if(skill.isDisplayed()) {
            System.out.println("Skill added successfully");
        }

        // 15. Logout
        driver.findElement(By.xpath("//span[text()='Logout']")).click();

        driver.quit();
    }
}