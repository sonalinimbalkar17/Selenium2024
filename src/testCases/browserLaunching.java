package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserLaunching {

	public static void main(String[] args) throws InterruptedException {
		// setting the path of the chrome driver executable
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		// Launch the chrome browser
		WebDriver driver = new ChromeDriver();

		// navigate to URL
		driver.get("https://www.google.com");

		// window maximize
		driver.manage().window().maximize();

		// Get the title of the google page and print it on the console
		String title = driver.getTitle();
		System.out.println("the title of the google page is" + driver);

		// Get the URL of the google page and print it on the console
		String url = driver.getCurrentUrl();
		System.out.println("The url of the google page is" + url);

		// Get the source code of the google page and print it on the console
		String sourceCode = driver.getPageSource();
		System.out.println("the source code of the google page");

		// Halt the program execution for 2 seconds
		Thread.sleep(2000);

		// close the current browser window
		driver.close();
	}

}
