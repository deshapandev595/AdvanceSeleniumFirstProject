package Demowebshoptestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addtocart_Test {

	@Test
	public void cart() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		driver.findElement(By.id("small-searchterms")).sendKeys("Health book");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button-22")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("//span[text()='Shopping cart']")).click();
		Thread.sleep(3000);
		driver.close();
	}
	
}
