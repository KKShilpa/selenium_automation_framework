package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.orangehrm.common.SeleniumWebDriverFactory;

public class LoginPage {
	
	@FindBy(id = "txtUsername")
	WebElement loginID;

	@FindBy(id = "txtPassword")
	WebElement pass;
	
	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	@FindBy(id = "spanMessage")
	WebElement errorMessage;
	
	@FindBy(xpath = "//div[@id='divLogo']/img")
	WebElement orangehrmlogo;
	
	@FindBy(id = "welcome")
	WebElement welcometext;
	
	@FindBy(xpath = "//img[@alt = 'LinkedIn OrangeHRM group']")
	WebElement linkedINLogo;
	
	@FindBy(xpath = "//img[@alt = 'OrangeHRM on Facebook']")
	WebElement fbLogo;

	@FindBy(xpath = "//img[@alt = 'OrangeHRM on twitter']")
	WebElement twitterLogo;
	
	@FindBy(xpath = "//img[@alt = 'OrangeHRM on youtube']")
	WebElement youtubeLogo;
	
	public LoginPage()
	{
		PageFactory.initElements(SeleniumWebDriverFactory.getWebDriver(),this);
	}
	public LoginPage enterValidLoginDetails(String loginName,String password)
	{
		loginID.sendKeys(loginName);
		pass.sendKeys(password);
		loginBtn.click();
		return this;
	}
	
	public HomePage verifyWelcomeTextHomePage(String text)
	{
		Assert.assertEquals(text,welcometext.getText(),"Miss match in Welcome Text");
	
		return new HomePage();
	}
	
	public LoginPage verifyErrorMessage(String error)
	{
		System.out.println("entred invalid credentials to verify error message");
		Assert.assertEquals(error,errorMessage.getText(),"Entred credentials are not valid");
	
		return this;
	}
	
	public LoginPage verifyThirdPartyLogosOnScreen()
	{
		System.out.println("Verify LinkedIN logo on login screeen");
		Assert.assertEquals(true,linkedINLogo.isDisplayed(),"LinkedIN logo not displyed");
	
		System.out.println("Verify Facebook logo on login screeen");
		Assert.assertEquals(true,fbLogo.isDisplayed(),"LinkedIN logo not displyed");
		
		System.out.println("Verify Twitter logo on login screeen");
		Assert.assertEquals(true,twitterLogo.isDisplayed(),"Twitter logo not displyed");
		
		System.out.println("Verify Twitter logo on login screeen");
		Assert.assertEquals(true,youtubeLogo.isDisplayed(),"You Tube logo not displyed");

		return this;
	}
	
	
	
	public LoginPage enterInvalidLoginDetail()
	{
		return this;
	}
	
	

}
