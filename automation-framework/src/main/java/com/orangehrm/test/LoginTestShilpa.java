package com.orangehrm.test;

import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.pages.LoginPage;

public class LoginTestShilpa extends BaseSelenium {

	@Test(enabled=true,groups ="shilpaWebTest",description = "Verify valid login details")
	public void verifyValidLoginTest()
	{
		LoginPage login = new LoginPage();
		login.enterValidLoginDetails("Admin", "Admin123")
				.verifyWelcomeTextHomePage("Welcome Admin");
	}
	
	@Test(enabled=true,groups ="shilpaWebTest",description = "Verify login with invalid password for error message")
	public void verifyInValidPasswordTest()
	{
		LoginPage login = new LoginPage();
		login.enterValidLoginDetails("Admin", "Admin456")
				.verifyErrorMessage("Invalid credentials");
	}
	
	@Test(enabled=true,groups ="shilpaWebTest",description = "Verify login with invalid login name  for error message")
	public void verifyInValidLoginNameTest()
	{
		LoginPage login = new LoginPage();
		login.enterValidLoginDetails("Admin345", "Admin123")
				.verifyErrorMessage("Invalid credentials");
	}
	@Test(enabled=true,groups ="shilpaWebTest",description = "Verify login with specialcharacter in login name  for error message")
	public void verifySpecialCharInLoginName()
	{
		LoginPage login = new LoginPage();
		login.enterValidLoginDetails("Admin##@$$", "Admin123")
				.verifyErrorMessage("Invalid credentials");
	}
	
	@Test(enabled=true,groups ="shilpaWebTest",description = "Verify lenth+1 character in Login name for error message")
	public void verifyLengthOfLoginNameField()
	{
		LoginPage login = new LoginPage();
		login.enterValidLoginDetails("Admin123456789011121314151617181920", "Admin123")
				.verifyErrorMessage("Invalid credentials");
	}
	@Test(enabled=true,groups ="shilpaWebTest",description = "Verify blank login name for error message")
	public void verifyLoginWithBlankLoginName()
	{
		LoginPage login = new LoginPage();
		login.enterValidLoginDetails("", "Admin123")
				.verifyErrorMessage("Username cannot be empty");
	}
	@Test(enabled=true,groups ="shilpaWebTest",description = "Verify blank password for error message")
	public void verifyLoginWithBlankPass()
	{
		LoginPage login = new LoginPage();
		login.enterValidLoginDetails("Admin", "")
				.verifyErrorMessage("Password cannot be empty");
	}
	
	@Test(enabled=true,groups ="shilpaWebTest",description = "Verify third party logos displied on login screen")
	public void verifyThirdPartyLogosOnLoginScreen()
	{
		LoginPage login = new LoginPage();		
				login.verifyThirdPartyLogosOnScreen();
	}
	
	
}
