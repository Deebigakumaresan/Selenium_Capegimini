package HandlingJavascriptPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demopractice {
public static void main(String[] args) throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	Alert a = driver.switchTo().alert();
	a.accept();
	driver.findElement(By.id("small-searchterms")).sendKeys("Computers");
	driver.findElement(By.xpath("//input[@value='Search']")).click();
}
}