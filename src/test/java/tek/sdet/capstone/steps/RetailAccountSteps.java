package tek.sdet.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().account);
		logger.info("User Clicked on account button");
	    
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameNameValueAndPhonePhoneValue(String NameValue, String NumberValue) {
		factory.accountPage().nameField.clear();
		sendText(factory.accountPage().nameField,NameValue);
		factory.accountPage().PhoneNumberField.clear();
		sendText(factory.accountPage().PhoneNumberField,NumberValue);
		logger.info("User Changed his "+NameValue+ "And his "+NumberValue);
		
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().UpdateBtn);
		logger.info("Update Button was clicked");
	    
	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		factory.accountPage().UpdateConfirmedMsg.isDisplayed();
		logger.info("The Confirmation message was displayed");
	     
	}
	

	@When("User enter below information")
	public void userEnterBelowInformation(DataTable data ) {
		List<Map<String, String>> changePasswordData = data.asMaps(String.class,String.class);
		sendText(factory.accountPage().PreviousPassword,changePasswordData.get(0).get("previousPassword"));
		sendText(factory.accountPage().NewPassword,changePasswordData.get(0).get("newPassword"));
		sendText(factory.accountPage().ConfirmedNewPassword,changePasswordData.get(0).get("confirmPassword"));
		logger.info("New Password was typed in");
	}
	
	
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().ChangedPasswordBtn);
		logger.info("Password update button was clicked");
	    
	}
	
	
	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().SuccessMsg);
	    logger.info("The password was updated and success msg was displayed");
	    }


	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		clickElementWithJS(factory.accountPage().PaymentMethodLink);
		logger.info("Payment method link was clicked but it does not perform any action");
	   
	}
	
	
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String, String>> addCreditCard = data.asMaps(String.class,String.class);
		sendText(factory.accountPage().cardNumber,addCreditCard.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput,addCreditCard.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().ExpirationYearInput,addCreditCard.get(0).get("expirationYear"));
		selectByVisibleText(factory.accountPage().ExpirationMonthInput,addCreditCard.get(0).get("expirationMonth"));
		sendText(factory.accountPage().CcvCodeInput,addCreditCard.get(0).get("securityCode"));
		logger.info("Credit Card Information were added");
	}
	
	
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().AddYourCardBtn);
	    logger.info("Add Your Card button was clicked");
	}
	
	
	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
	   waitTillPresence(factory.accountPage().CardAddedSuccessfullyMsg);
	   logger.info("The success message was displayed");
	}
	
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {  
		clickElementWithJS(factory.accountPage().CardOnFile);
		click(factory.accountPage().CardEditBtn);
		logger.info("User clicked on card on file and clicked on Edit button");
	}
	
	
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {  
		List<Map<String, String>> addCreditCard = data.asMaps(String.class,String.class);
		factory.accountPage().cardNumber.clear();
		sendText(factory.accountPage().cardNumber,addCreditCard.get(0).get("cardNumber"));
		factory.accountPage().nameOnCardInput.clear();
		sendText(factory.accountPage().nameOnCardInput,addCreditCard.get(0).get("nameOnCard"));
		click(factory.accountPage().ExpirationMonthInput);
		click(factory.accountPage().ExpirationMonth);
		click(factory.accountPage().ExpirationYearInput);
		click(factory.accountPage().ExpirationYear);
		factory.accountPage().CcvCodeInput.clear();
		sendText(factory.accountPage().CcvCodeInput,addCreditCard.get(0).get("securityCode"));
		logger.info("Credit Card Information were edited");
	}
	
	
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {  
		click(factory.accountPage().UpdateCardBtn);
		logger.info("Update Your Card button was clicked");
	}
	
	
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {  
		waitTillPresence(factory.accountPage().UpdateCardSuccessMsg);
		logger.info("Card Updated Success message was displayed");
	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		clickElementWithJS(factory.accountPage().CardOnFile);
		click(factory.accountPage().RemoveCardBtn);
		logger.info("Remove button was clicked");
	    
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		logger.info("Payment method/card on file is deleted");   
	}

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		clickElementWithJS(factory.accountPage().AddAddressBtn);
		logger.info("Add Address box was clicked");
	}
	
	
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String>> addAddressData = data.asMaps(String.class,String.class);
//		click(factory.accountPage().Country);
//		click(factory.accountPage().SelectedCountry);
		selectByVisibleText(factory.accountPage().Country,addAddressData.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().NameFieldInput);
		sendText(factory.accountPage().NameFieldInput,addAddressData.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().PhoneNumberFieldInput);
		sendText(factory.accountPage().PhoneNumberFieldInput,addAddressData.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().StreetAddressInputField);
		sendText(factory.accountPage().StreetAddressInputField,addAddressData.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().ApartmentInputField);
		sendText(factory.accountPage().ApartmentInputField,addAddressData.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().CityInputField);
		sendText(factory.accountPage().CityInputField,addAddressData.get(0).get("city"));
		selectByVisibleText(factory.accountPage().StateDropDown,addAddressData.get(0).get("state"));
		sendText(factory.accountPage().ZipCodeFieldInput,addAddressData.get(0).get("zipCode"));
		logger.info("All required fields are filled");
	}
	
	
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {  
		click(factory.accountPage().AddYourAddressBtn);
		logger.info("Add your Address button was clicked");
	}
	
	
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		waitTillPresence(factory.accountPage().AddressAddedSuccessMsg);
		logger.info("Address added successfully message was displayed");
	}
	

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		clickElementWithJS(factory.accountPage().AddressEditBtn);
		logger.info("Edit Address text was clicked");
	}

	@When("user fill edited address form with below information")
	public void userFillEditedAddressFormWithBelowInformation(DataTable data) {
		List<Map<String, String>> EditAddressData = data.asMaps(String.class,String.class);
		selectByVisibleText(factory.accountPage().Country,EditAddressData.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().NameFieldInput);
		sendText(factory.accountPage().NameFieldInput,EditAddressData.get(0).get("fullName"));
		factory.accountPage().PhoneNumberFieldInput.clear();
		sendText(factory.accountPage().PhoneNumberFieldInput,EditAddressData.get(0).get("phoneNumber"));
		factory.accountPage().StreetAddressInputField.clear();
		sendText(factory.accountPage().StreetAddressInputField,EditAddressData.get(0).get("streetAddress"));
		factory.accountPage().ApartmentInputField.clear();
		sendText(factory.accountPage().ApartmentInputField,EditAddressData.get(0).get("apt"));
		factory.accountPage().CityInputField.clear();
		sendText(factory.accountPage().CityInputField,EditAddressData.get(0).get("city"));
		click(factory.accountPage().StateDropDown);
		click(factory.accountPage().EditedState);
		factory.accountPage().ZipCodeFieldInput.clear();
		sendText(factory.accountPage().ZipCodeFieldInput,EditAddressData.get(0).get("zipCode"));
		logger.info("All required fields are filled");
	}


	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().UpdateYourAddressBtn);
		logger.info("Update Your Address button was clicked");
	}
	
	
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().AddressUpdatedSuccessMsg);
		logger.info("Address update success message was displayed");
	}
	

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().RemoveAddressBtn);
		logger.info("Remove address button was clicked");
	 
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		logger.info("Address was removed" );
	}















}
