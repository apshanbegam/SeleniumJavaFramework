package com.demo.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

public class OurProducts {
	WebDriver ldriver;

	public OurProducts(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	JavascriptExecutor js = (JavascriptExecutor) ldriver;
	
	@FindBy(xpath = "//a[contains(text(),'Our products')]")
	WebElement OurProducts;
	
	@FindBy(xpath = "//body/div[1]/div[1]/main[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/article[1]/a[2]")
	WebElement IamFAFindOutMore;
	
	@FindBy(id = "gateway-adviser")
	WebElement FinancialPro;
	
	@FindBy(id = "gateway-customer")
	WebElement CustomerA;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/main[1]/div[1]/section[1]/article[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/figure[1]/picture[1]/img[1]")
	WebElement TakeLookFundamentals;
	
	public void ClickOurProducts() {
		OurProducts.click();
	}
	
	public void scrolltoIamFAFindOutMore() {
		
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView();", IamFAFindOutMore);
	}
	
	
	public void clickIamFAFindOutMore() {
		IamFAFindOutMore.click();
	}
	
	
	public void clickVerification(String verify) {
		
			if (verify.equals("financialProfessional")) {
				FinancialPro.click();
			}
			else if(verify.equals("customerArea")) {
				CustomerA.click();
			}
	}
	
	public void scrolltoTakeLookFundamentals() {
		
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView();", TakeLookFundamentals);
	}

	public void clickTakeLookFundamentals() {
		
		TakeLookFundamentals.click();
		
	}
	
	
		
	
}
