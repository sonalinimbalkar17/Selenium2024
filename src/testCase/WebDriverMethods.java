package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		//test case 1
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		//1.get()
//		driver.get("https://www.saucedemo.com/v1/index.html");
//		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		//assertion
//		//2.getcurrenturl()
//		String currentUrl=driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		
//		if(currentUrl.contains("inventory")) {
//			System.out.println("test case pass");
//		}
//		else {
//			System.out.println("test case fail");
//		}
//		//3.close()
//		driver.close();
//		

		// test case 2

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1/index.html");
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		
//		//4.getTitle()
//		String title=driver.getTitle();
//		if(title.equals("Swag Labs")) {
//			System.out.println("test case pass");
//		}
//		else {
//			System.out.println("test case fail");
//		}
//		//5.quit()
//		driver.quit();
//		
//		
		// test case 3

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1/index.html");
//		//6.maximizeWindow()
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
//		driver.quit();
//		

		// test case 4

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1/index.html");
//		//System.out.println(driver.getCurrentUrl());
//		driver.get("https://www.google.com/");
//		//System.out.println(driver.getCurrentUrl());
//		//7.navigate() ---back()
//		driver.navigate().back();
//		System.out.println(driver.getCurrentUrl());
//		
//		if(driver.getCurrentUrl().contains("saucedemo")) {
//			System.out.println("test case pass");
//		}
//		else {
//			System.out.println("test case fail");
//		}
//		driver.quit();
//		
		// test case 5

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/index.html");
		// System.out.println(driver.getCurrentUrl());
		driver.get("https://www.google.com/");
		// System.out.println(driver.getCurrentUrl());
		// 7.navigate() ---forward()
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());

		if (driver.getCurrentUrl().contains("google")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}
		driver.quit();

	}

}
