package reusableclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public static WebDriver driver;
	@FindBy(id="first_name")
    private WebElement firstname ;
	public Payment(WebDriver driver2) {
		Payment.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditcardno() {
		return creditcardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpirymonth() {
		return expirymonth;
	}
	public WebElement getExpiryyear() {
		return expiryyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	@FindBy(id="last_name")
	private WebElement lastname ;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement creditcardno ;
	@FindBy(id="cc_type")
	private WebElement cardtype ;
	@FindBy(id="cc_exp_month")
	private WebElement expirymonth ;
	@FindBy(id="cc_exp_year")
	private WebElement expiryyear ;
	@FindBy(id="cc_cvv")
	private WebElement cvv ;
	@FindBy(id="book_now")
	private WebElement booknow;
	public WebElement getBooknow() {
		return booknow;
	}
	@FindBy(name="my_itinerary")
	private WebElement itinerary;
	public WebElement getItinerary() {
		return itinerary;
		}
	@FindBy(id="logout")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	
}
