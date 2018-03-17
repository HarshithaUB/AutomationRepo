package com.ERP.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ERP.base.TestBase;


public class Dashboard extends TestBase 
{
    @FindBy(xpath="html/body/main/page-top/div/a[2]")
    public WebElement menuLink;
    
    @FindBy(xpath=".//*[@ng-model='search_options']")
    private WebElement selectType;
    
    @FindBy(xpath=".//*[@ng-if='item.subMenu']")
	public WebElement catalogMenu;
    
    @FindBy(linkText="Manage Categories")
	private WebElement categoryLink;
    
    @FindBy(linkText="Manage Brand")
    private WebElement brandLink;
    
    @FindBy(linkText="Manage Product")
    private WebElement productLink;
    
    @FindBy(linkText="Manage Deal")
    private WebElement dealLink;

    
	public Dashboard() throws IOException
	{
          PageFactory.initElements(driver, this);
	}
	
	public String validateDashboardTitle()
	{
		return driver.getTitle();
	}
	
	public void clickOnMenuLink()
	{
		 Actions action = new Actions(driver);
		 
	     action.moveToElement(menuLink).perform();
	 
	     action.click();
	 
	}
	
	
	/*public void clickOnCatalog()
	{
		catalogMenu.click(); 
	}*/
	
	public CategoryPage clickOnCategory()
	{
		categoryLink.click();
		return new CategoryPage();
	}
	
	public BrandPage clickOnBrands()
	{
		brandLink.click();
		return new BrandPage();
	}
	
	public DealPage clickOnDeals()
	{
		dealLink.click();
		return new DealPage();
	}
	
	public ProductPage clickOnProducts()
	{
		productLink.click();
		return new ProductPage();
	}
	
	public String validateCategoryTitle()
	{
		return driver.getTitle();
	}

}
