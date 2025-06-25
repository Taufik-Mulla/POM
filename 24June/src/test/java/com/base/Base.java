package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public WebDriver driver;

	@BeforeMethod
	public void trigger() {
		driver = new ChromeDriver () ;
		driver.manage().window().maximize();
		driver.get("https://javabykiran.com/liveproject/index.html");
		

	}

	@AfterMethod()
	public void closure() {
		if (driver != null) {
		}
		driver.quit();

	}
}