package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class LoginPage {

	private static WebDriver driver;

	@FindBy(id = "email")
	private static WebElement email;

	@FindBy(id = "password")
	private static WebElement password;

	@FindBy(xpath = "//*[@id=\"form\"]/div[3]/div/button")
	private static WebElement signInBTN;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public  static void setEmail(String myemail) {
	email.sendKeys(myemail);
		
	}

	public static void setPassword(String mypassword) {
	password.sendKeys(mypassword);
			}

	public  static void setSignInBTN() {
		signInBTN.click();
		
	}

	
		
	}


