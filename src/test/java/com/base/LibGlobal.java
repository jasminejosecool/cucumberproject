package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	public static WebDriver driver = null;
	public static WebDriver launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jasmine Jose\\eclipse-workspace\\Cucumber-project\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static void  loadUrl(String url) {
		driver.get(url);
	}
	public static void write(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void buttonClick(WebElement element) {
		element.click();
	}

}
