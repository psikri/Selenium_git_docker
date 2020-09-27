package com.SeleniumWithDocker;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestGooglePageWithDocker extends BrowserStart {

	@Test
	public void testGoogleTitleInChrome() throws InterruptedException, MalformedURLException {
		WebDriver driver=initializeBrowser("chrome");
		driver.get("https://www.google.com/");
		Thread.sleep(8000);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void testGoogleTitleInFirefox() throws InterruptedException, MalformedURLException {
		WebDriver driver=initializeBrowser("firefox");
		driver.get("https://www.google.com/");
		Thread.sleep(8000);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
