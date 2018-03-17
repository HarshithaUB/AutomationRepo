package com.ERP.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase
{
	public static WebDriver driver;
	public static Properties properties;
	
	public TestBase() throws IOException
	{  
		properties = new Properties();
		FileInputStream fileinputstream= new FileInputStream("C:\\Users\\Harshitha\\Desktop\\work\\Automation\\Practise\\ERP_Application_Automation\\src\\main\\java\\com\\ERP\\config\\config.properties");
		properties.load(fileinputstream);
       
     }
	public static void launchChrome() throws InterruptedException
	{   
		     String browserName = properties.getProperty("browser");
		     if(browserName.equals("chrome"))
		     {
			    System.getProperty("webdriver.chrome.driver", "\\Users\\Harshitha\\Desktop\\work\\Automation\\Practise\\ERP_Application_Automation\\chromedriver.exe");
		        driver= new ChromeDriver();
		     }
		     driver.manage().window().maximize();
		     Thread.sleep(5000);
		     driver.get(properties.getProperty("url"));
	}
}
