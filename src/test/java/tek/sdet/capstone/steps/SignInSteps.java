package tek.sdet.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;


public class SignInSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info( actualTitle + " is equal to "+ expectedTitle);
	}
	
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signinbtn);
		logger.info("User clicked on sign in option"); 
	}
	
	
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField,email);
		sendText(factory.signInPage().passwordField,password);
		logger.info("user entered email " + email + " and password " + password);	   
	}
	
	
	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().logingButton);
		logger.info("user clicked on login button");
	}
	
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().account));
		logger.info("user logged in into account");    
	}
	
	@When("User click on Create New Account button")
	public void userClickOncreateNewAccountButton() {
		click(factory.signInPage().newAccountBtn1);
		logger.info("User clicked on create new account button");
	}
	
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWothBewlowData(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class,String.class);
		sendText(factory.signInPage().nameInput1,signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailInput1,signUpData.get(0).get("email"));
		sendText(factory.signInPage().passwordInput1,signUpData.get(0).get("password"));
        sendText(factory.signInPage().confirmPasswordInput1,signUpData.get(0).get("confirmPassword"));
        logger.info("user entered required information into sign up form");  
	}
	
	@When("User click on SignUp button")
    public void userClickOnSignupButton() {
		click(factory.signInPage().signUpBtn);
    	logger.info("Account was created");	
    	}
	
    @Then("User should be logged into account page")
    public void userShouldBeLoggedIntoAccountPage() {
        Assert.assertTrue(isElementDisplayed(factory.accountPage().accountSign));
        logger.info("Account was created");
        }
	
}