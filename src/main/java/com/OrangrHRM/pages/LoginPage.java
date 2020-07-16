package com.OrangrHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.OrangeHRM.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(id="txtUsername") 
	 WebElement userName;
	 
	 @FindBy(name="txtPassword") 
	 WebElement password;
	 
	 @FindBy(xpath="//*[@id=\"btnLogin\"]") 
	 WebElement loginBtn;
	 
	 @FindBy(xpath="//*[@id=\"divLogo\"]/img") 
	 WebElement logo;
	 
	 public LoginPage() {
	  PageFactory.initElements(driver, this);
	 }
	 
	 public boolean validateLogo() {
	  logo.isDisplayed();
	  return true;
	 }
	 //This method will return object of HomePage class as we are landing on 
	 //HomePage using this method
	 public HomePage login(String uname, String pswd) {
	  userName.sendKeys(uname);
	  password.sendKeys(pswd);
	  loginBtn.click();
	  return new HomePage();
	 }

	}


