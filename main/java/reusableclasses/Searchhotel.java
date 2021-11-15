package reusableclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel {
	public static WebDriver driver;
	@FindBy(id="location")
	private WebElement loction ;
	public Searchhotel(WebDriver driver2) {
		Searchhotel.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getLoction() {
		return loction;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getCheckindate() {
		return checkindate;
	}
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getChildren() {
		return children;
	}
	public WebElement getSearch() {
		return search;
	}
	@FindBy(id="hotels")
	private WebElement hotels  ;
	@FindBy(id="room_type")
	private WebElement roomtype  ;
	@FindBy(id="room_nos")
	private WebElement roomscount;
	public WebElement getRoomscount() {
		return roomscount;
	}
	@FindBy(id="datepick_in")
	private WebElement checkindate ;
	@FindBy(id="datepick_out")
	private WebElement checkoutdate ;
	@FindBy(id="adult_room")
	private WebElement adults  ;
	@FindBy(name="child_room")
	private WebElement children ;
	@FindBy(id="Submit")
	private WebElement search  ;
	@FindBy(id="radiobutton_0")
	private WebElement select;
	public WebElement getSelect() {
		return select;
	}
	@FindBy(id="continue")
	private WebElement continuepayment;
	public WebElement getContinuepayment() {
		return continuepayment;
	}

}
