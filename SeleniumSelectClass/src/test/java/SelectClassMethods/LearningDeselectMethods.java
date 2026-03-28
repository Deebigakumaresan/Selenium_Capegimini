package SelectClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDeselectMethods {
	public static void main(String[] args) throws InterruptedException{
		// Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
        
        Thread.sleep(4000);
        
        WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
        
        Select sel = new Select(dropdown);
        
        sel.selectByVisibleText("John Hardy Women's L...");
        sel.selectByVisibleText("Solid Gold Petite Mi...");
        sel.selectByVisibleText("White Gold Plated Pr...");
        sel.selectByVisibleText("Pierced Owl Rose Gol...");
        
        Thread.sleep(2000);
        // Deselect by index
        sel.deselectByIndex(6);
        Thread.sleep(2000);

        // Deselect by value
        sel.deselectByValue("John Hardy Women's Legends Naga Gold & Silver Dragon Station Chain Bracelet");
        Thread.sleep(2000);

        // Deselect by visible text
        sel.deselectByVisibleText("Solid Gold Petite Micropave");
        Thread.sleep(2000);
        
        sel.deSelectByContainsVisibleText("Pierced Owl Rose Gol...");
        
        sel.selectByVisibleText("John Hardy Women's L...");
        sel.selectByVisibleText("Solid Gold Petite Mi...");
        sel.selectByVisibleText("White Gold Plated Pr...");
        sel.selectByVisibleText("Pierced Owl Rose Gol...");
        
        sel.deselectAll();
        
	}
}
