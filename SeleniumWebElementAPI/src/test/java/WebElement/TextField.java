package WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextField {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Register.html");
        Thread.sleep(2000);

        // Enter First Name
        WebElement firstname = driver.findElement(By.cssSelector("[placeholder='First Name']"));
        firstname.sendKeys("Monica");

        // Enter Last Name
        driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("D");

        // Clearing the first name
        Thread.sleep(2000);
        firstname.clear();

        Thread.sleep(2000);
        firstname.sendKeys("Gokul");
    }
}