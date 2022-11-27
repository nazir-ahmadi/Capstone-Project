package tek.sdet.capstone.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.capstone.pages.POMFactory;
import tek.sdet.capstone.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		factory.homePage().OrderLink.click();
		logger.info("Order link was clicked");
	}
	
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		factory.orderPage().CancelTheOrderBtn.click();
		logger.info("Cancel The Order Button Was Clicked");
	}
	
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReasonBoughtWrongItem(String data) {
		selectByVisibleText(factory.orderPage().CancelReasonInput,data);
		logger.info("Reason was chosen");
	}
	
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		factory.orderPage().CancelOrderButton.click();
		logger.info("Cancel Order was clicked again");
	}
	
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().OrderCancelSuccessMsg));
		logger.info("Order Cancelation msg was displayed");
	}

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		factory.orderPage().ReturnItemBtn.click();
		logger.info("Return Item Button was clicked");
	}
	
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReasonItemDamaged(String string) {
		selectByVisibleText(factory.orderPage().CancelReasonInput,string);
		logger.info("Reason for return was chosen");
	}
	
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffServiceFedEx(String string) {
		selectByVisibleText(factory.orderPage().DropOffLocation,string);
		logger.info("Drop off location was chosen");
	}
	
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		factory.orderPage().CancelOrderButton.click();
		logger.info("Return Order was clicked");
	}
	
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().OrderReturnSuccessMsg));
		logger.info("Order Return Success message was displayed");
	}

	@When("User click on Review button")
	public void userClickOnReviewButton() {
		factory.orderPage().ReviewButton.click();
		logger.info("Review Button was clicked");
	}
	
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText(String headline, String review) {
		sendText(factory.orderPage().AddHeadline,headline);
		sendText(factory.orderPage().AddReview,review);
		logger.info("Head line and Review was added");
	}
	
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		factory.orderPage().AddYourReviewButton.click();
		logger.info("Add your review button was clicked");
	}
	
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
		waitTillPresence(factory.orderPage().ReviewSuccessMsg);
		logger.info("Review Success message was displayed");
	}







}
