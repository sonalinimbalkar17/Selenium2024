package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		// setting the path of the chrome driver executable
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		// Enter the url
		driver.get("http://localhost:8080/login.do");
		driver.navigate().to("http://www.gmail.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
	}

}
