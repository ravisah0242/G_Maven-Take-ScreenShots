package com.tests.screenshots;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.generics.crossBrowser.BaseTest;
import com.pages.crossBrowser.ActitimeLoginPage;


@Listeners(com.generics.screenshots.Screenshot.class)

public class TestActitime  extends BaseTest
{
	
	@Test
	public void signupMath() throws IOException
	{
		ActitimeLoginPage login=new  ActitimeLoginPage(driver);
		login.loginMethod();
	}

}
