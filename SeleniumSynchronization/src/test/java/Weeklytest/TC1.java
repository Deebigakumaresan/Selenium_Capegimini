package Weeklytest;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		WebElement error1 = driver.findElement(By.xpath("//button[text()='Log in ']")).click();
        System.out.println(error1.getText());
	}
}
