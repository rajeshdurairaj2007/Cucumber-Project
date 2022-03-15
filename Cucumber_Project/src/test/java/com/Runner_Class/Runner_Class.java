	package com.Runner_Class;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base_Class.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\features_File\\ALogin.feature", 
                  glue = "com.Step_Definition", 
                  dryRun = false,
                  strict = true,
                  monochrome = true,
                  plugin = {
                			"pretty", "html:report",
                			"com.cucumber.listener.ExtentCucumberFormatter:Report/extentReport.html" })

public class Runner_Class {

	   
	 public static WebDriver driver;
	 
	 @Before
	 public static void Set_Up(){
	   driver = Base_Class.getBrowser("chromedriver");
	 }
	 
	 @After
	 public static void tearDown() { 
  //   Base_Class.close();

	 }
	  
	 }

