package WebElementInterrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);

        // Locating the logo (SVG)
        WebElement logo = driver.findElement(
                By.xpath("//*[name()='svg' and @id='Layer_1']")
        );

        System.out.println("Logo font-family: " + logo.getCssValue("font-family"));
        System.out.println("Logo color: " + logo.getCssValue("color"));
        System.out.println("Logo background-color: " + logo.getCssValue("background-color"));
        System.out.println("Logo display: " + logo.getCssValue("display"));

        // Locating the Downloads link
        WebElement downloads = driver.findElement(
                By.xpath("//span[.='Downloads']")
        );

        System.out.println("Downloads font-family: " + downloads.getCssValue("font-family"));
        System.out.println("Downloads color: " + downloads.getCssValue("color"));
        System.out.println("Downloads background-color: " + downloads.getCssValue("background-color"));
        System.out.println("Downloads display: " + downloads.getCssValue("display"));

        driver.quit();
    }
}