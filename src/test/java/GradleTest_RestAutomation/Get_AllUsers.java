package GradleTest_RestAutomation;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import api.com.core.BaseTest;
import api.com.util.ExtentReport;
import api.com.util.ReadTestData;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.given;

import java.io.IOException;
public class Get_AllUsers extends BaseTest{
	
	
@Test
public void getAllusers_Test() throws IOException, ParseException {

	ExtentReport.extentlog=ExtentReport.extentreport.startTest("getAllusers_test","validation for the same");
	
	System.out.println("test for git");
	Response resp= given().
			when().get("https://api.publicapis.org/entries");
	//Response resp= given().when().get(ReadTestData.getTestdata("uri"));
	
	String responsebody= resp.body().asString();
	System.out.println(responsebody);
	/*
	 * String actualval= resp.path("entries[0].API");
	 * Assert.assertEquals(ReadTestData.getTestdata("entries_API"), actualval);
	 * System.out.println(actualval);
	 */
			
}

}
