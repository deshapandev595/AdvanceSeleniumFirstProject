package Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutilies.BaseClass;
import genericutilies.UtilityClass;
import objectrepository.LoginPage;
import objectrepository.SearchProduct;

public class TC_DWS_02_Test extends BaseClass {
	@Test
	public void search_product() throws IOException {
		String Expected_title = "Demo Web Shop";
		LoginPage log = new LoginPage(driver);
		SearchProduct sp = new SearchProduct(driver);
		UtilityClass uc = new UtilityClass();
		log.getLoginlink().click();
		Reporter.log("clicked on the login link",true);
			
		log.getEmail().sendKeys(uc.propertyFileReader("email"));
		Reporter.log("email adress is entered successfully",true);
		assertEquals(uc.propertyFileReader("email"), log.getEmail().getAttribute("value"));
		
		log.getPassword().sendKeys(uc.propertyFileReader("password"));
		Reporter.log("password entered successfully",true);
		assertEquals(uc.propertyFileReader("password"), log.getEmail().getAttribute("value"));
		
		log.getLoginbutton().click();
		Reporter.log("clicked on the login link",true);
		assertNotEquals(Expected_title, driver.getTitle(),"Test case failed");
		
		sp.getsearchBar().sendKeys(uc.propertyFileReader("book"));
		Reporter.log("prduct name has been entered",true);
		assertEquals(uc.propertyFileReader("book"), log.getEmail().getAttribute("value"));
		
		sp.getsearchButton().click();
		Reporter.log("clicked on the search button",true);
		
		
		
	}
	
	
	
			

}
