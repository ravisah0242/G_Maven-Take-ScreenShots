package com.generics.screenshots;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstants
{
	public static WebDriver driver;	
	
	@Parameters({"browser"})
	@BeforeMethod
	public void openApp	(String browser)
	{
		/*System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();*/
		
		if (browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();	//Dependency code its Automatically load WebDriver;
			driver=new ChromeDriver();	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get(url);	
		}
		
		/*WebDriverManager.chromedriver().setup();	//Dependency code its Automatically load WebDriver;
		driver=new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);*/
	}
	@AfterMethod
	public void closeApp()
	{
		//driver.quit();
	}
}
