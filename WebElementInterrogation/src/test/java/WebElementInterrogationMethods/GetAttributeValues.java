package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValues {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);

        // Locating search text field
        WebElement search = driver.findElement(By.id("small-searchterms"));

        // Fetch attribute value for a static attribute
        System.out.println(search.getAttribute("id"));
        System.out.println(search.getDomAttribute("id"));
        System.out.println(search.getDomProperty("id"));

        // Fetching the attribute value of a dynamic attribute
        System.out.println(search.getAttribute("value"));
        System.out.println(search.getDomAttribute("value"));
        System.out.println(search.getDomProperty("value"));

        Thread.sleep(2000);

        // Typing Mobile to change the Data of value Attribute
        search.sendKeys("Mobile");

        System.out.println(search.getAttribute("value"));
        System.out.println(search.getDomAttribute("value"));
        System.out.println(search.getDomProperty("value"));

        driver.quit();
    }
}