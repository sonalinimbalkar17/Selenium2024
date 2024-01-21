package testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allLinksOnPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		   //test case 1
//		driver.get("https://webdriveruniversity.com/");
//		// total number of links
//		List<WebElement> ele = driver.findElements(By.cssSelector("a[href]"));
//		System.out.println(ele.size());//27
//		
//		// find all links and print them
//		for(int i=0;i<ele.size();i++) {
//			System.out.println("links are " + ele.get(i).getAttribute("href"));
//		}
//		// find all link text 
//		for(int i=0;i<ele.size();i++) {
//			System.out.println("links text are "+ele.get(i).getText());
//		}
//
//		//assertion
//		if(ele.size()==27) {
//			System.out.println("test case pass");	
//		}
//		else {
//			System.out.println("test case fail");
//		}
//		
//		driver.close();
		
//		//test case 2
//		// select drop down options
//		//first way
//		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//		List<WebElement>optionsEl=driver.findElementsByCssSelector("#dropdowm-menu-1 > option");
//		//total no of options
//		System.out.println("total options are "+optionsEl.size());//4
//		//text of option
//		for(int i=0;i<optionsEl.size();i++) {
//			System.out.println("option text are "+optionsEl.get(i).getText());
//		}
		
		//test case 3
		//second way
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDownEl=driver.findElement(By.id("dropdowm-menu-1"));
		List<WebElement> optionEle=dropDownEl.findElements(By.tagName("option"));
		System.out.println(optionEle.size());//4
		for(int i=0;i<optionEle.size();i++) {
			System.out.println("option text are "+optionEle.get(i).getText());
		}
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}
}
