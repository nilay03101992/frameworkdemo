package com.qa.logintestt;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseclasss.BaseClass;
import com.qa.pages.LoginPage;

public class LoginTest extends BaseClass {
	LoginPage loginpg;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initilization();
		loginpg = new LoginPage();
	}

	@Test(priority = 1,enabled = true)
	public void VerifyLoginTitle() {
		String act = loginpg.validateloginpagetitle();
		Assert.assertEquals(act, "JavaByKiran | Log in");
	}

	@Test(priority = 2, enabled = true)
	public void verifyLogo() {
		String act = loginpg.Logotitle();
		Assert.assertEquals(act, "Java By Kiran");
	}
	@Test(priority = 3, enabled = true)
	public void verifyLink() {
		String act= loginpg.Link();
		Assert.assertEquals(act, "Register a new membership");
	}
	@Test(priority = 4, enabled = true)
	public void varifyValidCredentials(){
	loginpg.login("kiran@gmail.com", "123456");
		
	}

}
