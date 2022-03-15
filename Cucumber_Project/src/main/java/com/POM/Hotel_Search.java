package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Search {
	public static WebDriver driver;
	
	public Hotel_Search (WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

}
