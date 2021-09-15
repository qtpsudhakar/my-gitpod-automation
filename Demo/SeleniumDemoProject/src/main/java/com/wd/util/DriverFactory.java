package com.wd.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver getDriver(String browserName) {

		WebDriver driver;
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			// specify the driver executable
			WebDriverManager.chromedriver().setup();
			// open Browser
			driver = new ChromeDriver();

			break;
		case "firefox":
			// specify the driver executable
			WebDriverManager.firefoxdriver().setup();
			// open Browser
			driver = new FirefoxDriver();
			break;
		case "edge":
			// specify the driver executable
			WebDriverManager.edgedriver().setup();			

			// open Browser
			driver = new EdgeDriver();
			break;

		default:
		WebDriverManager.chromedriver().setup();
			// open Browser
			driver = new ChromeDriver();

			break;
		}

		return driver;
	}
}
