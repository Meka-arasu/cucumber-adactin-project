package com.stepdefinition.com;

import org.openqa.selenium.WebDriver;

import com.Runner.com.Adactinrunner;
import com.helper.com.FileReaderManager;
import com.helper.com.Pommanager;

import cucumber.api.java.en.*;
import reusableclasses.Baseclass;

public class Stepdefinition extends Baseclass {
	public static WebDriver driver = Adactinrunner.driver;
	Pommanager pom = new Pommanager(driver);
  
	@Given("^: User launch the application$")
	public void user_launch_the_application() throws Throwable {
	    String url1 = FileReaderManager.getInstanceCR().getUrl();
	    get_url(url1);
	}

	@When("^User enters the valid username in the username field$")
	public void user_enters_the_valid_username_in_the_username_field() throws Throwable {
		String username = FileReaderManager.getInstanceCR().username();
       input_value(pom.loginmain().getUsername(), username);
	}

	@When("^user enters the valid password$")
	public void user_enters_the_valid_password() throws Throwable {
		String password = FileReaderManager.getInstanceCR().password();

      input_value(pom.loginmain().getPassword(),password);
	}

	@Then("^:user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {

		click_element(pom.loginmain().getLogin());

	}

@Given("^: user enters the details$")
public void user_enters_the_details() throws Throwable {
	}

	@When("^:user enters the location$")
	public void user_enters_the_location() throws Throwable {
		singledropdown(pom.searchhotel().getLoction(), "value", "London");

	}

	@When("^: user enters the hotels$")
	public void user_enters_the_hotels() throws Throwable {
		singledropdown(pom.searchhotel().getHotels(), "value", "Hotel Sunshine");

	}

	@When("^: user enters the roomtype$")
	public void user_enters_the_roomtype() throws Throwable {
		singledropdown(pom.searchhotel().getRoomtype(), "value", "Super Deluxe");

	}
	@When("^:user enters the roomcount$")
	public void user_enters_the_roomcount() throws Throwable {
		singledropdown(pom.searchhotel().getRoomscount(), "value", "1");

	}

	@When("^: user enters the checkindate$")
	public void user_enters_the_checkindate() throws Throwable {
		pom.searchhotel().getCheckindate().clear();
		input_value(pom.searchhotel().getCheckindate(), "30/11/2021");

	}

	@When("^: user enters the checkoutdate$")
	public void user_enters_the_checkoutdate() throws Throwable {
		pom.searchhotel().getCheckoutdate().clear();
		input_value(pom.searchhotel().getCheckoutdate(), "2/12/2021");

	}

	@When("^: user enters the Adults$")
	public void user_enters_the_Adults() throws Throwable {
		singledropdown(pom.searchhotel().getAdults(), "value", "2");

	}

	@When("^: user enters the Children$")
	public void user_enters_the_Children() throws Throwable {
		singledropdown(pom.searchhotel().getChildren(), "value", "2");

	}

	@When("^: user enters  the submitbutton$")
	public void user_enters_the_submitbutton() throws Throwable {
		click_element(pom.searchhotel().getSearch());

	}

	@When("^: user clicks the radio button$")
	public void user_clicks_the_radio_button() throws Throwable {
		click_element(pom.searchhotel().getSelect());

	}

	@Then("^: user clicks continue for payment$")
	public void user_clicks_continue_for_payment() throws Throwable {
		click_element(pom.searchhotel().getContinuepayment());

	}

	@Given("^: User enters the user details and payment details$")
	public void user_enters_the_user_details_and_payment_details() throws Throwable {
	}

	@When("^: user enters firstname$")
	public void user_enters_firstname() throws Throwable {
		input_value(pom.Payment().getFirstname(), "Manimekala");

	}

	@When("^: user enters lastname$")
	public void user_enters_lastname() throws Throwable {
		input_value(pom.Payment().getLastname(), "c");

	}

	@When("^: user enters address$")
	public void user_enters_address() throws Throwable {
		input_value(pom.Payment().getAddress(), "13,abcd colony,chennai");

	}

	@When("^: user enters creditcardno$")
	public void user_enters_creditcardno() throws Throwable {
		String creditcardno = FileReaderManager.getInstanceCR().creditcardno();

		input_value(pom.Payment().getCreditcardno(),creditcardno);

	}

	@When("^: user enters creditcardtype$")
	public void user_enters_creditcardtype() throws Throwable {
        singledropdown(pom.Payment().getCardtype(), "value", "VISA");

	}

	@When("^: user enters expirymonth$")
	public void user_enters_expirymonth() throws Throwable {
		singledropdown(pom.Payment().getExpirymonth(), "value", "4");

	}

	@When("^: user enters expiryyear$")
	public void user_enters_expiryyear() throws Throwable {
		singledropdown(pom.Payment().getExpiryyear(), "value", "2022");

	}

	@When("^: user enters cvv$")
	public void user_enters_cvv() throws Throwable {
		String cvv = FileReaderManager.getInstanceCR().cvv();

		input_value(pom.Payment().getCvv(),cvv);

	}

	@When("^: user booked hotel$")
	public void user_booked_hotel() throws Throwable {
		click_element(pom.Payment().getBooknow());

	}

	@When("^: user clicks my_itinerary$")
	public void user_clicks_my_itinerary() throws Throwable {
		explicitwait(20,pom.Payment().getItinerary());
        click_element(pom.Payment().getItinerary());

	}

	@Then("^:  user booked and logouts$")
	public void user_booked_and_logouts() throws Throwable {
		click_element(pom.Payment().getLogout());

	}

}
