package com.ERP.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ERP.base.TestBase;
import com.ERP.pages.CategoryPage;
import com.ERP.pages.Dashboard;
import com.ERP.pages.LoginPage;
import com.ERP.utils.PageUtils;

public class DashboardTest extends TestBase
{
    LoginPage loginpage;
   static Dashboard dashboard;
    static PageUtils pageutils;
    CategoryPage categoryPage;
    
	public DashboardTest() throws IOException 
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException, IOException
	{
		launchChrome();
		pageutils = new PageUtils();
		loginpage = new LoginPage();
		dashboard = loginpage.login(properties.getProperty("username"),properties.getProperty("password"));
	}
	
	@Test (priority=1)
	public void verifyDashboardPageTitle()
	{
		String dashboardPageTitle = dashboard.validateDashboardTitle();
		Assert.assertEquals(dashboardPageTitle, "Storeking", "Dashboard page not found");
	}
	
	
	@Test (priority=2)
	public static void verifyClickOnMenuLinkTest()
	{   
		dashboard.clickOnMenuLink();
	}
	 
	/*
	@Test (priority=3)
	public void verifyClickOnCatalogTest()
	{
		dashboard.clickOnCatalog();
	}
	
	
	@Test(priority=4)
	public void verifyClickOnCategoryTest()
	{
		//pageutils.switchToFrame();
		categoryPage = dashboard.clickOnCategory();
	}
	
	@Test(priority=3)
	public void verifyCatagoryPageTitle()
	{
		String categoryPageTitle =  dashboard.validateCategoryTitle();
		Assert.assertEquals(categoryPageTitle, "category","category page not found");
	}*/

}
