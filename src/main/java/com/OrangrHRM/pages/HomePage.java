package com.OrangrHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.OrangeHRM.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	 WebElement adminTab;
	 
	 public HomePage() {
	  PageFactory.initElements(driver, this);
	 }
	 //This method will return object of SystemUsersPage class as we are landing on 
	 //SystemUsersPage using this method
	 public SystemUsersPage clickOnAdminTab() {
	  adminTab.click();
	  return new SystemUsersPage();
	 }
	
}
