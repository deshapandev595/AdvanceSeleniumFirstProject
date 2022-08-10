package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilies.BaseClass;

public class VerifyinAddtocart {
	public  VerifyinAddtocart (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "add-to-cart-button-36")
	private WebElement adcart;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement gotoaddcart;
	
	public WebElement getadcart() {
		return adcart;
	}

	public WebElement getgotoaddcart() {
		return gotoaddcart;
	}
}
