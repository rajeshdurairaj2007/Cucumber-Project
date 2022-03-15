package com.Base_Class;
//this is Base Class
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
public static  WebDriver driver; //null driver
	
	public static WebDriver getBrowser(String type) {
		
		if(type.equalsIgnoreCase("Chromedriver")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driverfolder\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		} else if (type.equalsIgnoreCase("firfox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();	
		}
		return driver;
      }
	
	public static void url(String url) {
		driver.get(url);

	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void timeout(int waitime) {
		driver.manage().timeouts().implicitlyWait(waitime, TimeUnit.SECONDS);
	}
	
	public static void sleep(long millions) throws Throwable{
	     Thread.sleep(millions);
     }
	
	public static void close() {
		driver.close();
	}
	
       public static void DropDown(WebElement element,String value, String type) {
		Select s=new Select(element);
		if(type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("byVissibleText")) {
			s.selectByVisibleText(value);
        } 
		 else if (type.equalsIgnoreCase("byIndex")) {
        	int index = Integer.parseInt(value);
        	s.selectByIndex(index);
        }
	}
			
	}
	
