package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/IFrame/index.html");
		//by index
		//driver.switchTo().frame(0);
		
		//by name
		//driver.switchTo().frame("frame");
		
		//by element
		WebElement el=driver.findElement(By.id("frame"));
		driver.switchTo().frame(el);
		
		boolean elementdisplayed = driver.findElement(By.cssSelector("a[href=\"index.html\"]")).isDisplayed();
		if(elementdisplayed) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}


	}

}
