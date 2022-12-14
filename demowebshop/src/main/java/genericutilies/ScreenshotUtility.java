package genericutilies;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	public static void takingScreenshot(WebDriver driver,String Screenshot) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File ss = screenshot.getScreenshotAs(OutputType.FILE);
		String ldt = LocalDateTime.now().toString().replace(':', '-');
		
		File file = new File("./Errorscreenshot/"+Screenshot+""+ldt+".png");
		FileUtils.copyFile(ss, file);
	}
	

}
