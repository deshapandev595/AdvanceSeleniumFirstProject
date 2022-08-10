package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutilies.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Log in")
	private WebElement LoginLink;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	 
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;
	
	public WebElement getLoginlink() {
		return LoginLink;
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginbutton() {
		return loginbutton;
		
	}
	

}
