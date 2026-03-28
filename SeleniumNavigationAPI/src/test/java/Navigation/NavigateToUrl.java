package Navigation;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToUrl {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to Amazon
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);

        // Navigate to Flipkart using URL object
        URL url1 = new URL("https://www.flipkart.com/");
        driver.navigate().to(url1);
        Thread.sleep(2000);

        // Navigate to UberEats using new URL directly
        driver.navigate().to(new URL("https://www.ubereats.com/in"));
        Thread.sleep(3000);

        driver.quit();
    }
}