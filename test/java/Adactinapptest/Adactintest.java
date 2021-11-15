package Adactinapptest;

import org.openqa.selenium.WebDriver;

import com.helper.com.Pommanager;

import reusableclasses.Baseclass;
import reusableclasses.Loginmain;
import reusableclasses.Payment;
import reusableclasses.Searchhotel;

public class Adactintest extends Baseclass {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = browserlaunch("chrome");
		get_url("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Pommanager pom =new Pommanager(driver);
		input_value(pom.loginmain().getUsername(), "cmanimekala88");
		input_value(pom.loginmain().getPassword(), "manimekala@88");
		click_element(pom.loginmain().getLogin());
	
		explicitwait(20, pom.searchhotel().getLoction());
		singledropdown(pom.searchhotel().getLoction(), "value", "London");
		singledropdown(pom.searchhotel().getHotels(), "value", "Hotel Sunshine");
		singledropdown(pom.searchhotel().getRoomtype(), "value", "Super Deluxe");
		singledropdown(pom.searchhotel().getRoomscount(), "value", "1");
		pom.searchhotel().getCheckindate().clear();
		input_value(pom.searchhotel().getCheckindate(), "30/11/2021");
		pom.searchhotel().getCheckoutdate().clear();
		input_value(pom.searchhotel().getCheckoutdate(), "2/12/2021");
		singledropdown(pom.searchhotel().getAdults(), "value", "2");
		singledropdown(pom.searchhotel().getChildren(), "value", "2");
		click_element(pom.searchhotel().getSearch());
		click_element(pom.searchhotel().getSelect());
		click_element(pom.searchhotel().getContinuepayment());
		input_value(pom.Payment().getFirstname(), "Manimekala");
		input_value(pom.Payment().getLastname(), "c");
		input_value(pom.Payment().getAddress(), "13,abcd colony,chennai");
		input_value(pom.Payment().getCreditcardno(), "1212133432784512");
        singledropdown(pom.Payment().getCardtype(), "value", "VISA");
		singledropdown(pom.Payment().getExpirymonth(), "value", "4");
		singledropdown(pom.Payment().getExpiryyear(), "value", "2022");
		input_value(pom.Payment().getCvv(), "2366");
		click_element(pom.Payment().getBooknow());
		explicitwait(20,pom.Payment().getItinerary());
		click_element(pom.Payment().getItinerary());
		click_element(pom.Payment().getLogout());

	}

}
