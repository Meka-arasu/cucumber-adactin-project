package reusableclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginmain {
	public static WebDriver driver;
	@FindBy(id="username")
	private WebElement username;
	
	public Loginmain(WebDriver driver2) {
	 Loginmain.driver=driver2;
	 PageFactory.initElements(driver2,this );
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	
	
}

