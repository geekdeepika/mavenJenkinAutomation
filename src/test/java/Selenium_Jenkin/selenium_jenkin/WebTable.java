package Selenium_Jenkin.selenium_jenkin;

/*How do u map your testcase,testscript and testData in selenium?
 * How do u handle Webtable in Selenium?
 * Validate the Given WebTable?
 * One of the Way is i can inspect the elements and 
 * i can get RG Sharma and other elements,Because im getting the Xpath.
 * Now there is 5 players their may be 1 extra player comesup,
 * but we dont know the name and we dont know the xpath of it,
 * these are all the runtime or dynamic data,means during the application 
 * is running then only you can get the data,we may not get all the time.
 * For that first thing we need to get the whole content.
 * inspect a particular object and go to the parent of that object one by one.
 * that will give the whole parent table.
 * */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\software\\geckodriver.exe");
		driver = new FirefoxDriver();  // Launch firefox browser
		
		driver.get("http://toolsqa.com/automation-practice-table/");
		Thread.sleep(5000);
		
		
        WebElement ParentTable = driver.findElement(By.xpath("//*[@id='content']/table/tbody"));
		
		List<WebElement> allRow = ParentTable.findElements(By.tagName("tr"));
		
		for(int i = 0; i <allRow.size(); i++){
			List<WebElement> allCol = allRow.get(i).findElements(By.tagName("td"));
			
			for(int j =0; j <allCol.size(); j++){
				System.out.print(allCol.get(j).getText()+" ");
			}
			System.out.println();
		}
		
		
		List<WebElement> allCol = allRow.get(0).findElements(By.tagName("td"));
		
		System.out.println(allCol.get(0).getText());
		
		allCol.get(0); // UAE object ,Finding the UAE element through the Webtable.
		driver.findElement(By.xpath("//*[@id='content']/table/tbody")).findElements(By.tagName("tr")).get(0).findElements(By.tagName("td")).get(0).getText();
		driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[1]")); // UAE Object,Finding the UAE element through Xpath.
		
		allCol.get(1); // Dubai Object
		driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[2]")); // Dubai object
		
		

		
	}
}
