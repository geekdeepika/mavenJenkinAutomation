package Selenium_Jenkin.selenium_jenkin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestDriver {

	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest logger;
	
	 @BeforeTest
	  public void beforeTest() {
	  }
	
	  @Test

	public  void mainTest()  {
		try {
			System.out.println("inside main test");
			String userHome = System.getProperty("user.home");
			String path =  "c:\\users\\deepika\\report\\salesforceExtentReport.html";
			
			String dtPath = "c:\\users\\deepika\\Documents\\Testsuite\\testSuite1.xls";
			String[][] recData = ReusableMethods.readExcel(dtPath, "Sheet1");
			
			
			for(int i =0; i<recData.length;i++){
				
				if(recData[i][0].equalsIgnoreCase(("Y"))){

					String tc = recData[i][1];
					System.out.println("before firefox initialized");

					System.setProperty("webdriver.gecko.driver", "C:\\software\\geckodriver.exe");
					//FirefoxOptions options = new FirefoxOptions();
					//options.setHeadless(true);
					
					driver = new FirefoxDriver();
					
					report = new ExtentReports(path);
					System.out.println("before logger started");

					logger = report.startTest(tc);
					
					//Java reflection or Java reflexive API
					Method testScript = AutomationScript.class.getMethod(tc);
					testScript.invoke(tc);
					
					
					driver.quit();
					report.endTest(logger);
					report.flush();


				}
						
			}
			
		}catch(Exception e) {
			
		}
		
}


}


/*public class Driver {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest logger;

	public static void main(String[] args) {
		String dtPath = "";
		String tc = ReUsableMethods.readExcel
		
		System.setProperty("webdriver.gecko.driver", "C:\\software\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		
		String userhome = System.getProperty("user.Home");
		String path = userhome + "C:/Users/deepika/report/salesforceExtentReport.html";
		report = new ExtentReports("C:/software/Report/salesforceExtentReport.html");
		logger = report.startTest("salesforceExtentReport...");
		
		
		Java reflection or java reflexive API
		Method testScript = AutomationScript.class.getMethod("forgotPasswordA4");
		testScript.invoke("forgotPasswordA4");
		
        
        try {
			//AutomationScript.LoginErrorMessage1();
			//AutomationScript.loginToSFDC2();
			//AutomationScript.CheckRemeberMe3();
			//AutomationScript.forgotPasswordA4();
			//AutomationScript.ForgotPasswordB5();
			//AutomationScript.TC05();
			//AutomationScript.TC06();
			//AutomationScript.TC07();
			//AutomationScript.TC08();
			//AutomationScript.TC09();
			//AutomationScript.TC10CreateAccount();
			//AutomationScript.TC11CreateNewView();
        	//AutomationScript.TC12EditView();
        	//AutomationScript.TC13MergeAccounts();
        	//AutomationScript.TC14();
        	//AutomationScript.TC15();
        	//AutomationScript.TC16();
        	//AutomationScript.TC17();
        	//AutomationScript.TC18();
        	//AutomationScript.TC19();
        	//AutomationScript.TC20leadsTab();
        	//AutomationScript.TC21leadsSelectView();
        	//AutomationScript.TC22defaultView();
        	//AutomationScript.TC23();
        	//AutomationScript.TC24();
        	//AutomationScript.TC25();
        	//AutomationScript.TC26();
        	//AutomationScript.TC27();
        	//AutomationScript.TC28();
        	//AutomationScript.TC29();
        	//AutomationScript.TC30();
        	//AutomationScript.TC31();
        	//AutomationScript.TC32();
        	//AutomationScript.TC33();
        	//AutomationScript.TC34();
        	//AutomationScript.TC35();
        	AutomationScript.TC36();
        	//AutomationScript.TC37();
        	
        	
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		driver.quit();
		
		report.endTest(logger);
		report.flush();
		

	}

}
*/