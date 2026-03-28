package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackAndForth {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to Myntra
        driver.get("https://www.myntra.com/");
        Thread.sleep(2000);

        // Navigate to BigBasket
        driver.navigate().to("https://www.bigbasket.com/");
        Thread.sleep(2000);

        // Navigate to Amazon
        driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(2000);

        // Navigate Back (to BigBasket)
        driver.navigate().back();
        System.out.println("After Back: " + driver.getTitle());
        Thread.sleep(2000);

        // Navigate Back (to Myntra)
        driver.navigate().back();
        System.out.println("After Second Back: " + driver.getTitle());
        Thread.sleep(2000);

        // Navigate Forward (to BigBasket)
        driver.navigate().forward();
        System.out.println("After Forward: " + driver.getTitle());
        Thread.sleep(2000);

        // Refresh the page
        driver.navigate().refresh();
        System.out.println("After Refresh: " + driver.getTitle());
        Thread.sleep(2000);

        driver.quit();
    }
}