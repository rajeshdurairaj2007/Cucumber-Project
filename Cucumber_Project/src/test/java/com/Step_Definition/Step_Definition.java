package com.Step_Definition;


import org.openqa.selenium.WebDriver;


import com.Base_Class.Base_Class;
import com.File_Reader_Manager.File_Reader_Manager;
import com.Page_Object_Manager.Page_Object_Manager;
import com.Runner_Class.Runner_Class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class{
	     
	 public static WebDriver driver= Runner_Class.driver; 
	 public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	  
	  @Given("^User Launch The Application$")
	  public void user_Launch_The_Application() throws Throwable {
		  String url=File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		   url(url);

	  }

	  @When("^User Enter The Username In Username Field$")
	  public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		  inputValueElement(pom.getInstanceLogin_Page().getUsername(), "dynamicrajesh");

	  }

	  @When("^User Enter The Password In Password Field$")
	  public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		  inputValueElement(pom.getInstanceLogin_Page().getPassword(), "pass@123");

	  }

	  @Then("^User click On The Login Button And It Navigate To Search Hotel$")
	  public void user_click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel() throws Throwable {
		  clickOnElement(pom.getInstanceLogin_Page().getLogin_btn());
	    
	  }


}

