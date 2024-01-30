package testCases;

import org.openqa.selenium.chrome.ChromeDriver;

public class browserLaunching {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		//open chrome
		ChromeDriver driver = new ChromeDriver();
		//navigate to URL
		driver.get("https://www.google.com");
		//browser management
		//window maximize
        driver.manage().window().maximize();
        //set full-screen mode
        driver.manage().window().fullscreen();
        //close the current browser window
        driver.close();
	}

}
