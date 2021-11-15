package com.helper.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



import reusableclasses.Loginmain;
import reusableclasses.Payment;
import reusableclasses.Searchhotel;

public class Pommanager {
	public static WebDriver driver;
	private Loginmain lm;
	 private Searchhotel sh;
	 private Payment p;
	 public Pommanager(WebDriver driver2) {
		Pommanager.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
	 
	 public Loginmain loginmain()
	 {
		 lm=new Loginmain(driver);
				 return lm;
	 }
	 public Searchhotel searchhotel()
	 {
          sh =new Searchhotel(driver);
		 return sh;
	 }
	 public Payment Payment()
	 {
		 p=new Payment(driver);
		 return p;
	 }

}
