package reusableclasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
public static WebDriver driver;
	

	public static WebDriver browserlaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\lenovo\\eclipse-workspace\\selenium_test\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\lenovo\\eclipse-workspace\\selenium_test2\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {

			System.out.println("brower not launched");

		}
		return driver;

	}

	public static void screenshot(String pic) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("path" + pic + ".jpeg");
		FileUtils.copyFile(source, destination);
	}

	public static void get_url(String url) {
		driver.get(url);

	}

	public static void close_window() {
		driver.close();

	}

	public static void quit_browser() {
		driver.quit();

	}

	public static void navigate_to(String url1) {
		driver.navigate().to(url1);

	}

	public static void navigate_back() {
		driver.navigate().back();

	}

	public static void navigate_forward() {
		driver.navigate().forward();

	}

	public static void navigate_refresh() {
		driver.navigate().refresh();

	}

	public static void click_element(WebElement element) {
		element.click();

	}

	public static void mouse_click(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).build().perform();

	}

	public static void mouse_rightclick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();

	}

	public static void mouse_move(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();

	}

	public static void keyboard_fn() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_0);
		r.keyRelease(KeyEvent.VK_0);

	}

	public static void frame_in(WebElement element) {
		driver.switchTo().frame(element);

	}

	public static void frame_out(WebElement element) {
		driver.switchTo().defaultContent();

	}

	public static void check_isenable(WebElement e) {
		boolean enabled = e.isEnabled();
		System.out.println(enabled);
	}

	public static void check_isdisplayed(WebElement e) {
		boolean displayed = e.isDisplayed();
		System.out.println(displayed);

	}

	public static void check_isselected(WebElement e) {
		boolean selected = e.isSelected();
		System.out.println(selected);

	}

	public static void get_title() {
		String title = driver.getTitle();

		System.out.println("TITLE:" + title);

	}

	public static void get_currenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void get_attribute(WebElement e, String name) {
		String attribute = e.getAttribute(name);
		System.out.println(attribute);

	}

	public static void get_text(WebElement e) {
		String text = e.getText();
		System.out.println(text);

	}

	public static void input_value(WebElement e, String s) {
		e.sendKeys(s);

	}

	public static void window_handle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

	}
	public static void window_handles() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String s : windowHandles) {
			System.out.println(s);
			}
	}
	public static void chechbox(WebElement e) {
		e.click();

	}
	public static void singledropdown(WebElement e,String option,String input) {
		Select s=new Select(e);
		if(option.equals("index"))
				{
			int paresInt =Integer.parseInt(input);
				s.selectByIndex(paresInt);
				}
		else if (option.equals("value")) {
			s.selectByValue(input);
		}
		else if(option.equals("txt")){
			s.selectByVisibleText(input);
		}
		

	
	}
	public static void is_multiple(WebElement e) {
		Select s=new Select(e);
    	boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	public static void get_options(WebElement e) {
		Select s=new Select(e);
		List<WebElement> options = s.getOptions();
		for (WebElement w: options) {
			System.out.println(w);
		}
	}
		public static void get_allselectedoptions(WebElement e) {
			Select s=new Select(e);
			List<WebElement> as = s.getAllSelectedOptions();
			for (WebElement w : as) {
				System.out.println(w);
				
			}
		}
		public static void get_firstselectedoption(WebElement e) {
			Select s=new Select(e);
              WebElement f = s.getFirstSelectedOption();
			System.out.println(f);
				
			}
		public static void alert_handle() {
			
			

		}
		public static void explicitwait(long seconds,WebElement element) {
			WebDriverWait wait=new WebDriverWait(driver,seconds);
			wait.until(ExpectedConditions.visibilityOf(element));
			
			

		}
		public static void implicitwait() {
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		}
		
	



}
