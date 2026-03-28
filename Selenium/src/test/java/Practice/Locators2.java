package Practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver = new ChromeDriver();
    	

//        driver.get("https://demowebshop.tricentis.com/");
//        Thread.sleep(3000);
//        driver.findElement(By.linkText("Facebook")).click();
//
//        driver.get("https://www.google.com/");
//        Thread.sleep(3000);
//        driver.findElement(By.linkText("Gmail")).click();
//
//        driver.get("https://demowebshop.tricentis.com/");
//        Thread.sleep(3000);
//        driver.findElement(By.linkText("Computers\r\n" + " ")).click();
//        driver.findElement(By.partialLinkText("Compu")).click();
//
//        driver.get("https://demowebshop.tricentis.com/");
//        Thread.sleep(3000);
//        driver.findElement(By.partialLinkText("Log in")).click();
//
//        driver.get("https://www.flipkart.com/");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//span[text()='✕']")).click();
//
//        driver.get("https://www.flipkart.com/");
//        Thread.sleep(2000);
//        driver.findElement(By.partialLinkText("Cart")).click();
//
//        driver.get("https://demowebshop.tricentis.com/");
//        Thread.sleep(3000);
//        driver.findElement(By.className("ico-register")).click();

//        driver.get("https://demowebshop.tricentis.com/");
//        Thread.sleep(3000);
//        List<WebElement> r = driver.findElements(By.className("ico-register"));
//
//        for (WebElement i : r) {
//            System.out.println(i.getText());
//            i.click();
//        }
//
//        driver.get("https://www.google.com/");
//        Thread.sleep(3000);
//        List<WebElement> r2 = driver.findElements(By.tagName("a"));
//
//        for (WebElement i : r2) {
//            System.out.println(i.getText());
//        }
//
//        for (WebElement i : r2) {
//            if (i.getText().equals("Store")) {
//                i.click();
//                break;
//            }
//        }
//
//        driver.get("https://www.flipkart.com/");
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("div[class=\"_3n8fna1co _3n8fna10j _3n8fnaod _3n8fna1 _3n8fnac7 _1i2djtb9 _1i2djt0 _9nihix56\"]")).click();
//
//        driver.get("https://demo.automationtesting.in/Register.html");
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Bhava");
//        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Dharani");
//
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(3000);
//        driver.findElement(By.name("username")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
//        driver.findElement(By.cssSelector("[type='submit']")).click();
//
//        driver.get("https://github.com/");
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//span[@class='flex-1']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='query-builder-test']")).sendKeys("Selenium");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//span[@class='ActionListItem-label text-normal']")).click();
//
//        driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//section[.='X Path']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//section[.='Login 3.0']")).click();
//        
//        driver.get("https://demowebshop.tricentis.com/");
//        Thread.sleep(2000);
//        List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
//        Thread.sleep(2000);
//
//        for (WebElement i : radio) {
//            i.click();
//            Thread.sleep(2000);
//        }
//
//        driver.quit();
//    }
//}
