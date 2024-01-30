package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {

	public static void main(String[] args) {
		// arrangement
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");

		// action
		// element interaction
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");// enter text
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();// click a button

		// assertion

		if (driver.getCurrentUrl().contains("inventory")) {
			System.out.println("test case pass");// true
		} else {
			System.out.println("test case fail");
		}

		driver.close();

	}

}
