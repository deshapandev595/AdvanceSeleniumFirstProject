package LauchTheBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_Test {
	@Test
	public void launchEpfo()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.epfindia.gov.in/site_en/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
		
	}
}
