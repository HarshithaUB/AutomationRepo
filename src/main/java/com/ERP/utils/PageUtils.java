package com.ERP.utils;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ERP.base.TestBase;
import com.ERP.pages.Dashboard;

public class PageUtils extends TestBase
{    
	
	Dashboard dashboard;
	public PageUtils() throws IOException 
	{
		super();
		
	}

	public void switchToFrame()
	{
		driver.switchTo().frame("frame name");
	}
	
	
}
