package com.Equarz.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.BannerCart;
import com.Pageobjects.CategoryCart;
import com.Pageobjects.Homesearch;
import com.Pageobjects.Login_Functionality;
import com.Pageobjects.SearchProduct;
import com.base.Testbase;

public class cart  extends Testbase{
	Login_Functionality LF;
	Homesearch Hs;
	
	public  cart () {
		super();
	}
	
	@BeforeMethod 
	public void Intialzation () throws Exception {
		Setup();
		Hs = new Homesearch(driver);
		LF= new Login_Functionality(driver);
		LF.logindata();


}
	@Test
	public void Verifycart() {
		Hs.Homeserrch();
	}
}
