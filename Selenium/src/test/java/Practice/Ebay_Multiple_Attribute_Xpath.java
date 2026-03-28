package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_Multiple_Attribute_Xpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[contains(@href,'Clothing-Shoes-Accessories') and contains(@class,'vl-flyout-nav__js-show')]")).click();
    }
}
