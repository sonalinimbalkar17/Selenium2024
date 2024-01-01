package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// test case 1
		// arrangement
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// action
		WebElement alertsEl = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button"));
		alertsEl.click();
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		WebElement resultEl = driver.findElement(By.id("result"));
		String resultText = resultEl.getText();
		// assertion
		if (alertText.equals("I am a JS Alert") && resultText.equals("You successfully clicked an alert")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}
		driver.close();

		// test case 2

		// arrangement
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("https://the-internet.herokuapp.com/javascript_alerts");
		// action
		WebElement confirmEl = driver2.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
		confirmEl.click();
		String confirmText = driver2.switchTo().alert().getText();
		driver2.switchTo().alert().accept();
		WebElement resultEl1 = driver2.findElement(By.id("result"));
		String resultText1 = resultEl1.getText();
		// assertion
		if (confirmText.equals("I am a JS Confirm") && resultText1.equals("You clicked: Ok")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}
		driver2.close();

		// test case 3
		// arrangement
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver3 = new ChromeDriver();
		driver3.get("https://the-internet.herokuapp.com/javascript_alerts");
		// action
		WebElement confirmEl1 = driver3.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
		confirmEl1.click();
		String confirmText1 = driver3.switchTo().alert().getText();
		driver3.switchTo().alert().dismiss();
		WebElement resultEl2 = driver3.findElement(By.id("result"));
		String resultText2 = resultEl2.getText();
		// assertion
		if (confirmText1.equals("I am a JS Confirm") && resultText2.equals("You clicked: Cancel")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}
		driver3.close();

		// test case 4
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver4 = new ChromeDriver();
		driver4.get("https://the-internet.herokuapp.com/javascript_alerts");
		// action
		driver4.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		String promptText = driver4.switchTo().alert().getText();
		driver4.switchTo().alert().sendKeys("hello java");
		driver4.switchTo().alert().accept();
		String resultT = driver4.findElement(By.id("result")).getText();
		// assertion
		if (promptText.equals("I am a JS prompt") && resultT.equals("You entered: hello java")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}
		driver4.close();

		// test case 5
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver5 = new ChromeDriver();
		driver5.get("https://the-internet.herokuapp.com/javascript_alerts");
		// action
		driver5.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		String promptText1 = driver5.switchTo().alert().getText();
		driver5.switchTo().alert().sendKeys("hello java");
		driver5.switchTo().alert().dismiss();
		String resultT1 = driver5.findElement(By.id("result")).getText();
		// assertion
		if (promptText1.equals("I am a JS prompt") && resultT1.equals("You entered: null")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}
		driver.close();

	}

}
