package Selenium_Jenkin.selenium_jenkin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/* How do you map, Test case --> Test Script --> Test Data
 * By keeping same name for all these.
 * Selenium webdriver command
 * 
 * all the links from a given webpage
 * 
 * first 15 sfdc test cases automate it
 * 
 * Firefox : 55 version
 * GeckoDriver : 0.19 version
 * Selenium WebDriver : 3.8.1
 * 
 * What is the difference between Selenium 2 and selenium 3?
 * Selenium 2 can interact with the browser directly ,but
 * selenium 3 can interact with the browser with the help of gecko driver.
 * 
 * Selenium identifies every object as webelement.
 * 
 * What is the biggest challenge in automation industry?
 * Identifying the object.
 * 
 * When we are suppose to go with getAttribute and getText?
 * if something we have to read from text we need to use getattribute and
 * Elements which does not have any attribute in it that time we have to go with gettext.\
 * 
 * What are the reporting tools you have worked with?
 * Log4j, TestNG , ExtendReport, HTML Reporting
 * 
 * What is the difference between driver.close() and driver.quit()?
 * driver.close():Close the current browesr.
 * driver.quit():It will close all the application.
 * 
 */


public class AutomationScript extends ReusableMethods {	
	       
	
public static void LoginErrorMessage1() throws Exception{
		String[][] recordData = getExcelData( "\\Documents\\Testdata\\LoginErrorMessage1.xls");
		String url = recordData[1][0];
	    String uName = recordData[1][1];
	    String pWord = recordData[1][2];
		
		/*Launch FireFox Browser*/
		System.out.println("Firefox browser is launched...");
		logger.log(LogStatus.INFO, "Firefox browser is launched...");
		
		
		Module.login(logger, driver, uName, pWord, url);
		
	}


	
public static void loginToSFDC2() throws Exception{
		String[][] recordData = getExcelData( "\\Documents\\Testdata\\loginToSFDC2.xls");
		String url = recordData[1][0];
	    String uName = recordData[1][1];
	    String pWord = recordData[1][2];
		
		/*Launch FireFox Browser*/
		System.out.println("Firefox browser is launched...");
		logger.log(LogStatus.INFO, "Firefox browser is launched...");
		
		Module.login(logger, driver, uName, pWord, url);

		
	}

public static void CheckRemeberMe3() throws InterruptedException {
	
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\CheckRemeberMe3.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/* Launch firefox browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.checkRememberMeLogin(logger, driver, uName, pWord, url);
	
	Thread.sleep(5000);
	/*Click UserMenu dropdown*/
    WebElement SFDCDropDownMenu =driver.findElement(By.xpath("//*[@id='userNav']"));
    clickObj(SFDCDropDownMenu, "SFDC Log Out");
    
    Thread.sleep(3000);
	/*Select LogOut Link*/
    WebElement SFDCLogout =driver.findElement(By.xpath("//a[text()='Logout']"));
    clickObj(SFDCLogout, "SFDC Logout");
    Thread.sleep(4000);
    
	WebElement rememberCheckBox = driver.findElement(By.xpath(".//*[@id='rememberUn']"));
     if(rememberCheckBox.isSelected()) {
    	 System.out.println("Remember me is selected...");
     }else {
    	 System.out.println("Remember me is not selected...");

     }
     
     Thread.sleep(3000);



     

}

public static void forgotPassword4() throws Exception {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\forgotPassword4.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
	
	/*Launch firefox browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	/*Launch SalesForce Application*/
	driver.get(url);
	System.out.println("Salesforce application is launched...");
	logger.log(LogStatus.INFO, "Salesforce application is launched...");
	
	/*Click Forgot Password*/
	WebElement forgotPwd = driver.findElement(By.xpath(".//*[@id='forgot_password_link']"));
	clickObj(forgotPwd, "forgotPassWord");
	
	/*Enter UserName in UserName Field*/
	WebElement UN = driver.findElement(By.xpath(".//*[@id='un']"));
	enterText(UN , uName, "UserName");
	
	/*Click on Continue Button*/
	WebElement ContinueButton = driver.findElement(By.xpath(".//*[@id='continue']"));
	clickObj(ContinueButton, "Continue");
	Thread.sleep(4000);
	
}

public static void ForgotPassword5() throws InterruptedException{
	
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\ForgotPassword5.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
	
	/*Launch firefox browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
}


public static void UserMenuDropDown6() throws Exception {

	String[][] recordData = getExcelData( "\\Documents\\Testdata\\UserMenuDropDown6.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
	
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	
	Thread.sleep(4000);
	/*Click UserMenu dropdown*/
    WebElement UserMenuDropDown =driver.findElement(By.xpath("//*[@id='userNav']"));
    clickObj(UserMenuDropDown, "UserMenuDropDown is clicked...");
	Thread.sleep(6000);

    
}

public static void MyProfile7() throws InterruptedException {

	String[][] recordData = getExcelData( "\\Documents\\Testdata\\MyProfile7.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
	
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	
	Thread.sleep(3000);
	/*Click UserMenu dropdown*/
    WebElement UserMenuDropDown =driver.findElement(By.xpath("//*[@id='userNavButton']"));
    clickObj(UserMenuDropDown, "SFDC Log Out");
    
    Thread.sleep(3000);
    /*Click MyProfile option From UserMenu*/
    WebElement MyProfile = driver.findElement(By.xpath("//*[@id='userNav-menuItems']/a[1]"));
    clickObj(MyProfile, "MyProfile Option Clicked...");
    
    Thread.sleep(3000);
    //Edit Contact
    WebElement EditContact = driver.findElement(By.xpath(".//*[@id='chatterTab']/div[2]/div[2]/div[1]/h3/div/div/a/img"));
    clickObj(EditContact, "Edit button clicked...");
    
    Thread.sleep(2000);
    //Click On ABOUT Tab
    driver.switchTo().frame("contactInfoContentId");
    WebElement AboutTab = driver.findElement(By.xpath(".//*[@id='aboutTab']/a"));
    clickObj(AboutTab,"AboutTab is clicked");
   
    //Enter LastName
    WebElement LastName = driver.findElement(By.xpath(".//*[@id='lastName']"));
    LastName.clear();
    enterText(LastName, "Atibudhi", "LName");
    
    //Click On SaveAll
    WebElement SaveAll = driver.findElement(By.xpath(".//*[@id='TabPanel']/div/div[2]/form/div/input[1]"));
    clickObj(SaveAll, "SaveAll Button clicked...");
    
    driver.switchTo().parentFrame();
    Thread.sleep(9000);
    //Click on PostLink
    WebElement Post = driver.findElement(By.xpath(".//*[@id='publisherAttachTextPost']/span[1]"));
    clickObj(Post, "Post link is Clicked...");
    
	//Enter Text in PostText Area
    driver.switchTo().frame(1);				
    Thread.sleep(3000);
    WebElement PostText = driver.findElement(By.xpath("//body"));
    enterText(PostText, "Hello World", "PTextArea");
        
    Thread.sleep(3000);
    driver.switchTo().parentFrame();
    //Click on Share button
    WebElement ShareButton = driver.findElement(By.xpath(".//*[@id='publishersharebutton']"));
    clickObj(ShareButton, "ShareButton is clicked...");
    
    //Click on FileLink
    Thread.sleep(3000);
    WebElement FileLink = driver.findElement(By.xpath(".//*[@id='publisherAttachContentPost']"));
    clickObj(FileLink, "FileLink is clicked...");
    
    //Click on Upload A file from Computer Button
    Thread.sleep(2000);
    WebElement UploadfilefromComputer = driver.findElement(By.xpath(".//*[@id='chatterUploadFileAction']"));
    clickObj(UploadfilefromComputer, "UploadfilefromComputer is clicked");
    
    //Click on ChooseFile Button
    Thread.sleep(3000);
    WebElement ChooseFile = driver.findElement(By.xpath(".//*[@id='chatterFile']"));
    ChooseFile.sendKeys("C:\\Users\\deepika\\Desktop\\image-classification-1.png");
    
    //Click on Share Button
    Thread.sleep(2000);
    WebElement shareButton = driver.findElement(By.xpath(".//*[@id='publishersharebutton']"));
    clickObj(shareButton, "shareButton is clicked...");
    
    /*Click on AddPhotoLink*/
    Thread.sleep(3000);
    WebElement AddPhotoLink = driver.findElement(By.xpath(".//*[@id='uploadLink']"));
    Actions action = new Actions(driver);
    action.moveToElement(AddPhotoLink).build().perform();
    clickObj(AddPhotoLink, "AddPhotoLink is clicked...");
    
    //Click on ChooseFile Button
    Thread.sleep(4000);
    driver.switchTo().frame("uploadPhotoContentId");			    
    WebElement ChooseFile1 = driver.findElement(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadInputFile']"));
    ChooseFile1.sendKeys("C:\\Users\\deepika\\Desktop\\flower-roses-red-roses-bloom.jpg");
    
    //Click On SaveButton.
    Thread.sleep(3000);
    WebElement SaveButton = driver.findElement(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadBtn']"));
    clickObj(SaveButton, "SaveButton is clicked...");
    
    //Click on Save
    Thread.sleep(5000);
    WebElement Save = driver.findElement(By.xpath(".//*[@id='j_id0:j_id7:save']"));
    clickObj(Save, "SaveButton is clicked...");
    driver.switchTo().parentFrame();
    Thread.sleep(5000);
}

public static void MySettings8() throws InterruptedException{
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\MySettings8.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    String eName = recordData[1][3];
    String eAddress = recordData[1][4];
	
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	
	Thread.sleep(4000);
	/*Click UserMenu dropdown*/
    WebElement UserMenuDropDown =driver.findElement(By.xpath("//*[@id='userNav']"));
    clickObj(UserMenuDropDown, "SFDC Log Out");
    
    Thread.sleep(3000);
    /*Click on MySetting*/
    WebElement MySetting = driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[2]"));
    clickObj(MySetting, "MySetting is clicked...");
	
    Thread.sleep(4000);
    /*Click on PersonalLink*/
    WebElement PersonalLink = driver.findElement(By.xpath(".//*[@id='PersonalInfo']/a"));
    clickObj(PersonalLink, "PersonalLink is clicked");
	
    Thread.sleep(4000);
    /*Select LogIn History*/
    WebElement LogIn = driver.findElement(By.xpath(".//*[@id='LoginHistory_font']"));
    clickObj(LogIn, "LogIn History is clicked");
    
	Thread.sleep(4000);
    /*Click on Download LogIn History*/
    WebElement DownloadLogInHistory = driver.findElement(By.xpath(".//*[@id='RelatedUserLoginHistoryList_body']/div/a"));
    clickObj(DownloadLogInHistory, "Download LogIn History is clicked");
    
    /*Click On Ok
    WebElement Ok = driver.findElement(By.xpath(".//*[@id='bodyCell']"));
    clickObj(Ok, "Ok is clicked");*/
    
    Thread.sleep(3000);
    /*Click on DisplayandLayout Link*/
    WebElement DisplayandLayout = driver.findElement(By.xpath(".//*[@id='DisplayAndLayout']/a"));
    clickObj(DisplayandLayout, "DisplayandLayout link is clicked...");
    Thread.sleep(3000);
    
    WebElement CustomizeMyTabs = driver.findElement(By.xpath(".//*[@id='CustomizeTabs_font']"));
    clickObj(CustomizeMyTabs, "CustomizeMyTabs link is clicked...");
    Thread.sleep(3000);
    
    Select customAppSelect = new Select(driver.findElement(By.xpath(".//*[@id='p4']")));
    customAppSelect.selectByVisibleText("Salesforce Chatter");
    Thread.sleep(2000);
    
    
    Select availableTabs = new Select(driver.findElement(By.xpath(".//*[@id='duel_select_0']")));
    availableTabs.selectByVisibleText("Reports");
    Thread.sleep(3000);
    
    WebElement addAvailableListButton = driver.findElement(By.xpath(".//*[@id='duel_select_0_right']/img"));
    clickObj(addAvailableListButton, "addAvailableListButton link is clicked...");
    Thread.sleep(3000);
    
    WebElement emailLink = driver.findElement(By.xpath(".//*[@id='EmailSetup']/a"));
    clickObj(emailLink, "emailLink link is clicked...");
    Thread.sleep(3000);
    
    WebElement myEmailSettings = driver.findElement(By.xpath(".//*[@id='EmailSettings_font']"));
    clickObj(myEmailSettings, "myEmailSettings link is clicked...");
    Thread.sleep(3000);
    
    WebElement emailName = driver.findElement(By.xpath(".//*[@id='sender_name']"));
    emailName.clear();
	enterText(emailName, eName, "emailName");
    
	Thread.sleep(3000);
	WebElement emailAddress = driver.findElement(By.xpath(".//*[@id='sender_email']"));
	emailAddress.clear();
	enterText(emailAddress, eAddress, "emailAddress");
	Thread.sleep(3000);
	
	WebElement automaticBccRadioButton = driver.findElement(By.xpath(".//*[@id='auto_bcc1']"));
	clickObj(automaticBccRadioButton, "automaticBccRadioButton is selected...");
	Thread.sleep(3000);
	
	WebElement save = driver.findElement(By.xpath(".//*[@id='bottomButtonRow']/input[1]"));
	clickObj(save, "saveButton is selected...");
	Thread.sleep(3000);
	
	 WebElement calenderAndReminder = driver.findElement(By.xpath(".//*[@id='CalendarAndReminders']/a"));
	 clickObj(calenderAndReminder, "calenderAndReminder link is clicked...");
	 Thread.sleep(3000);

}
public static void DevelopersConsole9() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\DevelopersConsole9.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
	
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	
	Thread.sleep(4000);
	/*Click UserMenu dropdown*/
    WebElement UserMenuDropDown =driver.findElement(By.xpath("//*[@id='userNavButton']"));
    clickObj(UserMenuDropDown, "UserMenuDropDown is clicked...");
    
	Thread.sleep(3000);
    WebElement developerConsol =driver.findElement(By.xpath(".//*[@id='userNav-menuItems']/a[3]"));
    clickObj(developerConsol, "developerConsol link is clicked...");
	Thread.sleep(3000);

}

public static void LogOut10() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\LogOut10.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
	
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.logout(logger, driver, uName, pWord, url);
	Thread.sleep(4000);


}

public static void CreateAccount11() throws InterruptedException {
	String[][] recordData = getExcelData( "/Documents/Testdata/CreateAccount11.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    String aName = recordData[1][3];
    
	Module.login(logger, driver, uName, pWord, url);
	
	Thread.sleep(4000);
	/*Click UserMenu dropdown*/
    WebElement accountsLink =driver.findElement(By.xpath(".//*[@id='Account_Tab']"));
    clickObj(accountsLink, "accountsLink is clicked...");
    
    WebElement newButton =driver.findElement(By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input"));
    clickObj(newButton, "newButton is clicked...");
    
    Thread.sleep(4000);
    WebElement accountName = driver.findElement(By.cssSelector("#acc2"));
	enterText(accountName, aName, "accountName");
	Thread.sleep(3000);
	
	WebElement save = driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[1]"));
	clickObj(save, "saveButton is selected...");
	Thread.sleep(3000);
    
}

public static void CreateNewView12() throws InterruptedException {
	String[][] recordData = getExcelData( "/Documents/Testdata/CreateNewView12.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    String vName = recordData[1][3];
    String vUName = recordData[1][3];
	
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	
	Thread.sleep(4000);
    WebElement accountsLink =driver.findElement(By.xpath(".//*[@id='Account_Tab']/a"));
    clickObj(accountsLink, "accountsLink is clicked...");
    
	Thread.sleep(2000);
    WebElement createNewView =driver.findElement(By.xpath(".//*[@id='filter_element']/div/span/span[2]/a[2]"));
    clickObj(createNewView, "createNewView link is clicked...");
    
    WebElement viewName = driver.findElement(By.xpath(".//*[@id='fname']"));
	enterText(viewName, vName+Math.random(), "viewName");
	Thread.sleep(8000);
	
	 WebElement viewUniqueName = driver.findElement(By.xpath(".//*[@id='devname']"));
	 clickObj(viewUniqueName, "viewUniqueName link is clicked...");
     Thread.sleep(6000);
	
	WebElement save = driver.findElement(By.xpath(".//*[@id='editPage']/div[3]/table/tbody/tr/td[2]/input[1]"));
	clickObj(save, "saveButton is selected...");
	Thread.sleep(8000);
    
}

public static void EditView13() throws InterruptedException {
		String[][] recordData = getExcelData( "\\Documents\\Testdata\\EditView13.xls");
		String url = recordData[1][0];
	    String uName = recordData[1][1];
	    String pWord = recordData[1][2];
	    String vName = recordData[1][3];
	    String vUName = recordData[1][3];
		
		/*Launch FireFox Browser*/
		System.out.println("Firefox browser is launched...");
		logger.log(LogStatus.INFO, "Firefox browser is launched...");
		
		Module.login(logger, driver, uName, pWord, url);
		
		Thread.sleep(4000);
	    WebElement accountsLink =driver.findElement(By.xpath(".//*[@id='Account_Tab']/a"));
	    clickObj(accountsLink, "accountsLink is clicked...");
	    
	    Thread.sleep(4000);
	    Select viewDropDown = new Select(driver.findElement(By.xpath(".//*[@id='fcf']")));
	    viewDropDown.selectByVisibleText("Alia Bhatt");
	    
	    Thread.sleep(8000);
	    WebElement editLink = driver.findElement(By.xpath(".//*[@id='filter_element']/div/span/span[2]/a[1]"));
		clickObj(editLink, "editLink is selected...");
		Thread.sleep(3000);
	    
	    WebElement viewName = driver.findElement(By.xpath(".//*[@id='fname']"));
		enterText(viewName, vName+Math.random(), "viewName");
		Thread.sleep(6000);
		
		WebElement viewUniqueName = driver.findElement(By.xpath(".//*[@id='devname']"));
		clickObj(viewUniqueName, "viewUniqueName link is clicked...");
		Thread.sleep(6000);
		
		Select filterFieldDropDown = new Select(driver.findElement(By.xpath(".//*[@id='fcol1']")));
	 	filterFieldDropDown.selectByVisibleText("Account Name");
	    Thread.sleep(5000);
	    
	    Select operatorDropDown = new Select(driver.findElement(By.xpath(".//*[@id='fop1']")));
		operatorDropDown.selectByVisibleText("contains");
		Thread.sleep(3000);
		
		WebElement value = driver.findElement(By.xpath(".//*[@id='fval1']"));
	    enterText(value, "Priyanka", "entervalue");
	    Thread.sleep(3000);
		
		Select availableFields = new Select(driver.findElement(By.xpath(".//*[@id='colselector_select_0']")));
		availableFields.selectByVisibleText("Last Activity");
	    Thread.sleep(2000);
	    
	    WebElement addButton = driver.findElement(By.xpath(".//*[@id='colselector_select_0_right']/img"));
		clickObj(addButton, "addButton is clicked...");
		Thread.sleep(8000);
		
		WebElement saveButton = driver.findElement(By.xpath(".//*[@id='editPage']/div[3]/table/tbody/tr/td[2]/input[1]"));
		clickObj(saveButton, "saveButton is clicked...");
		Thread.sleep(8000);
    
}

public static void MergeAccount14() throws InterruptedException {
		String[][] recordData = getExcelData( "\\Documents\\Testdata\\MergeAccount14.xls");
		String url = recordData[1][0];
	    String uName = recordData[1][1];
	    String pWord = recordData[1][2];
	
		
		/*Launch FireFox Browser*/
		System.out.println("Firefox browser is launched...");
		logger.log(LogStatus.INFO, "Firefox browser is launched...");
		
		Module.login(logger, driver, uName, pWord, url);

		Thread.sleep(4000);
	    WebElement accountTab =driver.findElement(By.xpath(".//*[@id='Account_Tab']/a"));
	    clickObj(accountTab, "accountTab is clicked...");
	    
	    Thread.sleep(4000);
	    WebElement mergeAccounts =driver.findElement(By.xpath(".//*[@id='toolsContent']/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a"));
	    clickObj(mergeAccounts, "mergeAccounts is clicked...");
	    
	    WebElement enterAccountName = driver.findElement(By.xpath(".//*[@id='srch']"));
	    enterText(enterAccountName, "Priyanka", "enterAccountName");
	    Thread.sleep(3000);
	    
	    WebElement findAccounts = driver.findElement(By.xpath(".//*[@id='stageForm']/div/div[2]/div[4]/input[2]"));
		clickObj(findAccounts, "findAccounts is selected...");
		Thread.sleep(3000);
		
		WebElement nextButton = driver.findElement(By.xpath(".//*[@id='stageForm']/div/div[2]/div[5]/div/input[1]"));
		clickObj(nextButton, "nextButton is clicked...");
		Thread.sleep(4000);
		
		WebElement mergeButton = driver.findElement(By.xpath(".//*[@id='stageForm']/div/div[2]/div[1]/div/input[2]"));
		clickObj(mergeButton, "mergeButton is clicked...");
		Thread.sleep(4000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		 /* if(rememberCheckBox.isSelected()) {
		    	 System.out.println("Remember me is selected...");
		     }else {
		    	 System.out.println("Remember me is not selected...");

		     }*/
		//Create a new Account Named Priyanka before Running The Script.
	    
}

public static void CreateAccountReport15() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\CreateAccountReport15.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	
	Thread.sleep(4000);
    WebElement accountTab =driver.findElement(By.xpath(".//*[@id='Account_Tab']/a"));
    clickObj(accountTab, "accountTab is clicked...");
    
    Thread.sleep(4000);
	WebElement accountsWithLastActivity30Days = driver.findElement(By.xpath(".//*[@id='toolsContent']/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a"));
	clickObj(accountsWithLastActivity30Days, "accountsWithLastActivity30Days link is clicked...");
	Thread.sleep(4000);
	
	WebElement createdDateInDateFieldDropdown =  driver.findElement(By.xpath(".//*[@id='ext-gen148']"));
	clickObj(createdDateInDateFieldDropdown, "createdDateInDateFieldDropdown img is clicked...");
    Thread.sleep(6000);
    
	WebElement fromOption =  driver.findElement(By.xpath(".//*[@id='ext-gen152']"));
	clickObj(fromOption, "fromOption img is clicked...");
    Thread.sleep(4000);
    
	WebElement todayFromDate =  driver.findElement(By.xpath(".//*[@id='ext-comp-1111']/tbody/tr[2]/td[2]"));
	clickObj(todayFromDate, "todayFromDate is selected...");
    Thread.sleep(4000);
    
	WebElement toOption =  driver.findElement(By.xpath(".//*[@id='ext-gen154']"));
	clickObj(toOption, "toOption img is clicked...");
    Thread.sleep(4000);
    
	WebElement todayToDate =  driver.findElement(By.xpath(".//*[@id='ext-comp-1113']"));
	clickObj(todayToDate, "todayToDate is selected...");
    Thread.sleep(4000);
    
    
}

public static void OppertunitiesLink16() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\OppertunitiesLink16.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);

	Thread.sleep(4000);
    WebElement oppertunityTab =driver.findElement(By.xpath(".//*[@id='Opportunity_Tab']/a"));
    clickObj(oppertunityTab, "oppertunityTab is clicked...");
	Thread.sleep(4000);

	WebElement oppertunityDropDown = driver.findElement(By.xpath(".//*[@id='fcf']"));
    if(oppertunityDropDown.isSelected()) {
   	 System.out.println("oppertunityDropDown is present...");
    }else {
   	 System.out.println("oppertunityDropDown is not present...");

    }
    
    Thread.sleep(3000);
    
}

public static void CreateNewOppertunity17() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\CreateNewOppertunity17.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);

	Thread.sleep(4000);
    WebElement oppertunityTab =driver.findElement(By.xpath(".//*[@id='Opportunity_Tab']/a"));
    clickObj(oppertunityTab, "oppertunityTab is clicked...");
	Thread.sleep(4000);
	
	WebElement newButton = driver.findElement(By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input"));
	clickObj(newButton, "newButton is clicked...");
	Thread.sleep(4000);
	

}

public static void OppertunityPipelineReport18() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\OppertunityPipelineReport18.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);

	Thread.sleep(4000);
    WebElement oppertunityTab =driver.findElement(By.xpath(".//*[@id='Opportunity_Tab']/a"));
    clickObj(oppertunityTab, "oppertunityTab is clicked...");
	Thread.sleep(4000);
    
	WebElement oppertunityPipeline =driver.findElement(By.xpath(".//*[@id='toolsContent']/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[1]/a"));
    clickObj(oppertunityPipeline, "oppertunityPipeline link is clicked...");
	Thread.sleep(4000);
}

public static void StuckOppertunityReport19() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\StuckOppertunityReport19.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);

	Thread.sleep(4000);
    WebElement oppertunityTab = driver.findElement(By.xpath(".//*[@id='Opportunity_Tab']/a"));
    clickObj(oppertunityTab, "oppertunityTab is clicked...");
	Thread.sleep(4000);
    
	WebElement stuckOppertunity = driver.findElement(By.xpath(".//*[@id='toolsContent']/tbody/tr/td[1]/div/div[1]/div[1]/ul/li[2]/a"));
    clickObj(stuckOppertunity, "stuckOppertunity link is clicked...");
	Thread.sleep(4000);
}

public static void QuaterlySummaryReport20() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\QuaterlySummaryReport20.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);

	Thread.sleep(4000);
    WebElement oppertunityTab = driver.findElement(By.xpath(".//*[@id='Opportunity_Tab']/a"));
    clickObj(oppertunityTab, "oppertunityTab is clicked...");
	Thread.sleep(4000);
    
	//Quaterly Summery Link is not present in the WebSite.
}
public static void LeadsTab21() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\LeadsTab21.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	
	Thread.sleep(4000);
    WebElement leadsTab = driver.findElement(By.xpath(".//*[@id='Lead_Tab']/a"));
    clickObj(leadsTab, "leadsTab is clicked...");
	Thread.sleep(4000);
}

public static void LeadsSelectView22() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\LeadsSelectView22.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);

	Thread.sleep(4000);
    WebElement leadsTab = driver.findElement(By.xpath(".//*[@id='Lead_Tab']/a"));
    clickObj(leadsTab, "leadsTab is clicked...");
	Thread.sleep(4000);
	
    WebElement leadsDownMenu =driver.findElement(By.xpath(".//*[@id='fcf']"));
    clickObj(leadsDownMenu, "leadsDownMenu is clicked...");
    
    Thread.sleep(3000);
}

public static void DefaultView23() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\DefaultView23.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	
	Thread.sleep(4000);
    WebElement leadsTab = driver.findElement(By.xpath(".//*[@id='Lead_Tab']/a"));
    clickObj(leadsTab, "leadsTab is clicked...");
	Thread.sleep(4000);
	
	Select leadsDownMenu = new Select(driver.findElement(By.xpath(".//*[@id='fcf']")));
	leadsDownMenu.selectByVisibleText("Today's Leads");
	System.out.println("Today's Leads is Selected...");
    Thread.sleep(4000);
    
    /*Click UserMenu dropdown*/
    WebElement SFDCDropDownMenu =driver.findElement(By.xpath("//*[@id='userNav']"));
    clickObj(SFDCDropDownMenu, "SFDC Log Out");
    Thread.sleep(3000);
    
	/*Select LogOut Link*/
    WebElement SFDCLogout =driver.findElement(By.xpath("//a[text()='Logout']"));
    clickObj(SFDCLogout, "SFDC Logout");
    Thread.sleep(4000);
    
    /*Enter Username in Username field*/
	WebElement userName1 = driver.findElement(By.xpath(".//*[@id='username']"));
	enterText(userName1, uName, "userName1");
	System.out.println("userName is entered in userName field...");
	
	/*Enter Password in Password field*/
	WebElement password1 = driver.findElement(By.xpath("//*[@id='password']"));
	enterText(password1, pWord, "password1");
	System.out.println("passWord is entered in passWord field...");

	/*Click SFDC Login*/
	WebElement SFDClogin1 = driver.findElement(By.xpath(".//*[@id='Login']"));
	clickObj(SFDClogin1, "SFDC Login");
	logger.log(LogStatus.INFO, "Login to SFDC button is clicked..");
	Thread.sleep(4000);
	
	WebElement leadsTab1 = driver.findElement(By.xpath(".//*[@id='Lead_Tab']/a"));
    clickObj(leadsTab1, "leadsTab1 link is clicked...");
	Thread.sleep(4000);
	
	WebElement goButton = driver.findElement(By.xpath(".//*[@id='filter_element']/div/span/span[1]/input"));
	clickObj(goButton, "goButton is Clicked...");
	Thread.sleep(4000);
	
   
}

public static void TodaysLead24() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\TodaysLead24.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	
	Thread.sleep(4000);
    WebElement leadsTab = driver.findElement(By.xpath(".//*[@id='Lead_Tab']/a"));
    clickObj(leadsTab, "leadsTab is clicked...");
	Thread.sleep(4000);
	
	Select leadsDownMenu = new Select(driver.findElement(By.xpath(".//*[@id='fcf']")));
	leadsDownMenu.selectByVisibleText("Today's Leads");
	System.out.println("Today's Leads is Selected...");
    Thread.sleep(4000);
    
}


public static void NewLead25() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\NewLead25.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	
	Thread.sleep(4000);
    WebElement leadsTab = driver.findElement(By.xpath(".//*[@id='Lead_Tab']/a"));
    clickObj(leadsTab, "leadsTab is clicked...");
	Thread.sleep(4000);
	
    WebElement newButton = driver.findElement(By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input"));
    clickObj(newButton, "newButton is clicked...");
	Thread.sleep(4000);
    
	WebElement lastName = driver.findElement(By.xpath(".//*[@id='name_lastlea2']"));
	enterText(lastName, "ABCD" , "lastName");
	System.out.println("ABCD is entered in lastName field...");
	
	WebElement companyName = driver.findElement(By.xpath(".//*[@id='lea3']"));
	enterText(companyName, "ABCD" , "companyName");
	System.out.println("ABCD is entered in companyName field...");
	
	WebElement saveButton = driver.findElement(By.xpath(".//*[@id='bottomButtonRow']/input[1]"));
    clickObj(saveButton, "saveButton is clicked...");
	Thread.sleep(4000);
	
}

public static void CreateNewContact26() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\CreateNewContact26.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	Thread.sleep(4000);

    WebElement contactsTab = driver.findElement(By.xpath(".//*[@id='Contact_Tab']/a"));
    clickObj(contactsTab, "contactsTab is clicked...");
	Thread.sleep(4000);
	
	WebElement newButton = driver.findElement(By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input"));
    clickObj(newButton, "newButton is clicked...");
	Thread.sleep(4000);
	
	WebElement lastName = driver.findElement(By.xpath(".//*[@id='name_lastcon2']"));
	enterText(lastName, "Jay" , "lastName");
	Thread.sleep(4000);
	
	WebElement accountName = driver.findElement(By.xpath(".//*[@id='con4']"));
	enterText(accountName, "Jagannath" , "accountName");
	Thread.sleep(4000);
	
	WebElement saveButton = driver.findElement(By.xpath(".//*[@id='bottomButtonRow']/input[1]"));
    clickObj(saveButton, "saveButton is clicked...");
	Thread.sleep(4000);

}
public static void CreateNewView27() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\CreateNewView27.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    String vName = recordData[1][3];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	Thread.sleep(4000);

    WebElement contactsTab = driver.findElement(By.xpath(".//*[@id='Contact_Tab']/a"));
    clickObj(contactsTab, "contactsTab is clicked...");
	Thread.sleep(4000);
	
	WebElement createNewView = driver.findElement(By.xpath(".//*[@id='filter_element']/div/span/span[2]/a[2]"));
    clickObj(createNewView, "createNewView is clicked...");
	Thread.sleep(4000);
	
	WebElement viewName = driver.findElement(By.xpath(".//*[@id='fname']"));
	enterText(viewName, vName, "viewName");
	System.out.println("viewName is entered in userName field...");
	
	WebElement viewUniqueName = driver.findElement(By.xpath(".//*[@id='devname']"));
    clickObj(viewUniqueName, "viewUniqueName is displayed...");
	Thread.sleep(4000);
	
	WebElement saveButton = driver.findElement(By.xpath(".//*[@id='editPage']/div[3]/table/tbody/tr/td[2]/input[1]"));
    clickObj(saveButton, "saveButton is clicked...");
	Thread.sleep(4000);
}

public static void CheckRecentlyCreatedContact28() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\CheckRecentlyCreatedContact28.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);

	Thread.sleep(4000);
	
    WebElement contactsTab = driver.findElement(By.xpath(".//*[@id='Contact_Tab']/a"));
    clickObj(contactsTab, "contactsTab is clicked...");
	Thread.sleep(4000);
	
	Select recentlyCreatedDropDown = new Select(driver.findElement(By.xpath(".//*[@id='hotlist_mode']")));
	recentlyCreatedDropDown.selectByVisibleText("Recently Created");
	System.out.println("Recently Created Contacts is Displayed...");
    Thread.sleep(4000);
	
}

public static void CheckMyContacts29() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\CheckMyContacts29.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	
	Thread.sleep(4000);
    WebElement contactsTab = driver.findElement(By.xpath(".//*[@id='Contact_Tab']/a"));
    clickObj(contactsTab, "contactsTab is clicked...");
	Thread.sleep(4000);
	
	Select MyContactsDropDown = new Select(driver.findElement(By.xpath(".//*[@id='fcf']")));
	MyContactsDropDown.selectByVisibleText("My Contacts");
	System.out.println("My Contacts Contacts is Displayed...");
    Thread.sleep(5000);
	
}

public static void ViewContact30() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\ViewContact30.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	Thread.sleep(6000);

    WebElement contactsTab = driver.findElement(By.xpath(".//*[@id='Contact_Tab']/a"));
    clickObj(contactsTab, "contactsTab is clicked...");
	Thread.sleep(4000);
	
	WebElement contactName = driver.findElement(By.xpath(".//*[@id='bodyCell']/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a"));
    clickObj(contactName, "contactName is clicked...");
	Thread.sleep(4000);
	
}

public static void CheckErrorMessage31() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\CheckErrorMessage31.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	Thread.sleep(4000);

    WebElement contactsTab = driver.findElement(By.xpath(".//*[@id='Contact_Tab']/a"));
    clickObj(contactsTab, "contactsTab is clicked...");
	Thread.sleep(4000);
	
	WebElement createNewView = driver.findElement(By.xpath(".//*[@id='filter_element']/div/span/span[2]/a[2]"));
    clickObj(createNewView , "createNewView link is clicked...");
	Thread.sleep(4000);
	
	WebElement viewUniqueName = driver.findElement(By.xpath(".//*[@id='devname']"));
	enterText(viewUniqueName, "EFGH", "viewUniqueName");
	System.out.println("viewUniqueName is entered in viewUniqueName field...");
	
	WebElement saveButton = driver.findElement(By.xpath(".//*[@id='editPage']/div[3]/table/tbody/tr/td[2]/input[1]"));
    clickObj(saveButton, "saveButton is clicked...");
	Thread.sleep(8000);
	
	WebElement errorMsg = driver.findElement(By.xpath(".//*[@id='editPage']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[2]"));
	System.out.println("error message is"+errorMsg.getText());
	
}

public static void CheckCancelButton32() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\CheckCancelButton32.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	Thread.sleep(4000);

    WebElement contactsTab = driver.findElement(By.xpath(".//*[@id='Contact_Tab']/a"));
    clickObj(contactsTab, "contactsTab is clicked...");
	Thread.sleep(4000);
	
	WebElement createNewView = driver.findElement(By.xpath(".//*[@id='filter_element']/div/span/span[2]/a[2]"));
    clickObj(createNewView , "createNewView link is clicked...");
	Thread.sleep(4000);
	
	WebElement viewName = driver.findElement(By.xpath(".//*[@id='fname']"));
	enterText(viewName, "ABCD", "viewName");
	System.out.println("ABCD is entered in viewUniqueName field...");
	
	WebElement viewUniqueName = driver.findElement(By.xpath(".//*[@id='devname']"));
	enterText(viewUniqueName, "EFGH", "viewUniqueName");
	System.out.println("EFGH is entered in viewUniqueName field...");
	Thread.sleep(2000);

	WebElement cancelButton = driver.findElement(By.xpath(".//*[@id='editPage']/div[3]/table/tbody/tr/td[2]/input[2]"));
    clickObj(cancelButton, "cancelButton is clicked...");
	Thread.sleep(10000);
}

public static void CheckSaveAndNewButton33() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\CheckSaveAndNewButton33.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	Thread.sleep(4000);

    WebElement contactsTab = driver.findElement(By.xpath(".//*[@id='Contact_Tab']/a"));
    clickObj(contactsTab, "contactsTab is clicked...");
	Thread.sleep(4000);
	
	WebElement newButton = driver.findElement(By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input"));
    clickObj(newButton , "newButton link is clicked...");
	Thread.sleep(4000);
	
	WebElement lastName = driver.findElement(By.xpath(".//*[@id='name_lastcon2']"));
	enterText(lastName, "Indian", "lastName");
	System.out.println("Indian is entered in lastName field...");
	
	WebElement accountName = driver.findElement(By.xpath(".//*[@id='con4']"));
	enterText(accountName, "Global Media", "accountName");
	System.out.println("EFGH is entered in accountName field...");
	
	WebElement saveNewButton = driver.findElement(By.xpath(".//*[@id='bottomButtonRow']/input[2]"));
    clickObj(saveNewButton, "saveNewButton is clicked...");
	Thread.sleep(4000);
}

public static void VerifyFirstnameAndLastname34() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\VerifyFirstnameAndLastname34.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	Thread.sleep(4000);

    WebElement homeTab = driver.findElement(By.xpath(".//*[@id='home_Tab']"));
    clickObj(homeTab, "homeTab is clicked...");
	Thread.sleep(4000);
	
	WebElement firstNamelastName = driver.findElement(By.xpath(".//*[@id='ptBody']/div/div[2]/span[1]/h1/a"));
    if(firstNamelastName.isDisplayed()) {
   	 System.out.println("firstNamelastName is Displayed...");
    }else {
   	 System.out.println("firstNamelastName is not is Displayed...");

    }
    
    Thread.sleep(3000);
    
    WebElement firstNamelastName1 = driver.findElement(By.xpath(".//*[@id='ptBody']/div/div[2]/span[1]/h1/a"));
	clickObj(firstNamelastName1, "firstNamelastName link is clicked...");
    Thread.sleep(3000);

}

public static void VerifyEditedLastnameIsUpdated35() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\VerifyEditedLastnameIsUpdated35.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	Thread.sleep(4000);

    WebElement homeTab = driver.findElement(By.xpath(".//*[@id='home_Tab']/a"));
    clickObj(homeTab, "homeTab is clicked...");
	Thread.sleep(4000);
	
    WebElement firstNamelastName = driver.findElement(By.xpath(".//*[@id='ptBody']/div/div[2]/span[1]/h1/a"));
	clickObj(firstNamelastName, "firstNamelastName link is clicked...");
    Thread.sleep(3000);
    
	WebElement editProfile = driver.findElement(By.xpath(".//*[@id='chatterTab']/div[2]/div[2]/div[1]/h3/div/div/a/img"));
    clickObj(editProfile, "editProfile button is clicked...");
	Thread.sleep(4000);
	
	//Click On ABOUT Tab
    driver.switchTo().frame("contactInfoContentId");
    WebElement AboutTab = driver.findElement(By.xpath(".//*[@id='aboutTab']/a"));
    clickObj(AboutTab,"AboutTab is clicked");
    Thread.sleep(4000);
    
    //Enter LastName
    WebElement LastName = driver.findElement(By.xpath(".//*[@id='lastName']"));
    LastName.clear();
    enterText(LastName, "Sahu", "LName");
    
    //Click On SaveAll
    WebElement SaveAll = driver.findElement(By.xpath(".//*[@id='TabPanel']/div/div[2]/form/div/input[1]"));
    clickObj(SaveAll, "SaveAll Button clicked...");
    driver.switchTo().parentFrame();
    Thread.sleep(6000);
    
    WebElement updatedLastName = driver.findElement(By.xpath(".//*[@id='userNavButton']"));
    if(updatedLastName.isDisplayed()) {
   	 System.out.println("updatedLastName is Displayed...");
    }else {
   	 System.out.println("updatedLastName is not Displayed...");

    }
    
    Thread.sleep(3000);
    
    WebElement updatedFirstNameLastName = driver.findElement(By.xpath(".//*[@id='tailBreadcrumbNode']"));
    if(updatedFirstNameLastName.isDisplayed()) {
   	 System.out.println("updatedFirstNameLastName is Displayed...");
    }else {
   	 System.out.println("updatedFirstNameLastName is not Displayed...");

    }
    
    Thread.sleep(3000);
   
}

public static void VerifyTabCustomization36() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\VerifyTabCustomization36.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	Thread.sleep(4000);

    WebElement plusTab = driver.findElement(By.xpath(".//*[@id='AllTab_Tab']"));
    clickObj(plusTab, "plusTab is clicked...");
	Thread.sleep(4000);
	
	WebElement customizeMyTab = driver.findElement(By.xpath(".//*[@id='bodyCell']/div[3]/div[1]/table/tbody/tr/td[2]/input"));
    clickObj(customizeMyTab, "customizeMyTab is clicked...");
	Thread.sleep(4000);
	
	Select selectedTabs = new Select(driver.findElement(By.xpath(".//*[@id='duel_select_1']")));
	selectedTabs.selectByVisibleText("Reports");
    Thread.sleep(3000);
    
    WebElement removeSelectedListButton = driver.findElement(By.xpath(".//*[@id='duel_select_0_left']/img"));
    clickObj(removeSelectedListButton, "removeSelectedListButton link is clicked...");
    Thread.sleep(3000);
    
    WebElement saveButton = driver.findElement(By.xpath(".//*[@id='bottomButtonRow']/input[1]"));
    clickObj(saveButton, "saveButton link is clicked...");
    Thread.sleep(3000);
    
    WebElement SFDCDropDownMenu =driver.findElement(By.xpath("//*[@id='userNav']"));
    clickObj(SFDCDropDownMenu, "SFDCDropDownMenu is Selected...");
    Thread.sleep(3000);
    
    WebElement SFDCLogout =driver.findElement(By.xpath("//a[text()='Logout']"));
    clickObj(SFDCLogout, "SFDC Logout is clicked...");
    Thread.sleep(4000);
    
    /*Enter Username in Username field*/
	WebElement userName1 = driver.findElement(By.xpath(".//*[@id='username']"));
	enterText(userName1, uName, "UserName");
	System.out.println("userName is entered in userName field...");
	
	/*Enter Password in Password field*/
	WebElement password1 = driver.findElement(By.xpath("//*[@id='password']"));
	enterText(password1, pWord, "Password");
	System.out.println("passWord is entered in passWord field...");

	/*Click SFDC Login*/
	WebElement SFDClogin1 = driver.findElement(By.xpath(".//*[@id='Login']"));
	clickObj(SFDClogin1, "SFDC Login");
	logger.log(LogStatus.INFO, "Login to SFDC button is clicked..");
	Thread.sleep(4000);
}

public static void BlockingAnEventInCalender37() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\BlockingAnEventInCalender37.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	Thread.sleep(4000);

    WebElement homeTab = driver.findElement(By.xpath(".//*[@id='home_Tab']/a"));
    clickObj(homeTab, "homeTab is clicked...");
	Thread.sleep(4000);
	
    WebElement currentDate = driver.findElement(By.xpath(".//*[@id='ptBody']/div/div[2]/span[2]/a"));
	clickObj(currentDate, "currentDate link is clicked...");
    Thread.sleep(3000);
    
    WebElement eightPMlink = driver.findElement(By.xpath(".//*[@id='p:f:j_id25:j_id61:28:j_id64']/a"));
	clickObj(eightPMlink, "eightPMlink link is clicked...");
    Thread.sleep(3000);
    
    WebElement subjectComboIcon = driver.findElement(By.xpath(".//*[@id='ep']/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img"));
	clickObj(subjectComboIcon, "subjectComboIcon link is clicked...");
    Thread.sleep(4000);
    
    //get window handlers as list
    List<String> browserWindows = new ArrayList<String> (driver.getWindowHandles());
    //switch to new window
    driver.switchTo().window(browserWindows.get(1));
 	WebElement otherPopupLink = driver.findElement(By.xpath("html/body/div[2]/ul/li[5]/a"));
	clickObj(otherPopupLink, "otherPopupLink is clicked...");
    Thread.sleep(2000);    
    //then close window and get back
    driver.close();
    driver.switchTo().window(browserWindows.get(0));
    
    /*String mainWindow = driver.getWindowHandle();
    System.out.println("main window"+mainWindow);
    Set<String> s1 = driver.getWindowHandles();
    Iterator<String> i1 = s1.iterator();
    while(i1.hasNext()) {
    	String childName =  i1.next();

    	if(!mainWindow.equalsIgnoreCase(childName)) {
    		System.out.println("childName window"+childName);
    		driver.switchTo().window(childName);
            Thread.sleep(1000);
         	WebElement otherPopupLink = driver.findElement(By.xpath("html/body/div[2]/ul/li[5]/a"));
        	clickObj(otherPopupLink, "subjectComboIcon link is clicked...");
            Thread.sleep(2000);
            driver.close();
    	}
    }
	System.out.println("AFER window");*/


    WebElement endTimeField = driver.findElement(By.xpath(".//*[@id='simpleTimePicker']"));
	clickObj(endTimeField, "endTimeField is clicked...");
	Thread.sleep(4000);
	
	WebElement endTime = driver.findElement(By.xpath(".//*[@id='timePickerItem_42']"));
	clickObj(endTime, "endTime link is clicked...");
	Thread.sleep(4000);
	
    WebElement saveButton =driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[1]"));
    clickObj(saveButton, "SFDC saveButton is clicked...");
    Thread.sleep(4000);

}
public static void BlockingAnEventInCalenderWithWeeklyRecurrence38() throws InterruptedException {
	String[][] recordData = getExcelData( "\\Documents\\Testdata\\BlockingAnEventInCalenderWithWeeklyRecurrence38.xls");
	String url = recordData[1][0];
    String uName = recordData[1][1];
    String pWord = recordData[1][2];
    
	/*Launch FireFox Browser*/
	System.out.println("Firefox browser is launched...");
	logger.log(LogStatus.INFO, "Firefox browser is launched...");
	
	Module.login(logger, driver, uName, pWord, url);
	Thread.sleep(4000);

    WebElement homeTab = driver.findElement(By.xpath(".//*[@id='home_Tab']/a"));
    clickObj(homeTab, "homeTab is clicked...");
	Thread.sleep(4000);
	
    WebElement currentDate = driver.findElement(By.xpath(".//*[@id='ptBody']/div/div[2]/span[2]/a"));
	clickObj(currentDate, "currentDate link is clicked...");
    Thread.sleep(3000);
    
    WebElement eightPMlink = driver.findElement(By.xpath(".//*[@id='p:f:j_id25:j_id61:28:j_id64']/a"));
	clickObj(eightPMlink, "eightPMlink link is clicked...");
    Thread.sleep(3000);
    
    WebElement subjectComboIcon = driver.findElement(By.xpath(".//*[@id='ep']/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img"));
	clickObj(subjectComboIcon, "subjectComboIcon link is clicked...");
    Thread.sleep(6000);
    
    //get window handlers as list
    List<String> browserWindows = new ArrayList<String> (driver.getWindowHandles());
    //switch to new window
    driver.switchTo().window(browserWindows.get(1));
 	WebElement otherPopupLink = driver.findElement(By.xpath("html/body/div[2]/ul/li[5]/a"));
	clickObj(otherPopupLink, "subjectComboIcon link is clicked...");
    Thread.sleep(2000);    
    //then close window and get back
    driver.close();
    driver.switchTo().window(browserWindows.get(0));
	
}

}