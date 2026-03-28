package Weeklytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest {
    public static void main(String[] args) throws InterruptedException {

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to URL
        driver.get("https://icehrmpro.gamonoid.com/login.php");

        Thread.sleep(2000);

        // Enter Username
        driver.findElement(By.id("username")).sendKeys("admin");

        // Enter Password
        driver.findElement(By.id("password")).sendKeys("admin");

        // Click Login
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        Thread.sleep(4000);

        // Click Employees (main menu)
        driver.findElement(By.xpath("//span[text()='Employees']")).click();

        Thread.sleep(2000);

        // Click Employees (submenu)
        driver.findElement(By.xpath("//a[contains(@href,'admin_Employees')]")).click();

        Thread.sleep(3000);

        // Click Filter Employees
        driver.findElement(By.xpath("//span[text()='Filter Employees']")).click();

        Thread.sleep(2000);

        // Click Department dropdown
        driver.findElement(By.id("rc_select_8")).click();

        Thread.sleep(4000);

        // Select Server Administration department
        driver.findElement(By.xpath("//span[@title='Server Administration']")).click();
        driver.findElement(By.xpath("//input[contains(@class,'ant-select-selection-search-input')]")).click();
        Thread.sleep(4000);

        // Click Save
        driver.findElement(By.xpath("//span[text()='Save']")).click();

        Thread.sleep(3000);

        // Logout
        driver.findElement(By.xpath("//span[text()='Logout']")).click();

    }
}