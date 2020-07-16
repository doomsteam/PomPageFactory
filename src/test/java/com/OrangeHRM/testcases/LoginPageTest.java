package com.OrangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.OrangeHRM.base.BaseClass;
import com.OrangrHRM.pages.HomePage;



public class LoginPageTest extends BaseClass {
 
     //LoginPage loginPage;
     HomePage homePage;
     
     @Test(priority = 1)
     public void LogoTest() {
    	boolean flag=loginPage.validateLogo();
    	Assert.assertTrue(flag);
    	 
        }
     @Test(priority = 2)
     public void loginTest() {
    	 homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
    	 String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
    	 String actualURL=BaseClass.driver.getCurrentUrl();
    	 Assert.assertEquals(actualURL, expectedURL);
     }
 
 
 
 }
