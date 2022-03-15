package com.Page_Object_Manager;

import org.openqa.selenium.WebDriver;

import com.POM.Hotel_Search;
import com.POM.Login_Page;

public class Page_Object_Manager {
	
	public  WebDriver driver;
	private Login_Page lp;
	private Hotel_Search hotelSearch;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver= driver2;
	}
	
	public Login_Page getInstanceLogin_Page() {
		if (lp == null) {
			lp = new Login_Page(driver);
		}
		
		return lp;
	}
	
	public Hotel_Search holtelSearchInstance() {
		if (hotelSearch == null) {
			hotelSearch = new Hotel_Search(driver);
		}
		return hotelSearch;
	}
	

	
}
