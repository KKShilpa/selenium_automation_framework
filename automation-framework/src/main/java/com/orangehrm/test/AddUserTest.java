package com.orangehrm.test;
import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.pages.LoginPage;

public class AddUserTest extends BaseSelenium {
	
		@Test(groups ="assignment", enabled = true)
	public void addAdminUserTest()
	{
		LoginPage lp = new LoginPage();
			
		lp.login("Admin", "Admin123")
			.verifyLoginSuccessful("Welcome Admin")
				.clickOnAdminMenue()
					.clickOnAddUserBtn()
						.selectUserRoll("Admin")
						.enterEmpName("Shilpa Rahul Kamble")
							.enterUserName("KKShilpa")  
								.enterPassword("KK@shilpa")
									.enterConfirmPassword("KK@shilpa")
										.clickSave();		
			}

	@Test(groups ="assignment", enabled = true)
	public void addESSUser()
	{
		LoginPage lp = new LoginPage();
		lp.loginwithparameters("Admin", "Admin123")
			.clickOnAdminMenue()
				.clickOnAddUserBtn()
					.selectUserRoll("ESS")
						.enterEmpName("Shilpa Rahul Kamble")
							.enterUserName("Shilpakk")
								.enterPassword("Shilpa@kk")
									.enterConfirmPassword("Shilpa@kk");
									
		}
	
	@Test(groups ="assignment", enabled = true)
	public void addUserWithDuplicateUserName()
	{
		LoginPage lp = new LoginPage();
		lp.loginwithparameters("Admin","Admin123")
			.clickOnAdminMenue()
				.clickOnAddUserBtn()
					.selectUserRoll("Admin")
						.enterEmpName("Shilpa Rahul Kamble")
							.enterUserName("Shilpa")
								.enterPassword("KK@Shilpa")
									.enterConfirmPassword("KK@Shilpa")
										.clickSave()
											.verifyDuplicateUserNameError("Already exists");
		}
	
	@Test(groups ="assignment", enabled = true)
	public void verifySearchedUserToEdit()
	{
		LoginPage lp = new LoginPage();
		lp.loginwithparameters("Admin","Admin123")
			.clickOnAdminMenue()
				.clickOnAddUserBtn()
					.enterUserNameForSearch("Shilpa")
						.clickSearchBtn()
							.clickOnSearchedUser()
								.clickOnEditandSaveBtn();
								
	}
	
	@Test(groups ="assignment", enabled = true)
	public void verifyDeleteAddedUser()
	{
		LoginPage lp = new LoginPage();
		
		lp.login("Admin", "Admin123")
			.verifyLoginSuccessful("Welcome Admin")
				.clickOnAdminMenue()
					.clickOnAddUserBtn()
						.selectUserRoll("Admin")
						.enterEmpName("Shilpa Rahul Kamble")
							.enterUserName("ABCDEFG")
								.enterPassword("KK@shilpa")
									.enterConfirmPassword("KK@shilpa")
										.clickSave()
											.enterUserNameForSearch("ABCDEFG")
												.clickSearchBtn()
													.clickSearchedUserCheckBox()
														.clickDeleteBtn()
															.verifyConfirmationPopUp();
												
											
		
	}
	
	
}
