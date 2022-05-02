package com.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclasss.BaseClass;

public class DashBoard extends  BaseClass {
	
	@FindBy(xpath ="//a[@href='../pdf/selenium-testing-syllabus-jbk.pdf']" )
	WebElement autoTesting;
	
	@FindBy(xpath="//span[text()='Operators']")
	WebElement Operate;
	
	
	@FindBy(xpath="//a[@href='logout.html']")
	WebElement Logoutt;
	
 public DashBoard() {
	 PageFactory.initElements(driver,this);	 
 }
 
 public SeleniumPdf  MoreInfo1Click() {	 
 autoTesting.click();
 return new SeleniumPdf();
 }
 
 public String Operate1() {
	 return Operate.getText();	 
 }
 
 public LoginPage Logoff() {
	 Logoutt.click();
	 return new LoginPage();	 
 }
 
}



