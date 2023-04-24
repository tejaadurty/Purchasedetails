package api.com.util;

import java.io.File;
import java.io.FileNotFoundException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport {
	public static ExtentReports extentreport=null;
	public static ExtentTest extentlog;
    
	public static void initialize(String path) throws FileNotFoundException {
		if (extentreport == null) {
			extentreport = new ExtentReports(path, true);
			extentreport.addSystemInfo("Host Name", System.getProperty("user.name"));
			extentreport.addSystemInfo("Environment", Helper.PropertyReader("executionEnv"));
			extentreport.addSystemInfo("Build_Version", Helper.PropertyReader("build"));
			extentreport.loadConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));
		}
	}
}