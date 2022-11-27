package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id="accountLink")
	public WebElement accountSign;
	
	@FindBy(id="nameInput")
	public WebElement nameField;
	
	@FindBy(id="personalPhoneInput")
	public WebElement PhoneNumberField;
	
	@FindBy(id="personalUpdateBtn")
	public WebElement UpdateBtn;
	
	@FindBy(xpath="//div[@class=\"Toastify\"]")
	public WebElement UpdateConfirmedMsg;
	
	@FindBy(id="previousPasswordInput")
	public WebElement PreviousPassword;
	
	@FindBy(id="newPasswordInput")
	public WebElement NewPassword;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement ConfirmedNewPassword;
	
	@FindBy(id="credentialsSubmitBtn")
	public WebElement ChangedPasswordBtn;
	
	@FindBy(xpath="//div[text()='Password Updated Successfully']")
	public WebElement SuccessMsg;
	
	@FindBy(xpath="//div[text()='Add a payment method']")
	public WebElement PaymentMethodLink;
	
	@FindBy(id="cardNumberInput")
	public WebElement cardNumber;
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCardInput;
	
	@FindBy(id="expirationMonthInput")
	public WebElement ExpirationMonthInput;
	
	@FindBy(xpath="//option[text()='12']")
	public WebElement ExpirationMonth;
	
	@FindBy(id="expirationYearInput")
	public WebElement ExpirationYearInput;
	
	@FindBy(xpath="//option[text()='2024']")
	public WebElement ExpirationYear;
	
	@FindBy(id="securityCodeInput")
	public WebElement CcvCodeInput;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement AddYourCardBtn;
	
	@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
	public WebElement CardAddedSuccessfullyMsg;
	
	@FindBy(xpath="//div[@class=\"account__payment-image-wrapper\"]")
	public WebElement CardOnFile;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement CardEditBtn;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement UpdateCardBtn;
	
	@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
	public WebElement UpdateCardSuccessMsg;
	
	@FindBy(xpath="//button[text()='remove']")
	public WebElement RemoveCardBtn;
	
	@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
	public WebElement RemoveCardSuccessMsg;
	
	@FindBy(xpath="//div[@class=\"account__address-new\"]")
	public WebElement AddAddressBtn;
	
	@FindBy(id="countryDropdown")
	public WebElement Country;
	
	@FindBy(id="fullNameInput")
	public WebElement NameFieldInput;
	
	@FindBy(id="phoneNumberInput")
	public WebElement PhoneNumberFieldInput;
	
	@FindBy(id="streetInput")
	public WebElement StreetAddressInputField;
	
	@FindBy(id="apartmentInput")
	public WebElement ApartmentInputField;
	
	@FindBy(id="cityInput")
	public WebElement CityInputField;
	
	@FindBy(xpath="//select[contains(@name, 'state')]")
	public WebElement StateDropDown;
	
	@FindBy(id="zipCodeInput")
	public WebElement ZipCodeFieldInput;
	
	@FindBy(id="addressBtn")
	public WebElement AddYourAddressBtn;
	
	@FindBy(xpath="//div[text()='Address Added Successfully']")
	public WebElement AddressAddedSuccessMsg;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement AddressEditBtn;
	
	@FindBy(id="addressBtn")
	public WebElement UpdateYourAddressBtn;

	@FindBy(xpath="//div[text()='Address Updated Successfully']")
	public WebElement AddressUpdatedSuccessMsg;
	
	@FindBy(xpath="//option[text()='United States']")
	public WebElement EditedCountry;
	
	@FindBy(xpath="//option[text()='California']")
	public WebElement EditedState;
	
	@FindBy(xpath="//button[text()='Remove']")
	public WebElement RemoveAddressBtn;
}




