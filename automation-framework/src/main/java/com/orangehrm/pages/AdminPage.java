package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {
	@FindBy(id = "btnAdd")
	WebElement addUserBtn;

	@FindBy(id = "menu_admin_UserManagement")
	WebElement userManagementTab;
	
	public AddUserPage clickOnAddUserBtn() {
		userManagementTab.click();
		addUserBtn.click();
		return new AddUserPage();
	}
}
