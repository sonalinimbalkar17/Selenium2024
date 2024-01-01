package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		// single window
		String homePageId1 = driver.getWindowHandle();
		System.out.println(homePageId1);

		driver.findElement(By.id("contact-us"));
		String homePageId2 = driver.getWindowHandle();
		System.out.println(homePageId2);

		// multiple window
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		for (String handle : handles) {
			if (!handle.equals(homePageId2)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		System.out.println(driver.getWindowHandles());
		

	}

}
