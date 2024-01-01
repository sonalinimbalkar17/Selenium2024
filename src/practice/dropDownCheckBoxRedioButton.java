package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownCheckBoxRedioButton {

	public static void main(String[] args) {
		//drop down
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDownEl=driver.findElement(By.id("dropdowm-menu-2"));
		
		Select aa=new Select(dropDownEl);
		aa.selectByIndex(0);
		aa.selectByVisibleText("TestNG");
		aa.selectByValue("testng");
		
		String text=aa.getFirstSelectedOption().getText();
		System.out.println(text);//TestNG
		//assertion
		if(text.equals("TestNG")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		

		//check box
		WebElement el=driver.findElement(By.cssSelector("input[value=\"option-4\"]"));
		el.click();
		boolean aaa=el.isSelected();
		System.out.println(aaa);//true
		if(aaa==true) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		//radio button
		WebElement purpulEl=driver.findElement(By.cssSelector("input[value=\"purple\"]"));
		purpulEl.click();
		boolean bb=purpulEl.isSelected();
		System.out.println(bb);
		if(bb==true) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}

		
	}

}
