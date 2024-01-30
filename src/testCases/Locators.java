package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		
		//find single element by cssSelector
		//findElement()
		boolean avail=driver.findElement(By.cssSelector("input[name=\"first_name\"]")).isDisplayed();
		if(avail) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		//find multiple elements by cssSelector
		//findElements()
		int ele=driver.findElements(By.cssSelector("input[type=\"text\"]")).size();
		if(ele==3) {
			System.out.println("test case pass");
		}
		
		else {
			System.out.println("test case fail");
		}

		//find multiple elements by className
		int ele2=driver.findElements(By.className("feedback-input")).size();
		if(ele2==4) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}

		//find element by id
		boolean avail2=driver.findElement(By.id("contact_form")).isDisplayed();
		if(avail2) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		//find element by name
		boolean avail3=driver.findElement(By.name("last_name")).isDisplayed();
		if(avail3) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		//find element by tagName
		boolean avail4=driver.findElement(By.tagName("h2")).isDisplayed();
		if(avail4) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		//find element by xPath
		boolean avail5 = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]")).isDisplayed();
		if(avail5) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}


	}

}
