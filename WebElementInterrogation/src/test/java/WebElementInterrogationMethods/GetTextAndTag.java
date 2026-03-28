package WebElementInterrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

class GetTextAndTag {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);

        WebElement aboutLink = driver.findElement(By.id("navbarDropdown"));

        System.out.println("Name of my link is: " + aboutLink.getText());
        System.out.println("The tagName is: " + aboutLink.getTagName());

        driver.quit();
    }
}