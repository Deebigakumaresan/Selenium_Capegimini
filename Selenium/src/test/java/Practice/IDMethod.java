package Practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class IDMethod {



public static void main(String[] args) throws InterruptedException {

     WebDriver driver = new ChromeDriver();

     driver.get("https://www.google.com/");

     Thread.sleep(2000);

     driver.findElement(By.id("APjFqb")).sendKeys("mango");
     Thread.sleep(2000);
     
     //driver.get("https://www.amazon.com/");
     
     //Thread.sleep(2000);
     
     //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dresses");
     
     //Thread.sleep(2000);
     
     driver.get("https://www.flipkart.com/");
     
     Thread.sleep(2000);
     
     //driver.findElement(By.id("_YAifaerUDqKa4-EPz7XGaA_15")).click();
     
     //Thread.sleep(2000);
     
     driver.findElement(By.name("q")).sendKeys("perfume");
     
     driver.get("https://www.youtube.com/");
     
     Thread.sleep(2000);
     
     driver.findElement(By.name("search_query")).sendKeys("find");
     
     Thread.sleep(2000);
     
     driver.get("https://demoapps.qspiders.com/ui?scenario=1");
     
     Thread.sleep(2000);
     
     driver.findElement(By.id("name")).sendKeys("Keerthi");
     
     Thread.sleep(2000);
     
    // driver.get("https://www.geeksforgeeks.org/java/java/");
     
     //Thread.sleep(2000);
     
     //driver.findElement(By.id("ewdxb78")).sendKeys("class");
     
     driver.get("https://www.hotstar.com/in/explore");
     
     Thread.sleep(1000);
     
     driver.findElement(By.id("searchBar")).sendKeys("love");
     
     driver.get("https://www.oracle.com/");
     
     Thread.sleep(1000);
     
     driver.findElement(By.id("u38searchinput")).sendKeys("nextwhat");
     
     driver.get("https://www.mysql.com/");
     
     Thread.sleep(1000);
     
     driver.findElement(By.id("l1-search-input")).sendKeys("latest");
     
     driver.get("https://www.instagram.com/");
     
     Thread.sleep(1000);
     
     driver.findElement(By.name("email")).sendKeys("latest");
   
   
   
}



}

