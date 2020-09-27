package com.SeleniumWithDocker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStart {

	public WebDriver initializeBrowser(String browserName) throws MalformedURLException {
		WebDriver driver=null;
		switch(browserName.toLowerCase()) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver",".\\resources\\geckodriver.exe");
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox());
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
			break;
		
		}
		return driver;
	}
}
