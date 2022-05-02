package com.qa.baseclasss;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utils.Utilityclass;

public class BaseClass {
public static Properties prop;
public static WebDriver driver;

	public BaseClass() {
		prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\workspceautomation\\Jbk_Frameworkk\\src\\main\\java\\com\\qa\\config\\config.properties");	
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
	}
	
	public static void initilization() {
		String broweserName = prop.getProperty("browser");
		if (broweserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 driver = new ChromeDriver();
		}

		
		else {	
			System.out.println("driver not found");	
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utilityclass.pageloadTimeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utilityclass.implicitwait,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));	
		}
	}


