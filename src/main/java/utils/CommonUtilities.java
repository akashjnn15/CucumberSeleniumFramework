package utils;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.facebook.test.Helpers.BaseTest;

public class CommonUtilities  extends BaseTest{
	
	
	public static WebElement waitForElement(final WebElement item){
		
		WebDriverWait wait = new WebDriverWait(BaseTest.driver, 90);
		wait.until(ExpectedConditions.elementToBeClickable(item));
		
		return item;
	}
	
	
	public static void parseException(final Class className, final String methodName, final Exception e, final boolean b) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IOException{
		
		
		if(e.toString().contains("NoSuchMethodException")){
			CreateReports.generateReport(className, methodName, "Unable to find Element", false);
			
		}else if (e.toString().contains("StaleElementReferenceException")){
			CreateReports.generateReport(className, methodName, "Element no more avaliable on the page", false);
					
		}else if(e.toString().contains("TimeoutException")){
			CreateReports.generateReport(className, methodName, "It took longer time to render on page", false);
				}else{
			
			CreateReports.generateReport(className, methodName, e, false);
		}
	}
	
	
public static void parseException(final Class className, final String methodName, final String annotation, final Exception e, final boolean b) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IOException{
		
		
		if(e.toString().contains("NoSuchMethodException")){
			CreateReports.generateReport(className, methodName, "Unable to find Element", false);
			
		}else if (e.toString().contains("StaleElementReferenceException")){
			CreateReports.generateReport(className, methodName, "Element no more avaliable on the page", false);
					
		}else if(e.toString().contains("TimeoutException")){
			CreateReports.generateReport(className, methodName, "It took longer time to render on page", false);
				}else{
			
			CreateReports.generateReport(className, methodName, e, false);
		}
	}
public static void parseExceptionForNegativeScenario(final Class className, final String methodName, final String annotation, final Exception e, final boolean b) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IOException{
	
	
	if(e.toString().contains("NoSuchMethodException")){
		CreateReports.generateReport(className, methodName, "Unable to find Element", false);
		
	}else if (e.toString().contains("StaleElementReferenceException")){
		CreateReports.generateReport(className, methodName, "Element no more avaliable on the page", false);
				
	}else if(e.toString().contains("TimeoutException")){
		CreateReports.generateReport(className, methodName, "It took longer time to render on page", false);
			}else{
		
		CreateReports.generateReport(className, methodName, e, false);
	}
}



}
