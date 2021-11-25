package com.demo.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.pageObjects.LoadPage;

public class TC_LoadHomePage extends BaseClass {
	
	@Test
	public void TC_loadHomePage() throws IOException {

		LoadPage lp = new LoadPage(driver);
		lp.ClickAJBellIcon();
		 		
		if(driver.getTitle().equals(AJBellHomeTitle)) {
			Assert.assertTrue(true);
		}
		else {
			logger.info("Loading homepage failed");
			captureScreen(driver,"loadhomePage");
			Assert.assertTrue(false);
			
		}
		
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
