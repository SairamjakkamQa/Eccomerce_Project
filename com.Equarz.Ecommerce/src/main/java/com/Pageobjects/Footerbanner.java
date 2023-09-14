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

public class Footerbanner extends Testbase{
	
	@FindBy(xpath ="//button[@class='close __close']")
	WebElement Ad1;
	
	@FindBy(xpath = " //img[@class='d-block footer_banner_img __inline-63'] ")
	WebElement footban;
	
	@FindBy(xpath = "//a[@href='http://e-quarz.com/product/aeropostale-womens-slim-fit-jeans-cqB0pU']")
	WebElement prdt;
	
	@FindBy(xpath = "//button[@class='buy_btn']")
	WebElement dealbuy;
	
	@FindBy(xpath = "//span[text()='Add to cart']")
    WebElement cart2;
	
	@FindBy(xpath = "//div[@class='toast toast-success']")
	WebElement success;
	
	public  Footerbanner (WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	public void footban() {
		Ad1.click();
	   footban.click();
	   prdt.click();
	   cart2.click();
	   wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		 String msg=wait.until(ExpectedConditions.visibilityOf(success)).getText();
	 	assertEquals("Successfully added!", msg);
		
	}
	
	public void dealday () throws InterruptedException {
		Ad1.click();
		Thread.sleep(3000);
		   dealbuy.click();
		   cart2.click();
		   wait= new WebDriverWait(driver, Duration.ofSeconds(15));
			 String msg=wait.until(ExpectedConditions.visibilityOf(success)).getText();
		 	assertEquals("Successfully added!", msg);
		
		
	}
	
	
	
	
	

}
