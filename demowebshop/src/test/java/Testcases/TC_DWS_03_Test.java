package Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.testng.Reporter;

import genericutilies.BaseClass;
import genericutilies.UtilityClass;
import objectrepository.AddtoCart;
import objectrepository.LoginPage;
import objectrepository.SearchProduct;

public class TC_DWS_03_Test extends BaseClass{
	public void add_to_cart() throws IOException {
		String Expected_title = "Demo Web Shop";
		LoginPage log = new LoginPage(driver);
		SearchProduct search = new SearchProduct(driver);
		AddtoCart add = new AddtoCart(driver);
		UtilityClass uc = new UtilityClass();
		
		log.getLoginlink().click();
		Reporter.log("clicked on the login link",true);
		
		log.getEmail().sendKeys(uc.propertyFileReader("email"));
		Reporter.log("email adress is entered successfully",true);
		assertEquals(uc.propertyFileReader("email"), log.getEmail().getAttribute("value"));
		
		log.getPassword().sendKeys(uc.propertyFileReader("password"));
		Reporter.log("password entered successfully",true);
		assertEquals(uc.propertyFileReader("password"), log.getEmail().getAttribute("value"));
		
		log.getLoginlink().click();
		Reporter.log("clicked on the login link",true);
		assertNotEquals(Expected_title, driver.getTitle(),"Test case failed");
		
		search.getsearchBar().sendKeys(uc.propertyFileReader("book"));
		Reporter.log("Product name is entered successfully",true);
		assertEquals(uc.propertyFileReader("book"), log.getEmail().getAttribute("value"));
		
		search.getsearchButton().click();
		Reporter.log("product is searched successfully",true);
		
		add.getaddtoCart().click();
		Reporter.log("product is searched successfully",true);
	
		
		
		
	}

}
