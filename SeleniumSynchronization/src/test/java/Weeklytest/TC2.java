package Weeklytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://icehrmpro.gamonoid.com/login.php");
        Thread.sleep(2000);

        // Enter Username
        driver.findElement(By.id("username")).sendKeys("Admin");

        // Enter Password
        driver.findElement(By.id("password")).sendKeys("admin");

        // Click Login
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        Thread.sleep(3000);

        // Click Employees
        driver.findElement(By.xpath("//span[text()='Employees']")).click();
        Thread.sleep(2000);
        
        // Click Filter Employees
        driver.findElement(By.xpath("//span[text()='Filter Employees']")).click();
        Thread.sleep(2000);

        // Click Department dropdown
        driver.findElement(By.id("rc_select_8")).click();

        Thread.sleep(2000);

        // Enter Department
        driver.findElement(By.id("rc_select_8")).sendKeys("Server Administration");

        // Select Department
        driver.findElement(By.xpath("//span[@title='Server Administration']")).click();

        Thread.sleep(2000);

        // Click Save
        driver.findElement(By.xpath("//span[text()='Save']")).click();
    }
}