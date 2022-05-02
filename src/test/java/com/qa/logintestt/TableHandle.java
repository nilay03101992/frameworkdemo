package com.qa.logintestt;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.baseclasss.BaseClass;
import com.qa.pages.DashBoard;
import com.qa.pages.LoginPage;

public class TableHandle extends BaseClass {
	DashBoard dash;
	LoginPage log;
	
	public TableHandle() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initilization();
		dash=log.login(prop.getProperty("username"),prop.getProperty("password"));
		
		
		
		
	}
  //@Test
 // public String verifyUserList () {
	  //String 
	  
  }
//}
