package Selenium_Jenkin.selenium_jenkin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Module extends TestDriver {
	

	/*Functional method*/
	public static void enterUserDetails(ExtentTest logger,WebDriver driver,String uName,String pWord, String url){
		
		/*Launch SalesForce Application*/
		driver.get(url);
		System.out.println("Salesforce application is launched...");
		logger.log(LogStatus.INFO, "Salesforce application is launched...");
		
		/*Enter Username in Username field*/
		WebElement userName = driver.findElement(By.xpath(".//*[@id='username']"));
		ReusableMethods.enterText(userName, uName, "UserName");
		System.out.println("userName is entered in userName field...");
		
		/*Enter Password in Password field*/
		WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		ReusableMethods.enterText(password, pWord, "Password");
		System.out.println("passWord is entered in passWord field...");
	}
	
	public static void clickLogin(){
		
		/*Click SFDC Login*/
		WebElement SFDClogin = driver.findElement(By.xpath(".//*[@id='Login']"));
		ReusableMethods.clickObj(SFDClogin, "SFDC Login");
		logger.log(LogStatus.INFO, "Login to SFDC button is clicked..");
	}
	
	public static void login(ExtentTest logger,WebDriver driver,String uName,String pWord, String url){
		
		enterUserDetails( logger, driver, uName, pWord,  url);

		clickLogin();

	}
	
	public static void checkRememberMeLogin(ExtentTest logger,WebDriver driver,String uName,String pWord, String url){
		enterUserDetails( logger, driver, uName, pWord,  url);
		
		/*Check RememberMe CheckBox*/
		WebElement CheckBox = driver.findElement(By.xpath(".//*[@id='rememberUn']"));
		ReusableMethods.clickObj(CheckBox , "RememberMeCheckBox");
		
		clickLogin();

	}
	
	public static void logout(ExtentTest logger,WebDriver driver,String uName,String pWord, String url) throws InterruptedException{
		
		enterUserDetails( logger, driver, uName, pWord,  url);

		clickLogin();
		
		Thread.sleep(4000);
		/*Click UserMenu dropdown*/
	    WebElement UserMenuDropDown =driver.findElement(By.xpath("//*[@id='userNavButton']"));
	    ReusableMethods.clickObj(UserMenuDropDown, "UserMenuDropDown is clicked...");
	    
	    Thread.sleep(6000);
	    WebElement logOut =driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[4]"));
	    ReusableMethods.clickObj(logOut, "logOut link is clicked...");

	}
	
	
}