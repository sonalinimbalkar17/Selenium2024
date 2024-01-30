package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWrongCredential {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		driver.findElement(By.id("user-name")).sendKeys("sona");
		driver.findElement(By.id("password")).sendKeys("125");
		driver.findElement(By.id("login-button")).click();
		
		WebElement msg=driver.findElement(By.cssSelector("[data-test=\"error\"]"));
		if(msg.getText().contains("Username and password do not match any user in this service")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		

	}

}
