package com.demo.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.pageObjects.LoadPage;

public class TC_LoadPage extends BaseClass {
	
	@Test
	public void TC_loadPage() throws IOException {
		
		logger.info("Page is loaded");
		
		driver.manage().window().maximize();

		LoadPage lp = new LoadPage(driver);
		lp.ClickContactUs();
		logger.info("ContactUs");
	
		if (driver.getTitle().equals(ContactUsTitle)){
			Assert.assertTrue(true);
		}
		else {	
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
		
		 
	}
}
