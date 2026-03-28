package HandlingJavascriptPopups;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTestCase {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        Thread.sleep(3000);

        // Search for dresses
        WebElement search = driver.findElement(By.cssSelector("[class='desktop-searchBar']"));
        search.sendKeys("dressess", Keys.ENTER);

        // Click first product
        driver.findElement(By.xpath("(//picture[@draggable='false' and @class='img-responsive'])[1]")).click();
        Thread.sleep(4000);

        // Store parent window
        String parent = driver.getWindowHandle();

        // Get all windows
        Set<String> all = driver.getWindowHandles();

        // Remove parent window
        all.remove(parent);

        // Switch to child window
        for (String str : all) {
            driver.switchTo().window(str);
        }

        // Click wishlist icon
        driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center ']")).click();
        Thread.sleep(2000);

        // Verify login popup
        WebElement login = driver.findElement(By.className("welcome-header"));

        if (login.isDisplayed()) {
            System.out.println("Test case: Pass");
        } else {
            System.out.println("Test case: Fail");
        }
    }
}