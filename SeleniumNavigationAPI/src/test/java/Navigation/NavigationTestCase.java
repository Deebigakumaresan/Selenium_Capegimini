package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTestCase {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Navigate to Google
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        // 2. Type "Automation" in Search Text field
        WebElement googleSearch = driver.findElement(By.name("q"));
        googleSearch.sendKeys("Automation");
        Thread.sleep(2000);

        // 3. Navigate to Amazon.in and verify the title
        driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(2000);
        System.out.println("Amazon Title: " + driver.getTitle());

        // 4. Write "tools" in the Search Text field
        WebElement amazonSearch = driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearch.sendKeys("tools");
        Thread.sleep(2000);

        // 5. Refresh the page
        driver.navigate().refresh();
        Thread.sleep(2000);

        // 6. Navigate back and verify the title
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("After Back Title: " + driver.getTitle());

        driver.quit();
    }
}