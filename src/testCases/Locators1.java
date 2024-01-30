package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		
		//find element by linkText()
		boolean elBylinktext=driver.findElement(By.linkText("Cypress with Cucumber BDD - Beginner to Expert in 9 Hours!")).isDisplayed();
		if(elBylinktext) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}

		//find element in partialLinkText()
		WebElement elbypartialLinkText=driver.findElement(By.partialLinkText("Cypress with Cucumber BDD "));
		if(elbypartialLinkText.isDisplayed()) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		
	}

}
