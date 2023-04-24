package api.com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadTestData {
	
	public static JSONObject getJsondata() throws IOException, ParseException {
		
		File filename= new File("C:\\Users\\1030205\\eclipse-workspace\\Purchase_details\\lib\\Resources\\Testdata\\testdata.json");
		
		String json=FileUtils.readFileToString(filename, "UTF-8");
		
		Object obj= new JSONParser().parse(json);
		JSONObject jsonobject=(JSONObject) obj;
		return jsonobject;
		
		
		
}
	public static String getTestdata(String keyname) throws IOException, ParseException {
		String Testdata;
		return Testdata= (String)getJsondata().get(keyname);
	}
}
