package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 import tek.sdet.capstone.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id="email")
	public WebElement emailField;
	
	
	@FindBy(id="password")
	public WebElement passwordField;
	
	@FindBy(id="loginBtn")
	public WebElement logingButton;
	
	@FindBy(id="newAccountBtn")
	public WebElement newAccountBtn1;

	@FindBy(id="nameInput")
	public WebElement nameInput1;
	
	@FindBy(id="emailInput")
	public WebElement emailInput1;

	@FindBy(id="passwordInput")
	public WebElement passwordInput1;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPasswordInput1;
	
	@FindBy(id="signupBtn")
	public WebElement signUpBtn;	
	
}
