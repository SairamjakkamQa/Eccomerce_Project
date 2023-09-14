package com.Pageobjects;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Testbase;

public class CategoryCart extends Testbase {
	@FindBy(xpath ="//button[@class='close __close']")
	WebElement Ad;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	WebElement Elec;
	
	@FindBy(xpath = "//span[text()='Mobile Accessoires']")
	WebElement Mob;
	
	@FindBy(xpath = "//a[text()='Cases And Covers']")
	WebElement Case;
	
	@FindBy(xpath = "//*[@id=\"ajax-products\"]/div[3]/div/div/div[2]/div[1]/a")
	WebElement prodt;
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	WebElement cart1;
	
	@FindBy(xpath = "//div[@class='toast toast-success']")
	WebElement success;
	
	
	public  CategoryCart (WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	public void AddCart() {
		Ad.click();
	Actions ac= new Actions(driver);
	 ac.moveToElement(Elec).build().perform();
	 ac.moveToElement(Mob).build().perform();
	 Case.click();
	 prodt.click();
	 cart1.click();
	 wait= new WebDriverWait(driver, Duration.ofSeconds(15));
	 String msg=wait.until(ExpectedConditions.visibilityOf(success)).getText();
 	assertEquals("Successfully added!", msg);
	}

}
