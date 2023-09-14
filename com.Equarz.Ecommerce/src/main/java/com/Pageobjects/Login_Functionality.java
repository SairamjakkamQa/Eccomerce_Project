package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Login_Functionality extends Testbase {
	
	@FindBy(id="si-email")
	WebElement Username;
	
	@FindBy(id="si-password")
	WebElement password;
	
	@FindBy(xpath = "//button[text()='Sign in']")
	WebElement signin;
	
	public Login_Functionality( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public homepage logindata() throws Exception {
		Username.sendKeys(props.getProperty("username"));
		password.sendKeys(props.getProperty("password"));
		Thread.sleep(10000);
		signin.click();
		
		return new homepage();
		
		
		
		
		
		
	}
	
	

	

	
}
