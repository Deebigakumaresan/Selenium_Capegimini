package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TC1 {

@Test
public void completePurchaseFlow() throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.saucedemo.com/");

// Login
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();

// Validate product page
System.out.println("Page Title: " + driver.getTitle());

// Add product to cart
driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

// Open cart
driver.findElement(By.className("shopping_cart_link")).click();

// Verify cart item
String cartItem = driver.findElement(By.className("inventory_item_name")).getText();
System.out.println("Product in Cart: " + cartItem);

// Checkout
driver.findElement(By.id("checkout")).click();

// Enter checkout information
driver.findElement(By.id("first-name")).sendKeys("Deebiga");
driver.findElement(By.id("last-name")).sendKeys("RK");
driver.findElement(By.id("postal-code")).sendKeys("600001");

// Continue checkout
driver.findElement(By.id("continue")).click();

// Validate price
String price = driver.findElement(By.className("summary_total_label")).getText();
System.out.println("Total Price: " + price);

// Complete order
driver.findElement(By.id("finish")).click();

// Logout
driver.findElement(By.id("react-burger-menu-btn")).click();
Thread.sleep(2000);
driver.findElement(By.id("logout_sidebar_link")).click();

// Close browser
driver.quit();
}
}