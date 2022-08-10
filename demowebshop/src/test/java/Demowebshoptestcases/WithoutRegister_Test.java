package Demowebshoptestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutRegister_Test {
	@Test
	public void withoutRegister() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(4000);
		driver.close();
				
	}
	
}
