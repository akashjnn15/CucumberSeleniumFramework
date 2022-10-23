package utils;

import cucumber.api.Scenario;
import java.util.ArrayList;

public class DataSetter {

	static String appurl = "";
	static String withdrawlURL = "";
	public static String ScenarioTxt;
	public static String FeatureTxt;
	public static Scenario scena;
 static String  currfetureTxt="";
 
 
 

	public static String getCurrentFeature() {
	return DataSetter.currfetureTxt;
}

public static void setCurrentFeatureTxt(String currfeatureTxt) {
	DataSetter.currfetureTxt = currfeatureTxt;
}

	public static Scenario getScena() {
		return DataSetter.scena;
	}

	public static void setScena(Scenario scena) {
		DataSetter.scena = scena;
	}

	public static String getScenarioTxt() {
		return ScenarioTxt;
	}

	public static void setScenarioTxt(String scenarioTxt) {
		ScenarioTxt = scenarioTxt;
	}

	public static String getFeatureTxt() {
		return FeatureTxt;
	}

	public static void setFeatureTxt(String featureTxt) {
		FeatureTxt = featureTxt;
	}

	public static String getAppurl() {
		return appurl;
	}

	public static void setAppurl(String appurl) {
		DataSetter.appurl = appurl;
	}

	public static String getWithdrawlURL() {
		return withdrawlURL;
	}

	public static void setWithdrawlURL(String withdrawlURL) {
		DataSetter.withdrawlURL = withdrawlURL;
	}

	public static void setURL() {
		// TODO Auto-generated method stub

	}

	public static void setWithdrawalURL() {
		// TODO Auto-generated method stub

	}

}
