package Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutilies.BaseClass;
import genericutilies.UtilityClass;
import objectrepository.AddtoCart;
import objectrepository.LoginPage;
import objectrepository.SearchProduct;
import objectrepository.VerifyinAddtocart;

public class TC_DWS_04_Test extends BaseClass {
	@Test
	public void adding_to_shoppingcart() throws IOException {
		String Expected_title = "Demo Web Shop";
		LoginPage log = new LoginPage(driver);
		SearchProduct search = new SearchProduct(driver);
		AddtoCart add = new AddtoCart(driver);
		UtilityClass uc = new UtilityClass();
		VerifyinAddtocart vf = new VerifyinAddtocart(driver);
		
		log.getLoginlink().click();
		Reporter.log("clicked on login button",true);
		
		log.getEmail().sendKeys(uc.propertyFileReader("email"));
		Reporter.log("successfully entered email address",true);
		assertEquals(uc.propertyFileReader("email"),log.getEmail().getAttribute("value"),"email address is not proper");
		
		log.getPassword().sendKeys(uc.propertyFileReader("password"));
		Reporter.log("password entered successfully",true);
		assertEquals(uc.propertyFileReader("password"), log.getEmail().getAttribute("value"));

		log.getLoginlink().click();
		Reporter.log("successfully loged in to the application",true);
		assertNotEquals(Expected_title, driver.getTitle(),"Test case failed");
		
		search.getsearchBar().sendKeys(uc.propertyFileReader("jeans"));
		Reporter.log("Product name is entered successfully",true);
		assertEquals(uc.propertyFileReader("book"), log.getEmail().getAttribute("value"));
		
		search.getsearchButton().click();
		Reporter.log("product is searched successfully",true);
		
		vf.getadcart().click();
		Reporter.log("product is added successfully",true);
		
		vf.getgotoaddcart().click();
		Reporter.log("product is added in to shopping cart successfully",true);	
	}

}
