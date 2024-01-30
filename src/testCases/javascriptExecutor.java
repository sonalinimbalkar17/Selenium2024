package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {

	public static void main(String[] args) {

		// test case 1-----click

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://webdriveruniversity.com/");
//		WebElement el = driver.findElement(By.id("contact-us"));
//		// el.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", el);
//		driver.quit();

		// test case 2----scrollDown

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://webdriveruniversity.com/");
//		WebElement el = driver.findElement(By.id("popup-alerts"));
//		// el.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", el);
//		//driver.quit();

		// test case 3----title

//		System.setProperty("webdriver.chrome.driver",
//		"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
//       ChromeDriver driver = new ChromeDriver();
//       driver.get("https://webdriveruniversity.com/");
//       JavascriptExecutor js = (JavascriptExecutor) driver;
//		String title = (String)js.executeScript("return document.title");
//		if(title.equals("WebDriverUniversity.com")) {
//			System.out.println("Testcase pass");
//		}
//		else {
//			System.out.println("Testcase fail");
//		}
//		driver.quit();

		// test case 4--------current url

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String currentUrl = (String)js.executeScript("return window.location.href");
		System.out.println(currentUrl);//https://webdriveruniversity.com/
		if(currentUrl.equals("https://webdriveruniversity.com/")) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase fail");
		}
		driver.quit();
	}

}
