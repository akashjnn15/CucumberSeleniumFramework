package com.facebook.test.stepDefinition;

import java.util.concurrent.TimeUnit;

import utils.CommonUtilities;
import utils.CreateReports;

import com.facebook.test.Helpers.BaseTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class LoginTest 
    extends BaseTest
{
	

@Given("^User launch the FaceBook$")
public void user_launch_the_FaceBook() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	try{
		  BaseTest.Intitilise();
		
		  BaseTest.driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		
		
		  driver.get("http://www.facebook.com");
		  
		CreateReports.generateReport(getClass(), "User loginto in Facebook", "Given", "", true);
		
		}catch(Exception e){
			e.printStackTrace();
			CommonUtilities.parseException(getClass(), "User loginto in Facebook", e, false);
		}
}

@When("^User provides the invalid un and pwd$")
public void user_provides_the_invalid_un_and_pwd() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	
	
	try{
	  
	CreateReports.generateReport(getClass(), "User loginto in Facebook", "Given", "", true);
	}catch(Exception e){
		
		CommonUtilities.parseException(getClass(), "User loginto in Facebook", e, false);
	}
}


	@Given("^User launch the FaceBook \"([^\"]*)\"$")

	    // Write code here that turns the phrase above into concrete actions
		public void user_launch_the_FaceBook(String arg1) throws Throwable {
			try{
			
			
		  BaseTest.Intitilise();
		  BaseTest.driver.get(arg1);
		  BaseTest.driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		  
		  
			CreateReports.generateReport(getClass(), "User launch the Facebook with"+ arg1, "Given", "", true); 
			}catch(Exception e){
				e.printStackTrace();
				CommonUtilities.parseException(getClass(), "User launch the Facebook with"+ arg1, e, false);
				
			}
	}

    
/*	@Given("^User launch the FaceBook \"([^\"]*)\"$")
	public void user_launcRh_the_FaceBook(String arg1) throws Throwable {
		try{
		
		
	  BaseTest.Intitilise();
	  BaseTest.driver.get(arg1);
	  BaseTest.driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
	  
	  
		CreateReports.generateReport(getClass(), Thread.currentThread().getStackTrace()[1].getMethodName(), "Given", "", true);
		}catch(Exception e){
			CommonUtilities.parseException(getClass(), Thread.currentThread().getStackTrace()[1].getMethodName(), e, false);
			
		}
	}*/

	@When("^User provides the invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_provides_the_invalid_and(String arg1, String arg2) throws Throwable {
		try{
			
			
			
			  
			  
				CreateReports.generateReport(getClass(), "User loginto in Facebook", "Given", "", true);
				}catch(Exception e){
					
					CommonUtilities.parseException(getClass(), "User loginto in Facebook", e, false);
				}
	}

	@And("^User click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
try{
			
			
			Thread.sleep(100);
			  
			  
				CreateReports.generateReport(getClass(), "User loginto in Facebook", "Given", "", true);
				}catch(Exception e){
					
					CommonUtilities.parseException(getClass(), "User loginto in Facebook", e, false);
				}
	}

	@Then("^User should be able to login in FaceBook$")
	public void user_should_be_able_to_login_in_FaceBook() throws Throwable {
try{
			
			
			Thread.sleep(100);
			  
			  
				CreateReports.generateReport(getClass(), "User loginto in Facebook", "Given", "", true);
				}catch(Exception e){
					
					CommonUtilities.parseException(getClass(), "User loginto in Facebook", e, false);
				}
	}

	@And("^Should get the Error Message$")
	public void should_get_the_Error_Message() throws Throwable {
try{
			
			
			Thread.sleep(100);
			  
			  
				CreateReports.generateReport(getClass(), "User loginto in Facebook", "Given", "", true);
				}catch(Exception e){
					
					CommonUtilities.parseException(getClass(), "User loginto in Facebook", e, false);
				}
	}





}
