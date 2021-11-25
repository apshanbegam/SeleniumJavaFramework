package com.demo.testCases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.demo.pageObjects.OurProducts;

public class TC_OurProduct extends BaseClass{
	
	@Parameters("verification")
	@Test
	public void TC_OurProduct(String Verification) throws IOException, InterruptedException {
		
		
		OurProducts op = new OurProducts(driver);
		op.ClickOurProducts();

		
		if(driver.getTitle().equals(OurProductsTitle)) {
			Assert.assertTrue(true);
		}
		else {
			logger.info("Loading ProductPage failed");
			captureScreen(driver,"LoadProductPage");
			Assert.assertTrue(false);
			
		}
		
		op.scrolltoIamFAFindOutMore();
		op.clickIamFAFindOutMore();
		
		System.out.println(driver.getTitle());
		
		
		if(driver.getTitle().equals(FAFindOutMoreTitle)) {
			Assert.assertTrue(true);
		}
		else {
			logger.info("Loading FAFindOutMore failed");
			captureScreen(driver,"LoadFAFindOutMore");
			Assert.assertTrue(false);
			
		}	
		
		op.clickVerification(Verification);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		op.scrolltoTakeLookFundamentals();
		op.clickTakeLookFundamentals();
		
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		String currentHandle = driver.getWindowHandle();
		ArrayList tabs = new ArrayList(driver.getWindowHandles());
		System.out.println(tabs.size());
		
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
	}

}
