package com.orangehrm.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.orangehrm.common.SeleniumWebDriverFactory;

public class AddUserPage {
	
	@FindBy(id = "systemUser_userType")
	WebElement userType;
	
	@FindBy(id = "systemUser_employeeName_empName")
	WebElement empname;
	
	@FindBy(id = "systemUser_userName")
	WebElement uname;	
	
	@FindBy(id = "systemUser_password")
	WebElement pass;
	
	@FindBy(id = "systemUser_confirmPassword")
	WebElement confpassword;
	
	@FindBy(id = "btnSave")
	WebElement savebtn;
	
	@FindBy(xpath = "//input[@id ='systemUser_userName']/span[contains(text(),'Already exists')]")
	WebElement duplicateuserNameError;
	
	@FindBy(id = "searchSystemUser_userName")
	WebElement searchUserTxtBox;
	
	@FindBy(xpath = "//a[@href = 'saveSystemUser?userId=2']")
	WebElement searchedUserName;
	
	@FindBy(id = "btnSave")
	WebElement editAndSaveBtn;
	
	@FindBy(id = "searchBtn")
	WebElement searchbtn;
	
	@FindBy(id ="UserHeading")
	WebElement editUserHeading;
	
	@FindBy(id = "ohrmList_chkSelectRecord_3")
	WebElement checkBoxToSelect;
	
	@FindBy(id = "btnDelete")
	WebElement deleteBtn;
	
	public AddUserPage()
	{
		PageFactory.initElements(SeleniumWebDriverFactory.getWebDriver(), this);
	}
	
	public AddUserPage selectUserRoll(String userroll)
	{
	Select slt = new Select(userType);
	slt.selectByVisibleText(userroll);
	return this;
	}
	public AddUserPage enterEmpName(String empName)
	{
		empname.sendKeys(empName);
	return this;
	}	
	public AddUserPage enterUserName(String username)
	{
		uname.sendKeys(username);
	return this;
	}	
	public AddUserPage enterPassword(String pwd)
	{
		pass.sendKeys(pwd);
	return this;
	}
	public AddUserPage enterConfirmPassword(String passwd)
	{
		pass.sendKeys(passwd);
	return this;
	}
	public AddUserPage clickSave()
	{
		savebtn.click();
	return this;
	}
	public AddUserPage verifyDuplicateUserNameError(String expectedmsg)
	{
		String actualmsg= duplicateuserNameError.getText();
		Assert.assertEquals(actualmsg, expectedmsg,"There is miss match in error message");
		return this;
	}
	
	public AddUserPage enterUserNameForSearch(String username)
	{
		System.out.println("Enter username to search and edit");
		searchUserTxtBox.sendKeys(username);
		return this;
	}
	
	public AddUserPage clickSearchBtn()
	{
		searchbtn.click();	
		return this;
	}
	
	public AddUserPage clickOnSearchedUser()
	{
		searchedUserName.click();
		System.out.println("Searched user name from list is selected");
		return this;
	}
	public EditUserPage clickOnEditandSaveBtn()
	{
		editAndSaveBtn.click();
		Assert.assertEquals(true,editUserHeading.isDisplayed(),"Edit User page is not displayed");
		editAndSaveBtn.click();
		return new EditUserPage();
	}
	public AddUserPage clickSearchedUserCheckBox()
	{
		checkBoxToSelect.click();
	return this;
	}
	public AddUserPage clickDeleteBtn()
	{
		deleteBtn.click();
	return this;
	}
	
	@FindBy(id = "deleteConfModal")
	WebElement deleteUserPopUp;
	
	@FindBy(id = "dialogDeleteBtn")
	WebElement OKBtnOnpopup;
	
	public AddUserPage verifyConfirmationPopUp()
	{
		Assert.assertEquals(true,deleteUserPopUp.isDisplayed(),"Delete confirmation popup not displayed");
		OKBtnOnpopup.click();
		return this;
	}
}
