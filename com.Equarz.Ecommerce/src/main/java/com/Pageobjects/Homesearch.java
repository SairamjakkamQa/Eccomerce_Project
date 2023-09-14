package com.Pageobjects;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Testbase;

public class Homesearch  extends Testbase{
	
	@FindBy(xpath ="//button[@class='close __close']")
	WebElement Ad3;
	
	@FindBy (xpath = "//img[@src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-22-64944736cf441.png']")
	WebElement homeprod;
	
	@FindBy(xpath = "//span[text()='Add to cart']")
    WebElement cart2;
	
	@FindBy(xpath = "//div[@class='toast toast-success']")
	WebElement success;
	
	public  Homesearch (WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	public void Homeserrch () {
		Ad3.click();
		homeprod.click();
		cart2.click();
		wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		 String msg=wait.until(ExpectedConditions.visibilityOf(success)).getText();
	 	assertEquals("Successfully added!", msg);
		
	}

}
