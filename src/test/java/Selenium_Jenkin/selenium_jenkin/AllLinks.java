package Selenium_Jenkin.selenium_jenkin;


/*What are different type of xpath,which one you prefer and why?
 * There are 2 types of xpath 1:Absolute xpath and 2:Relative xpath.
 * I will prefer Relative xpath because it will give less mentainance,
 * Absolute xpath will always change as soon as there is a change(addition/deletion)
 * in the application functionality.
 *
 * How can you go from child to parent object?
 * Using /.. after the xpath.
 * 
 * Sometimes to find UNIQUE element we may use two attributes in xpath using and operator.
 * 
 * How do you find all the element from the link?
 * what is the difference between find element and findelemnets
 * 
 * Can you get me UserDefined/Relative Xpath for Username,Password,
 * Login,RememberMe,Forgot password,Use costum domain.
 * UserName = //input[@id='username']
 * Password = //input[@id='password']or //*[@id='password']
 * Login = //input[@id='Login'] or //*[@id='Login']
 * RememberMe = //input[@name='rememberUn'] or //*[@id='rememberUn']
 * Forgot Password = //input[@id='forgot_password_link']
 * Use costum domain = //input[@id='mydomainLink']
 *
 * Xpath is the particular object in the web page.
 * There are 2 types of xpath.absolute and relative xpath.
 * Because of the new object introduction the existing automation script may break,because of change in absolute xpath.
 * Find all the links from a given webpage.
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AllLinks {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\software\\geckodriver.exe");
		driver = new FirefoxDriver();  // Launch firefox browser
		
		driver.get("https://www.cnbc.com/");
		Thread.sleep(5000);
		
		List<WebElement> allLnk = driver.findElements(By.tagName("a"));
		System.out.println("Total number of link = " + allLnk.size());
		
		for(int i = 0; i <allLnk.size(); i++){
			//This is a collection not length,it will give size.
			
			String linkName = allLnk.get(i).getText();
			System.out.println("Link " + i + " name -->  "+ linkName);
			if(linkName.equals("TECH")){
				allLnk.get(i).click();
				break;
			}
		}
		
	}
	

}
