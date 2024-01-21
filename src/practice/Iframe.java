package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/IFrame/index.html");
		driver.manage().window().maximize();

		// we can switch over the elements and handle frames in Selenium using 3 ways.

		//By Index
		//driver.switchTo().frame(0);
		
		 //By Name or Id
		//driver.switchTo().frame("frame");
		
		// By Web Element
		WebElement el=driver.findElement(By.id("frame"));
		driver.switchTo().frame(el);
		
		
		boolean avail=driver.findElement(By.id("div-main-nav")).isDisplayed();
		if(avail) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		
		boolean avail2=driver.findElement(By.id("slide-image-1")).isDisplayed();
		if(avail2) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
	}

}
