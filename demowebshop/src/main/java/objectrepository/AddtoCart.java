package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilies.BaseClass;

public class AddtoCart extends BaseClass {
	public AddtoCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//input[@type='button'])[3]")
	private WebElement addcart;

	
	
	public WebElement getaddtoCart() {
		return addcart;
	}

}
