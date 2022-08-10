package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilies.BaseClass;

public class SearchProduct  extends BaseClass{
public SearchProduct(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(id = "small-searchterms")
private WebElement searchbar;

@FindBy(xpath = "//input[@type='submit']")
private WebElement searchBotton;

public WebElement getsearchBar() {

	return searchbar;
}

public WebElement getsearchButton() {
return 	searchBotton;
}
}
