package Testcases;

import org.testng.annotations.Test;

import genericutilies.BaseClass;
import genericutilies.ReadExcel;
import objectrepository.LoginPage;

public class ReadingDataFromExcel_Test extends BaseClass {
	@Test(dataProvider="test data",dataProviderClass=ReadExcel.class)
	public void readingData(String un, String pwd) {
		LoginPage log = new LoginPage(driver);
		log.getLoginlink().click();
		log.getEmail().sendKeys(un);
		log.getPassword().sendKeys(pwd);
		log.getLoginbutton().click();
		
		
	}

}
