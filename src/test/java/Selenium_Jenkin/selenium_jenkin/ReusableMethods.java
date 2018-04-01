package Selenium_Jenkin.selenium_jenkin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class ReusableMethods extends TestDriver{
	
	
	public static void enterText(WebElement obj, String textVal, String objName){
		if(obj.isDisplayed()){
			obj.sendKeys(textVal);
			logger.log(LogStatus.PASS, textVal+ " is entered in "+ objName +" field.");
		    System.out.println("Pass: user name is entered in user name field");
		}else{
			logger.log(LogStatus.FAIL, objName+ " field is not displayed, please check your application");
			System.out.println("Fail: UserName field is not displayed please check your application");
		}
		
	}
	
	
	public static void clickObj(WebElement obj, String objName){
		try {
			if(obj.isDisplayed()){
				obj.click();
				logger.log(LogStatus.PASS,objName +" is clicked");
			}else{
				logger.log(LogStatus.FAIL, objName+ " field is not displayed, please check your application");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
public static String[][] getExcelData( String filePath) {
	String userhome = System.getProperty("user.home");
	String dtTablePath = userhome + filePath;
	String recordData[][] = null ;
	try {
		 recordData = readExcel(dtTablePath, "Sheet1");
	} catch (IOException e) {
		e.printStackTrace();
	}
	return recordData;
}


/* Name:readExcel
 * Brief Description : Read the content of Excel sheet
 * Arguments: dtPath --> xl data path , sheetName --> name of the sheet
 * Created by: Automation team
 * Creation date: Dec 06 2017
 * last modified by: Deepika
 * Last modified data: Dec 06 2017
 * CMMI 5 level coding standard
 * */


public static String[][] readExcel(String dtPath, String sheetName) throws IOException {
	
	try {
		/*Step 1: Get the Excel Path*/
		File xlFile = new File(dtPath);
		
		/*Step 2: Access the XL file*/
		FileInputStream xlDoc = new FileInputStream(xlFile);
		
		/*Step 3: Access the WorkBook*/
		HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
		
		/*Step 4: Access the Sheet*/
		HSSFSheet sheet = wb.getSheet("Sheet1"); //Challenging,was getting nullpointer exceptions.
		
		/*String value = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(value);*/
		
		int iRowCount = sheet.getLastRowNum() + 1;
		int iColCount = sheet.getRow(0).getLastCellNum();
		String value;
		String [] [] xlData = new String[iRowCount][iColCount];
		
		for(int i = 0; i< iRowCount; i++) {
			for(int j = 0; j< iColCount; j++) {
				value = sheet.getRow(i).getCell(j).getStringCellValue();
				xlData[i][j] = value;
					
			}
				
		}
		return xlData;
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
	
}

}

		


