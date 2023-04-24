package GradleTest_RestAutomation;

import org.testng.annotations.Test;

import api.com.core.BaseTest;
import api.com.util.ExtentReport;
import api.com.util.Helper;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import junit.framework.Assert;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Getmethod extends BaseTest{

	
	@Test(description="validate the status code")
	
	public void statuscodetest() throws FileNotFoundException {
		ExtentReport.extentlog=ExtentReport.extentreport.startTest("statuscode_test","validation for the same");
		
		  Response resp=given() .when() .get("https://reqres.in/api/users");
		 
		//Response resp=given().when().get(Helper.PropertyReader("qabaseurl"));
		String resbody= resp.getBody().asString();
		System.out.println(resbody);
		System.out.println(resp.getHeaders());
		Assert.assertEquals(resp.statusCode(), 200);
		System.out.println("Test passed");
		//List<String> list=new ArrayList<>(resp.path("data[0]"));
		//HashMap<String,String> map= new HashMap<>(resp.path("data[0]"));
		//System.out.println(map);
		
		
		
		
		
	}
	
	@Test(description="validate total for page2 is 12")
	public void page_total() {
		ExtentReport.extentlog=ExtentReport.extentreport.startTest("page_test","validation for the same");
		Response resp=given()
				.queryParam("page", "2").when().get("https://reqres.in/api/users");
		
	
		int actualtotalval=resp.path("total");
		System.out.println(actualtotalval);
		Assert.assertEquals(actualtotalval, 12);
		
	}
	
	@Test(description="get the numer of hashmaps")
	public void detailsof7thid() {
		ExtentReport.extentlog=ExtentReport.extentreport.startTest("get the numer of hashmaps","validation for the same");
		Response resp=given()
				.queryParam("page", "2").when().get("https://reqres.in/api/users");
		int i= resp.path("data[1].id");
		
		JsonPath j= new JsonPath(resp.asString());
	int size=	j.getInt("data.size()");
		System.out.println(size);
		
	}
	

	
	@Test(description="get size of array")
	
	public void getnamesfromlist() {
		ExtentReport.extentlog=ExtentReport.extentreport.startTest("get size of array","validation for the same");
		
		Response resp= given()
				.when().get("https://reqres.in/api/unknown");
		
		//JsonPath j= new JsonPath(resp.asString());
		//List<String> li= new ArrayList<>();
		        
		//int size=j.getInt("data.size()");
		int size=resp.path("data.size()");
				System.out.println("*****************");
		
		
		//resp.path("")
		for(int i=0;i<size;i++) {
			//String name= j.getString("data["+i+"].name");
			String name1=resp.path("data["+i+"].name");
			System.out.println(name1);
			/*if(name.equals("cerulean")) {
				
				break;
				
				
			}*/
				
		}
		
		
			
		
			
	
	
	
	}
	@Test
	public void getting_the_headers() {

		ExtentReport.extentlog=ExtentReport.extentreport.startTest("getting _headers","validation for the same");
		Response resp= given()
				.when().get("https://reqres.in/api/unknown");
	 Headers headers= resp.headers();
	 
	 for(Header h:headers) {
		 System.out.println(h);
		 if(h.equals("Content-Type")){
			 System.out.println(h.getValue());
		 }
	 }
		
	}
	
	@Test
	public void getting_the_Responsebody() {
		ExtentReport.extentlog=ExtentReport.extentreport.startTest("Response_body","validation for the same");
	Response resp= given()
			.when().get("https://reqres.in/api/unknown");
	String resbody= resp.body().asString();
	
	Assert.assertEquals(resbody.contains("cerulean"), true);
	
	}
	
	
}
	

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		







