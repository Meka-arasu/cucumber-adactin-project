package com.Runner.com;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.helper.com.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import reusableclasses.Baseclass;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\com",
glue = "com.stepdefinition.com", monochrome =true ,
plugin = { "pretty","html:Report", "com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html" })

public class Adactinrunner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
	String browser=FileReaderManager.getInstanceCR().Browser();
		driver = Baseclass.browserlaunch(browser);

	}
}
