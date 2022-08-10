package Demowebshoptestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAndWishlist {
	@Test
	public void wishlist()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("radhey@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("karn123");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("small-searchterms")).sendKeys("Health book");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("add-to-wishlist-button-22")).click();
		driver.close();
	}

}
