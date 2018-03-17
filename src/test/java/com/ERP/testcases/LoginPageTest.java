package com.ERP.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ERP.base.TestBase;
import com.ERP.pages.Dashboard;
import com.ERP.pages.LoginPage;

public class LoginPageTest extends TestBase
{    
	LoginPage loginpage;
	Dashboard dashboard;
	
	
	public LoginPageTest() throws IOException
	{
		super();
	
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException
	{   
		launchChrome();
		loginpage = new LoginPage();
	}
	
	@Test
	public void loginTest() throws IOException
	{
		dashboard = loginpage.login(properties.getProperty("username"),properties.getProperty("password"));
	}	
     
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
