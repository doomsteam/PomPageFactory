/**
 * 
 */
/**
 * 
 */
package com.OrangeHRM.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.OrangrHRM.pages.LoginPage;


/**
 * @author user
 *
 */
public class BaseClass {
	
	public static WebDriver driver;
	public LoginPage loginPage;
	public Properties prop;
	
	@BeforeMethod
	public void setup() {
		 readConfig();
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\POMPageFactory\\Drivers\\chromedriver.exe");
		 
		 driver= new ChromeDriver();		 
		 driver.manage().window().maximize();
		 driver.get(prop.getProperty("url"));		 
		 loginPage=new LoginPage();
	}
	
	@AfterMethod
	public void tearDown() {
	driver.close();	
		
	    }
	
	public void readConfig() {
		
			try {
				prop=new Properties();
				FileInputStream fs=new FileInputStream(System.getProperty("user.dir")
						+"/Confuguration/config.properties");
				prop.load(fs);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
		
	}
	
  }
