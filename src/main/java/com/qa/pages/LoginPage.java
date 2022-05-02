package com.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclasss.BaseClass;
public class LoginPage extends BaseClass {
	
	@FindBy(id="email")
	WebElement uname;
	
	@FindBy(id="password")
	WebElement upass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Singin;
	
	@FindBy(xpath="//b[text()='Java By Kiran']")
	WebElement Titlelogo;
	
	@FindBy(xpath= "//a[text()='Register a new membership']")
	WebElement Link;
	
	public LoginPage() {                                   //constructor call
	
		PageFactory.initElements(driver,this);	  
	}
	
	public String validateloginpagetitle() {              //get title
		return driver.getTitle();
	}
	
	public String Logotitle() {                          //logo title
		return Titlelogo.getText();	
	}
	
	public String Link() {
		return Link.getText();                           //register new membership link
	}
	public DashBoard login(String username,String password) {	
		uname.sendKeys(username);
		upass.sendKeys(password);
		Singin.click();
		return new  DashBoard();
	}
	
	
	
	
	
	
	
	

	
	

}
