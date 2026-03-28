package WebElementInterrogationMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestScenario {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Navigate to OrangeHRM
        driver.get("https://opensource-demo.orangehrmlive.com/");

        Thread.sleep(3000);

        // 2. Locate Username using dynamic XPath
        WebElement username = driver.findElement(By.xpath("//input[starts-with(@name,'user')]"));
        username.sendKeys("Admin");

        // 3. Locate Password below Username using relative locator
        WebElement password = driver.findElement(
                RelativeLocator.with(By.tagName("input")).below(username));
        password.sendKeys("admin123");

        System.out.println("Password is entered successfully");

        // 4. Click Login button by absolute xpath
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/div[2]/form/div[3]/button")).click();

        Thread.sleep(4000);

        // 5. Click Profile menu
        driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();

        Thread.sleep(2000);

        // 6. Click Change Password
        driver.findElement(By.xpath("//a[text()='Change Password']")).click();

        Thread.sleep(3000);

        // 7. Navigate back and verify
        driver.navigate().back();
        System.out.println("Navigated Back");

        Thread.sleep(2000);

        // 8. Navigate forward and verify
        driver.navigate().forward();
        System.out.println("Navigated Forward");

        Thread.sleep(2000);

        // 9. Refresh
        driver.navigate().refresh();

        // 10. Validate current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 11. Close browser
        driver.quit();
    }
}
