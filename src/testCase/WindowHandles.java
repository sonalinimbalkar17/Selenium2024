package testCase;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		//single window
		String homePageId=driver.getWindowHandle();
		System.out.println(homePageId);
		
		driver.findElement(By.id("contact-us")).click();
		String homePageId2= driver.getWindowHandle();
		System.out.println(homePageId2);
		
		//multiple window
		Set <String> handles=driver.getWindowHandles();
		System.out.println(handles);
		
		for(String handle:handles) {
			if(!handle.equals(homePageId2)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		System.out.println(driver.getWindowHandle());
		
		
		
	}

}
