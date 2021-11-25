package com.demo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class LoadPage {
	
	WebDriver ldriver;

	public LoadPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Contact us')]")
	WebElement ContactUs;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[1]/a[1]/img[1]")
	WebElement AJBellIcon;
	
	public void ClickContactUs() {
		ContactUs.click();
	}
		
	public void ClickAJBellIcon() {
		AJBellIcon.click();
	}
	
	

	
	

}
