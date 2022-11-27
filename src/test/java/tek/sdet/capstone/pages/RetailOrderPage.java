package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="cancelBtn")
	public WebElement CancelTheOrderBtn;

	@FindBy(id="reasonInput")
	public WebElement CancelReasonInput;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement CancelOrderButton;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement OrderCancelSuccessMsg;
	
	@FindBy(id="returnBtn")
	public WebElement ReturnItemBtn;
	
	@FindBy(id="dropOffInput")
	public WebElement DropOffLocation;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement OrderReturnSuccessMsg;
	
	@FindBy(id="reviewBtn")
	public WebElement ReviewButton;
	
	@FindBy(id="headlineInput")
	public WebElement AddHeadline;
	
	@FindBy(id="descriptionInput")
	public WebElement AddReview;
	
	@FindBy(id="reviewSubmitBtn")
	public WebElement AddYourReviewButton;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement ReviewSuccessMsg;
	
	
	
	
	
}
