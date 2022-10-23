package com.facebook.test.stepDefinition;

import com.facebook.test.Helpers.InitDriver;

import utils.CreateReports;
import utils.DataSetter;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.After;

public class A_CucumberReportConfigFile {
	public static int counter = 0;
	
	@Before
	public void before(final Scenario scenario) throws ClassNotFoundException {
		
		
		DataSetter.setScena(scenario);
	System.out.println(DataSetter.getScena().getName());	
	DataSetter.setScenarioTxt(DataSetter.getScena().getName());
	
	
	if(DataSetter.getCurrentFeature().equalsIgnoreCase(DataSetter.getScena().getId().split(";")[0].replace("-", " ").toUpperCase())){

		
		
		DataSetter.setFeatureTxt(DataSetter.getScena().getId().split(";")[0].replace("-", " ").toUpperCase());
		DataSetter.setCurrentFeatureTxt(DataSetter.getScena().getId().split(";")[0].replace("-", " ").toUpperCase());
	
	System.out.println(DataSetter.getFeatureTxt());
	CreateReports.GenSCENARIO();
	
	
	}
	
	else{
		
		if(A_CucumberReportConfigFile.counter > 0){
			
			InitDriver.close();
		}
	
	DataSetter.setFeatureTxt(DataSetter.getScena().getId().split(";")[0].replace("-", " ").toUpperCase());
	System.out.println(DataSetter.getFeatureTxt());
	DataSetter.setCurrentFeatureTxt(DataSetter.getScena().getId().split(";")[0].replace("-", " ").toUpperCase());
	CreateReports.IntiReports();
	CreateReports.createReportTest();
	CreateReports.GenSCENARIO();
	A_CucumberReportConfigFile.counter++;
	
	}
	
	
	}

	
	
	
	
	@After
	public void After(){
		
		CreateReports.writeToReport();
	}
	
}
