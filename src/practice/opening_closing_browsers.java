package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class opening_closing_browsers {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
