package com.orangehrm.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.common.SeleniumWebDriverFactory;

public class AddEmployeeTest extends BaseSelenium
{
	@Test
	public void addEmployeeTest()
	{
		
	WebElement userName = SeleniumWebDriverFactory.getWebDriver().findElement(By.id("txtUsername"));
	userName.sendKeys("admin");
	WebElement pass= SeleniumWebDriverFactory.getWebDriver().findElement(By.name("txtPassword"));
	pass.sendKeys("Admin123");
	WebElement loginBtn = SeleniumWebDriverFactory.getWebDriver().findElement(By.id("btnLogin"));
	loginBtn.click();	
	WebElement pim = SeleniumWebDriverFactory.getWebDriver().findElement(By.id("menu_pim_viewPimModule"));
	pim.click();	
	WebElement addEmp = SeleniumWebDriverFactory.getWebDriver().findElement(By.id("menu_pim_addEmployee"));
	addEmp.click();	
	WebElement firstName = SeleniumWebDriverFactory.getWebDriver().findElement(By.id("firstName"));
	firstName.sendKeys("Shilpa");
	WebElement middleName = SeleniumWebDriverFactory.getWebDriver().findElement(By.id("middleName"));
	middleName.sendKeys("Rahul");
	WebElement lastName =SeleniumWebDriverFactory.getWebDriver().findElement(By.id("lastName"));
	lastName.sendKeys("Kamble");
	WebElement chkBox = SeleniumWebDriverFactory.getWebDriver().findElement(By.id("chkLogin"));
	chkBox.click();
	WebElement nameOfUser = SeleniumWebDriverFactory.getWebDriver().findElement(By.id("user_name"));
	nameOfUser.sendKeys("Shilpa");
	WebElement passOfUser = SeleniumWebDriverFactory.getWebDriver().findElement(By.id("user_password"));
	passOfUser.sendKeys("Shilpakamble@123");
	WebElement rePass = SeleniumWebDriverFactory.getWebDriver().findElement(By.id("re_password"));
	rePass.sendKeys("Shilpakamble@123");
	WebElement saveBtn = SeleniumWebDriverFactory.getWebDriver().findElement(By.id("btnSave"));
	saveBtn.click();
	}
}
