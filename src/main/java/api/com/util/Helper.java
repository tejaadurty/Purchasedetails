package api.com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class Helper {
	
	public static String PropertyReader(String key) throws FileNotFoundException {
		String value= "null";
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/common.properties");
		
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 value=prop.getProperty(key);
		
		
		
		
		
		
		return value;
		
		
		
		
		
	}
	public static void CreateFolder(String path) {
		
		File file= new File(path);
		if(!file.exists()) {
			file.mkdir();
			
			
		}
		else {
			System.out.println("Folder already created");
		}
	}
	
	public static String Timestamp() {
		Date now =new Date();
		String Timestamp=now.toString().replace(":", "-");
		return Timestamp;
	}

}
