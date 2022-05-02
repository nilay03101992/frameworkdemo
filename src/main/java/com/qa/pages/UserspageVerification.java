package com.qa.pages;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseclasss.BaseClass;
public class UserspageVerification extends BaseClass {
	
	@FindBy(xpath="//h3[@class='box-title']")
	WebElement userList;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table")
	WebElement Table;
	
	@FindBy(xpath="//span[@class='label label-danger ss']")
	WebElement RemoveUser;
	
	@FindBy(xpath="//span[text()='Users']")
	WebElement UserOnDashboard;
	
	public UserspageVerification() {
		
		PageFactory.initElements(driver,this);
	}
	
	public String ValidateUser(){
		UserOnDashboard.click();
		return userList.getText();
	}
	
	public  String getColValue(int row, int col)
	{
		WebElement colValue= driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr["+row+"]/td["+col+"]"));
		return colValue.getText();				
	}
	public String removeUser() {
		RemoveUser.click();
		Alert al= (Alert) driver.switchTo().alert();
		al.accept();
        String alertMessage= driver.switchTo().alert().getText();		
       al.accept();
	   return alertMessage;
		
		
	}
	
}