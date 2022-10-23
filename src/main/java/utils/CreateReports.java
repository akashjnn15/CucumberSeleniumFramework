package utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.facebook.test.Helpers.BaseTest;

public class CreateReports extends BaseTest {

	public static ExtentHtmlReporter htmlReporter;

	public static ExtentReports extent = new ExtentReports();

	public static ExtentTest feature;

	public static ExtentTest scenario;

	public static ExtentTest test;

	public static void IntiReports() {

		CreateReports.htmlReporter = new ExtentHtmlReporter(
				"Reports/Report.html");
		CreateReports.extent.attachReporter(CreateReports.htmlReporter);
		CreateReports.htmlReporter.config().setReportName("FaceBook Akash");

	}

	public static void createReportTest() {

		CreateReports.feature = CreateReports.extent.createTest(DataSetter
				.getFeatureTxt());

	}

	public static void GenSCENARIO() throws ClassNotFoundException {

		CreateReports.scenario = CreateReports.feature.createNode(
				new GherkinKeyword("Scenario"), DataSetter.getScenarioTxt());

	}

	public static void GenGIVENResult(final String giventxt, final boolean bool)
			throws ClassNotFoundException {

		if (bool) {
			CreateReports.scenario.createNode(new GherkinKeyword("Given"),
					giventxt, "Test Pass because of").pass("pass");
			CreateReports.scenario.log(Status.PASS, "Test Pass");

		} else {
			CreateReports.scenario.createNode(new GherkinKeyword("Given"),
					giventxt, "Test Fail because of").fail("fail");

		}
	}

	public static void GenANDResult(final String andtxt, final boolean bool)
			throws ClassNotFoundException {

		if (bool) {
			CreateReports.scenario.createNode(new GherkinKeyword("And"),
					andtxt, "Test Pass because of").pass("pass");
			CreateReports.scenario.log(Status.PASS, "Test Pass");

		} else {
			CreateReports.scenario.createNode(new GherkinKeyword("And"),
					andtxt, "Test Fail because of").fail("fail");

		}
	}

	public static void GenWHENResult(final String whentxt, final boolean bool)
			throws ClassNotFoundException {

		if (bool) {
			CreateReports.scenario.createNode(new GherkinKeyword("When"),
					whentxt, "Test Pass because of").pass("pass");
			CreateReports.scenario.log(Status.PASS, "Test Pass");

		} else {
			CreateReports.scenario.createNode(new GherkinKeyword("When"),
					whentxt, "Test Fail because of").fail("fail");

		}
	}

	public static void GenTHENResult(final String thentxt, final boolean bool)
			throws ClassNotFoundException {

		if (bool) {
			CreateReports.scenario.createNode(new GherkinKeyword("Then"),
					thentxt, "Test Pass because of").pass("pass");
			CreateReports.scenario.log(Status.PASS, "Test Pass");

		} else {
			CreateReports.scenario.createNode(new GherkinKeyword("Then"),
					thentxt, "Test Fail because of").fail("fail");

		}
	}

	public static void GenBUTResult(final String buttxt, final boolean bool)
			throws ClassNotFoundException {

		if (bool) {
			CreateReports.scenario.createNode(new GherkinKeyword("But"),
					buttxt, "Test Pass because of").pass("pass");
			CreateReports.scenario.log(Status.PASS, "Test Pass");

		} else {
			CreateReports.scenario.createNode(new GherkinKeyword("But"),
					buttxt, "Test Fail because of").fail("fail");

		}
	}

	public static void writeToReport() {

		CreateReports.extent.flush();

	}

	public static void GenReport(final Class<?> cls, final String Methodname,
			final String optionalTxt, final boolean value)
			throws NoSuchMethodException, SecurityException,
			ClassNotFoundException {

	}

	public static void ExceptionParser(final Class cls,
			final String Methodname, final Exception e)
			throws NoSuchMethodException, SecurityException,
			ClassNotFoundException {

	}

	public static void screenshot() {

		CreateReports.test = CreateReports.extent.createTest("TestName");
	}

	public static void generateReport1(final Class className,
			final String methodName, final String anotation,
			final String actual, final boolean value)
			throws ClassNotFoundException, IOException {

		String excepted = AddToReportMethod.getAnotationText(className,
				methodName, anotation);

		CreateReports.generateReport(excepted, actual, anotation, value);

	}

	public static void generateReport(final Class className,
			final String methodName, final String actual, final boolean value)
			throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, IOException {

		String anotation = className.getMethod(methodName).getAnnotations()[0]
				.annotationType().getSimpleName();

		String excepted = AddToReportMethod.getAnotationText(className,
				methodName, anotation);

		CreateReports.generateReport(excepted, actual, anotation, value);

	}

	public static void generateReport(final Class className,
			final String methodName, final Exception e, final String excepted,
			final String anotation, final String actual, final boolean value)
			throws ClassNotFoundException, NoSuchMethodException,
			SecurityException, IOException {

		CreateReports.generateReport(excepted.toUpperCase(), actual, anotation,
				value);

	}

	public static void generateReport(final Class className,
			final String excepted, final String anotation, final String actual,
			final boolean value) throws ClassNotFoundException,
			NoSuchMethodException, SecurityException, IOException {

		CreateReports.generateReport(excepted.toUpperCase(), actual, anotation,
				value);

	}
	
	

	public static void generateReport(final Class className, final String methodName, final Exception e, final boolean value) throws ClassNotFoundException,
			NoSuchMethodException, SecurityException {
		String anotation=className.getMethod(methodName).getAnnotations()[0]
				.annotationType().getSimpleName();
		String excepted=AddToReportMethod.getAnotationText(className, methodName, anotation);

		CreateReports.generateReport(excepted, e, anotation,  value);

	}	
	
	
	
	
	public static void generateReport(final Class className, final String methodName,final String annotation, final Exception e, final boolean value) throws ClassNotFoundException,
	NoSuchMethodException, SecurityException, IOException{
String excepted=AddToReportMethod.getAnotationText(className, methodName, annotation);

CreateReports.generateReport(excepted, e, annotation,  value);

}	
	
	
	
	
	public static void generateReport(final String expected, final String actual,final String anotation, final boolean value) throws ClassNotFoundException,
	IOException {

		DateFormat dateFormat= new SimpleDateFormat("yyyyMMddHHmmss");
		Date date= new Date();
		String s = dateFormat.format(date);
		File scrFile=((TakesScreenshot)BaseTest.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("reports/screenshots/"+ s + ".png"));
		if (value){
			
			CreateReports.scenario.createNode(new GherkinKeyword(anotation), expected).pass("Pass").addScreenCaptureFromPath("screenshots/"+ s + ".png", anotation + s);
			
			
		}
		else{
			CreateReports.scenario.createNode(new GherkinKeyword(anotation), expected, "Exception Occured as:-" + actual).fail("fail").addScreenCaptureFromPath("screenshots/"+ s + ".png", anotation + s);
			
		}
		
		
		
		
			
		
}	
	
	
	
	private static void generateReport(final String expected,
			final Exception e, final String anotation, final boolean value)
			throws ClassNotFoundException {
		System.out.println("In generate Report");
		System.out.println("Exception as :-" + e.toString());
		String s = e.toString();
		String start = StringUtils.substringBeforeLast(s, "(");
		System.out.println("String " + start);
		CreateReports.scenario.createNode(new GherkinKeyword(anotation), expected, "Actual Result :- Excection Occured:- " + start)
				.fail("fail");

	}

}
