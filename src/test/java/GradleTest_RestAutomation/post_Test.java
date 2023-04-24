package GradleTest_RestAutomation;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import Gradle_RestAutomation.POJO;
import Gradle_RestAutomation.POJO_userregistration;
import api.com.core.BaseTest;
import api.com.util.ExtentReport;
import api.com.util.RandomUtil;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;





public class post_Test extends BaseTest{
	
	@Test(enabled=false)
	public void postwithexternalfile() throws IOException {
		
		File file= new File("C:\\Users\\1030205\\eclipse-workspace\\Gradle_RestAutomation\\lib\\Resources\\Testdata\\postmethodjson.json");
		FileInputStream fis=new FileInputStream(file);
		
		
		Response resp= given().body(IOUtils.toString(fis,"UTF-8")).when().post("https://reqres.in/api/users");
	Assert.assertEquals(resp.getStatusCode(), 201);
		String body=resp.body().asString();
		System.out.println(body);
		
				
	
	
	}
	
	@Test
	public void postwithpojo() {
		ExtentReport.extentlog=ExtentReport.extentreport.startTest("Pojo_test","validation for the same");
		
		POJO pojo=new POJO();
		
		pojo.setEmail("eve.holt@reqres.in");
		pojo.setPassword("pistol");
		

		Response resp= given().body(pojo).when().post("https://reqres.in/api/users");
	Assert.assertEquals(resp.getStatusCode(), 201);
		String body=resp.body().asString();
		System.out.println(body);
		
		
		
	}
	@Test(description="registriion")
	public void postwithpojo_userreg() {
		ExtentReport.extentlog=ExtentReport.extentreport.startTest("Registration","validation for the same");
		
		
		POJO_userregistration userreg= new POJO_userregistration();
		String name=RandomUtil.generaterandomstring();
		String email=RandomUtil.generaterandomEmail();
		System.out.println(email);
		
		userreg.setName(name);
		userreg.setEmail(email);
		userreg.setPassword("Teja@22");
		
		Response resp= given().contentType(ContentType.JSON)
				.body(userreg).when().post("http://restapi.adequateshop.com/api/authaccount/registration");
		
		String body= resp.getBody().asString();
		System.out.println(body);
		String s=resp.path("data.Name");
		System.out.println(s);
		
		Assert.assertEquals(resp.getStatusCode(), 200);
		Assert.assertEquals(resp.path("data.Name"),name);

		
		
		}
	


}
