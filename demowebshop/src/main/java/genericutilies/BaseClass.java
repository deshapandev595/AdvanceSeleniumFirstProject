package genericutilies;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	Reporter.log("Browser is laucnhed",true);
	
	driver.manage().window().maximize();
	Reporter.log("Window is maximized",true);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	@BeforeMethod
	public void navigateApp() {
		
		driver.get("http://demowebshop.tricentis.com/");
		Reporter.log("Navigated to application",true);
	}
	
	@AfterMethod
	public void logout(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			ScreenshotUtility.takingScreenshot(driver, result.getName());
		}
	System.out.println("logout from the app");
	Reporter.log("Logged out from application",true);
	}
	 
	@AfterSuite
	public void tearDownBrowser() {
		driver.quit();
		Reporter.log("Quitted the browser",true);
	}

}
