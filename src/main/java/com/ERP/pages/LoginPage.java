package com.ERP.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ERP.base.TestBase;

public class LoginPage extends TestBase
{
	@FindBy(id="inputEmail3")
	private WebElement username;
	
	@FindBy(id="inputPassword3")
	private WebElement password;
	
	@FindBy(xpath=".//*[@ng-click='logIn()']")
	private WebElement signin;
	
	public LoginPage() throws IOException 
	{   
		
			PageFactory.initElements(driver, this);		
				
	}
	
	public Dashboard login(String un, String pwd) throws IOException
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		signin.click();
		return new Dashboard();
	} 
		
}