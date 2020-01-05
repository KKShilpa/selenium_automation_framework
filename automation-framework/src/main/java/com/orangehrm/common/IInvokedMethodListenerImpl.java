package com.orangehrm.common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodListenerImpl implements IInvokedMethodListener
{

	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		System.out.println("---- In after invocation");
		SeleniumWebDriverFactory.getWebDriver().quit();
	}
	
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
		SeleniumWebDriverFactory.setWebDriver(new ChromeDriver());
		SeleniumWebDriverFactory.getWebDriver().manage().window().maximize();
		SeleniumWebDriverFactory.getWebDriver().get("http://127.0.0.1/orangehrm-3.3.1/");

	}
}
