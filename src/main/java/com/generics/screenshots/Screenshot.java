package com.generics.screenshots;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Screenshot implements ITestListener
{

	public void onFinish(ITestContext arg0)
	{
		TakesScreenshot tsp=(TakesScreenshot)BaseTest.driver;
		File srcfile2=tsp.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile2, new File("./screenshots/loginpass.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) 
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTest.driver;
		File srcfile= ts.getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyDirectory(srcfile, new File("./screenshots/Qsse10faild.png"));
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
