package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class Registerpage extends Testbase {
	
	@FindBy(xpath = "//input[@name='f_name']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@name='l_name']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone;
	
	@FindBy(id = "si-password")
	WebElement pass;
	
	@FindBy(name = "con_password")
	WebElement con_pass;
	
	@FindBy(id = "inputCheckd")
	WebElement checkbox;
	
	@FindBy(id = "sign-up")
	WebElement signup;
	
	
	public Registerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public homepage VerifyRegistartion( String first, String last , String emailid , String phonenumber , String password , String confimpass ) throws Exception {

		firstname.sendKeys(first);
		lastname.sendKeys(last );
		email.sendKeys(emailid);
		phone.sendKeys(phonenumber);
		pass.sendKeys(password);
		con_pass.sendKeys(confimpass);
	  checkbox.click();
	  Thread.sleep(15000);
	  signup.click();
	  
	  return new homepage ();

		
	}

	
	
	
	


}
