package com.Equarz.Testcases;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.base.Testbase;

public class LoginTest extends Testbase {
	Login_Functionality If;
	
	public  LoginTest () {
		super();
		
	}
	
	@BeforeMethod 
	public void Intialzation () {
		Setup();
		If = new Login_Functionality(driver);
		
		
   }
	@Test 
	public void  VerifyLogin() throws Exception {
		If.logindata();
		
	}
	



}
