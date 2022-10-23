package com.facebook.test.Helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.facebook.test.elements_Factory.LoginPage_Elements;

import utils.DataSetter;

public class BaseTest extends LoggerClass {
	
	static {
		
		loadPropertyFile();
	}
	
	
	
	protected static WebDriver driver=null;
	protected static LoginPage_Elements loginWebe;

	public static void loadPropertyFile() {
		
		Properties prop= new Properties();
		InputStream input=null;
		String dir="src/main/resources/ConfigFiles/app.properties";
		
		try{
			
			input=new FileInputStream(dir);
			prop.load(input);
			DataSetter.setURL();
			DataSetter.setWithdrawalURL();
		}catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	
	public static void Intitilise(){
		
		BaseTest.driver=InitDriver.getCurrentDriver();
		BaseTest.loginWebe=PageFactory.initElements(BaseTest.driver, LoginPage_Elements.class);
	
	}

}
