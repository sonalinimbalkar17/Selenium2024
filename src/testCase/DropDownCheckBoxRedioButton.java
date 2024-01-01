package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCheckBoxRedioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		//drop down
		WebElement el=driver.findElement(By.id("dropdowm-menu-1"));
		
		Select aa=new Select(el);
		
		aa.selectByIndex(0);
		aa.selectByVisibleText("Python");
		aa.selectByValue("python");
		
		WebElement el2=aa.getFirstSelectedOption();
		String ss=el2.getText();
		if(ss.equals("Python")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		
		//check box
		
		WebElement el3=driver.findElement(By.cssSelector("input[value=\"option-2\"]"));
		el3.click();
		boolean aaa=el3.isSelected();
		if(aaa==true) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		

	    //radio button
		
	    WebElement blueE = driver.findElement(By.cssSelector("input[value=\"blue\"]"));	   
	    WebElement yellowE = driver.findElement(By.cssSelector("input[value=\"yellow\"]"));	   
		blueE.click();
		
		boolean s1=blueE.isSelected();
		boolean s2=yellowE.isSelected();
		
		if(s1 && !s2) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
	    
	    
	    
	    
	    
	    
	}

}
