package com.qtpsudhakar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.wd.util.DriverFactory;

public class Wd5OhrmLogin {

	public static void main(String[] args) {
		
		WebDriver driver = DriverFactory.getDriver("chrome");
		//navigate to application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//get title
		String title =  driver.getTitle();
		System.out.println("Opened page Title: "+ title);
		
		//enter user name
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		//enter password
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//click on login
		driver.findElement(By.id("btnLogin")).click();
		
		//close browser
		driver.quit();

	}

}
