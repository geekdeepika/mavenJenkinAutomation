package Selenium_Jenkin.selenium_jenkin;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendRep {
	static ExtentReports report;
	static ExtentTest logger;
	
	public static void main(String[] args) {
		
		String userHome = System.getProperty("user.home");
		String path = userHome + "C:\\Users\\deepika\\Report\\Test.html";
		//System.out.println(userHome);
		
		report = new ExtentReports("C:\\software\\Report\\Test.html");
		logger = report.startTest("Login to SFDC...");
		logger.log(LogStatus.PASS, "Firefox browser launched...");
		report.endTest(logger);
		report.flush();
	}

}
