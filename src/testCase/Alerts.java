package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test case 1

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]")).click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
		String resultText=driver.findElement(By.id("result")).getText();
		System.out.println(resultText);
		
		if(alertText.equals("I am a JS Alert") && resultText.equals("You successfully clicked an alert")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		//test case 2
		
		driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]")).click();
		String alertText1=driver.switchTo().alert().getText();
		System.out.println(alertText1);
		driver.switchTo().alert().accept();
		
		String resultText1=driver.findElement(By.id("result")).getText();
		System.out.println(resultText1);
		
		if(alertText1.equals("I am a JS Confirm") && resultText1.equals("You clicked: Ok")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		//test case 3
		//cancel
		
		driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]")).click();
		String alertText2=driver.switchTo().alert().getText();
		System.out.println(alertText2);
		driver.switchTo().alert().dismiss();
		
		String resultText2=driver.findElement(By.id("result")).getText();
		System.out.println(resultText2);
		
		if(alertText2.equals("I am a JS Confirm") && resultText2.equals("You clicked: Cancel")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
	}

}
