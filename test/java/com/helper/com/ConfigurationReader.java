package com.helper.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;
	public ConfigurationReader() throws Throwable {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Adactinhotelapp_test\\src\\test\\java\\com\\properties\\com\\Testdata.properties");
        FileInputStream fis =new FileInputStream(f);
        p =new Properties();
        p.load(fis);
	}
	public String Browser() {
		String browser = p.getProperty("Browser");
		return browser;
		

	}
	public String getUrl() {
		String url1 = p.getProperty("Url");
		return url1;
		

	}
	public String username() {
		String username = p.getProperty("username");
		return username;
		

	}
	public String password() {
		String password =p.getProperty("password");
		return password;

	}
	public String creditcardno() {
		String creditcardno =p.getProperty("creditcardno");
		return creditcardno;

	}
	public String cvv() {
		String cvv=p.getProperty("cvv");
		return cvv;

	}

}
