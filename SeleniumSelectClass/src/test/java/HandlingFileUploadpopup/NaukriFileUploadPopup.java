package HandlingFileUploadpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriFileUploadPopup {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		// Click on Register button
        driver.findElement(By.id("register_Layer")).click();

        // Click on Experienced option
        driver.findElement(By.xpath("//div[@data-val='exp']")).click();

        Thread.sleep(2000);

        // Upload resume file
        driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\DEEBIGA RK\\Downloads\\Deebiga RK Resume.pdf");
	}
}
