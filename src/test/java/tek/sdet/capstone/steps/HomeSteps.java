package tek.sdet.capstone.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	

	@When("User click on All section")
	public void userClickOnAllSection() {
		factory.homePage().AllSideBarBtn.click();
	}
	
	
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().Electronics));
		Assert.assertTrue(isElementDisplayed(factory.homePage().Computers));
		Assert.assertTrue(isElementDisplayed(factory.homePage().SmartHome));
		Assert.assertTrue(isElementDisplayed(factory.homePage().Sports));
		Assert.assertTrue(isElementDisplayed(factory.homePage().Automative));
		logger.info("Side bar drop down list was verified" );
	}
	

	@When("User on Electronics")
	public void userOnElectronics() {
		factory.homePage().Electronics.click();
	}
	@Then("below options are present in Electronics")
	public void belowOptionsArePresentInElectronics(DataTable data) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().TVandVideo));
		Assert.assertTrue(isElementDisplayed(factory.homePage().VideoGames));
	}
	
	@When("User on Computers")
	public void userOnComputers() {
		factory.homePage().Computers.click();
	}
	@Then("below options are present in Computers")
	public void belowOptionsArePresentInComputers(DataTable data) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().Accessories));
		Assert.assertTrue(isElementDisplayed(factory.homePage().Networking));
	}
	
	
	@When("User on Smart Home")
	public void userOnSmartHome() {
		factory.homePage().SmartHome.click();
	}
	@Then("below options are present in Smart Home")
	public void belowOptionsArePresentInSmartHome(DataTable data) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().SmartHomeLightining));
		Assert.assertTrue(isElementDisplayed(factory.homePage().PlugsAndOutlets));
	}
	
	@When("User on Sports")
	public void userOnSports() {
		factory.homePage().Sports.click();
	}
	@Then("below options are present in Sports")
	public void belowOptionsArePresentInSports(DataTable data) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().AthleticClothing));
		Assert.assertTrue(isElementDisplayed(factory.homePage().ExerciseFitness));
	}
	
	@When("User on Automotive")
	public void userOnAutomotive() {
		factory.homePage().Automative.click();
	}
	@Then("below options are present in Automotive")
	public void belowOptionsArePresentInAutomotive(DataTable data) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().AutomativePartsAndAccessories));
		Assert.assertTrue(isElementDisplayed(factory.homePage().MotorCycleAndPowerSports));
	}
	

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
		selectByVisibleText(factory.homePage().AllDepartmentDropDownBtn,string);
		//sendText(factory.homePage().AllDepartmentDropDownBtn,string);
		//sendText(factory.homePage().SmartHomeDropDown,string); 
		logger.info("User Change the category");
	}
	
	
	@When("User search for an item {string}")
	public void userSearchForAnItem(String string) {
		sendText(factory.homePage().SearchInput,string);
		logger.info("User searched for the desiered Item");
	}
	
	
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
	click(factory.homePage().SearchButton);
	logger.info("User clicked on search Icon");
	}
	
	
	@When("User click on items {string}")
	public void userClickOnItemItems(String string) {
		factory.homePage().ItemsImage.click();
		logger.info("Item is found and User clicked on its image");
	}
	
	
	@When("User select quantity {string}")
	public void userSelectQuantity(String qty) {
		selectByVisibleText(factory.homePage().SelectQuantityBtn,qty);
		logger.info("User selected desiered quantity");
	}
	
	
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
	   factory.homePage().AddToCartButton.click();
	   logger.info("User clicked on add to cart button");
	}
	
	
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String conQty) {
	Assert.assertEquals(factory.homePage().CartQuantity.getText(),conQty);		
	}


	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		factory.homePage().Cart.click();
		logger.info("Cart Button Was Clicked");
	}
	
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		factory.homePage().ProceedToCheckOut.click();
		logger.info("Proceed to Checkout Button Was Clicked");
	}
	
	@Then("User should not be able to place an order without an address and payment method on file and selected for this order")
	public void userShouldNotBeAbleToPlaceAnOrderWithoutAnAddressAndPaymentMethodOnFileAndSelectedForThisOrder() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().PlaceYourOrderBtn));
		logger.info("Place Your Order Button is disabled, Customer can not place an order without address and payment method on file");
	}


	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		factory.homePage().AddaNewAddress.click();
		logger.info("Add a New Address was clicked");
	}
	
	
	@Then("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> addAddressData = dataTable.asMaps(String.class,String.class);
		selectByVisibleText(factory.accountPage().Country,addAddressData.get(0).get("country"));
		sendText(factory.accountPage().NameFieldInput,addAddressData.get(0).get("fullName"));
		sendText(factory.accountPage().PhoneNumberFieldInput,addAddressData.get(0).get("phoneNumber"));
		sendText(factory.accountPage().StreetAddressInputField,addAddressData.get(0).get("streetAddress"));
		sendText(factory.accountPage().ApartmentInputField,addAddressData.get(0).get("apt"));
		sendText(factory.accountPage().CityInputField,addAddressData.get(0).get("city"));
		selectByVisibleText(factory.accountPage().StateDropDown,addAddressData.get(0).get("state"));
		sendText(factory.accountPage().ZipCodeFieldInput,addAddressData.get(0).get("zipCode"));
		logger.info("New shipping address was added");
	}
	
	
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		clickElementWithJS(factory.homePage().AddNewPaymentMethod);
		logger.info("Add a Credit or Debit Card button was clicked");
	}
	
	
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		factory.homePage().PlaceYourOrderBtn.click();
		logger.info("Order was placed");
	}
	
	
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().OrderPlacedSuccessMsg));
		logger.info("Order Placed message was displayed");
	}

	



}
