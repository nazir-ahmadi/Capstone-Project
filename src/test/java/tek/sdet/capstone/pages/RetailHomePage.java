package tek.sdet.capstone.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.capstone.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id="signinLink")
	public WebElement signinbtn;
	
	@FindBy(id="accountLink")
	public WebElement account;
	
	@FindBy(id="hamburgerBtn")
	public WebElement AllSideBarBtn;
	
	@FindBy(xpath="//span[text()='Electronics']")
	public WebElement Electronics;
	
	@FindBy(xpath="//span[text()='Computers']")
	public WebElement Computers;
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement SmartHome;
	
	@FindBy(xpath="//span[text()='Sports']")
	public WebElement Sports;
	
	@FindBy(xpath="//span[text()='Automative']")
	public WebElement Automative;
	
	@FindBy(xpath="//span[text()='TV & Video']")
	public WebElement TVandVideo;
	
	@FindBy(xpath="//span[text()='Video Games']")
	public WebElement VideoGames;
	
	@FindBy(id="contentHeader")
	public WebElement Department;
	
	@FindBy(xpath="//span[text()='Accessories']")
	public WebElement Accessories;
	
	@FindBy(xpath="//span[text()='Networking']")
	public WebElement Networking;
	
	@FindBy(xpath="//span[text()='Smart Home Lightning']")
	public WebElement SmartHomeLightining;
	
	@FindBy(xpath="//span[text()='Plugs and Outlets']")
	public WebElement PlugsAndOutlets;
	
	@FindBy(xpath="//span[text()='Athletic Clothing']")
	public WebElement AthleticClothing;
	
	@FindBy(xpath="//span[text()='Exercise & Fitness']")
	public WebElement ExerciseFitness;
	
	@FindBy(xpath="//span[text()='Automative Parts & Accessories']")
	public WebElement AutomativePartsAndAccessories;
	
	@FindBy(xpath="//span[text()='MotorCycle & Powersports']")
	public WebElement MotorCycleAndPowerSports;
	
	@FindBy(id="search")
	public WebElement AllDepartmentDropDownBtn;
	
	@FindBy(xpath="//option[text()='Smart Home']")
	public WebElement SmartHomeDropDown;
	
	@FindBy(id="searchInput")
	public WebElement SearchInput;
	
	@FindBy(id="searchBtn")
	public WebElement SearchButton;
	
	@FindBy(xpath="//select[@class=\"product__select\"]")
	public WebElement SelectQuantityBtn;
	
	@FindBy(id="addToCartBtn")
	public WebElement AddToCartButton;
	
	@FindBy(xpath="//span[@class='top-nav__cart-quantity']")
	public WebElement CartQuantity;
	
	@FindBy(xpath="//p[@class=\"products__name\"]")
	public WebElement ItemsImage;
	
	@FindBy(id="cartBtn")
	public WebElement Cart;
	
	@FindBy(id="proceedBtn")
	public WebElement ProceedToCheckOut;
	
	@FindBy(id="placeOrderBtn")
	public WebElement PlaceYourOrderBtn;
	
	@FindBy(id="addAddressBtn")
	public WebElement AddaNewAddress;
	
	@FindBy(id="addPaymentBtn")
	public WebElement AddNewPaymentMethod;
	
	@FindBy(xpath="//p[text()='Order Placed, Thanks']")
	public WebElement OrderPlacedSuccessMsg;
	
	@FindBy(id="orderLink")
	public WebElement OrderLink;
	
}
