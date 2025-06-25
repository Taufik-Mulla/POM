package com.testCase;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.LoginPage;

public class TC_001_ValidLogin extends Base {

	@Test
	void checkLogin() {
		LoginPage page = new LoginPage(driver);
		LoginPage.setEmail("kiran@gmail.com");
		LoginPage.setPassword("123456");
		LoginPage.setSignInBTN ();
	}
}