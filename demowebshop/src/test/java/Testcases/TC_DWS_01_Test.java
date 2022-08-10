package Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutilies.BaseClass;
import genericutilies.UtilityClass;
import objectrepository.LoginPage;

public class TC_DWS_01_Test extends  BaseClass{
	@Test
	public void login_through_valid_credentials() throws IOException {
		String Expected_title = "Demo Web Shop";
			
		LoginPage log = new LoginPage(driver);
		UtilityClass uc = new UtilityClass();
		
		log.getLoginlink().click();
		Reporter.log("clicked on login button",true);
		assertEquals(false, true);
		
		log.getEmail().sendKeys(uc.propertyFileReader("email"));
		Reporter.log("successfully entered email address",true);
		assertEquals(uc.propertyFileReader("email"),log.getEmail().getAttribute("value"),"email address is not proper");
		
		log.getPassword().sendKeys(uc.propertyFileReader("password"));
		Reporter.log("successfully etered password",true);
		assertEquals(uc.propertyFileReader("password"),log.getPassword().getAttribute("value"),"password not found");
		
		log.getLoginbutton().click();
		Reporter.log("successfully loged in to the application",true);
		assertNotEquals(Expected_title, driver.getTitle(),"Test case failed");
	}

}
