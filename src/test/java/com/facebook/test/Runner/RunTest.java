package com.facebook.test.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.facebook.test.Helpers.InitDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/main/resources/featureFiles/Login.feature" }, glue = "com.facebook.test.stepDefinition")




public class RunTest {

	@BeforeClass
	public static void setup() {

	}

	@AfterClass
	public static void tearDown() {

		InitDriver.close();
	}

}
