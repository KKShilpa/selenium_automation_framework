package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {


	@FindBy(id = "menu_admin_viewAdminModule" )
	WebElement adminViewModel;
	
	
	
	public AdminPage clickOnAdminMenue()
	{
		adminViewModel.click();
		return new AdminPage();
	}
}
