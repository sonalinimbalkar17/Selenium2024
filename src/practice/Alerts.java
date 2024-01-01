package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//js alert
		driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]")).click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
		String resultText=driver.findElement(By.id("result")).getText();
		System.out.println(resultText);
		
		//assertion
		if(alertText.equals("I am a JS Alert") && resultText.equals("You successfully clicked an alert")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		//js confirm ---ok
		driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]")).click();
		String confirmText=driver.switchTo().alert().getText();
		System.out.println(confirmText);
		driver.switchTo().alert().accept();
		
		String resultText1=driver.findElement(By.id("result")).getText();
		System.out.println(resultText1);
		
		if(confirmText.equals("I am a JS Confirm") && resultText1.equals("You clicked: Ok")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		//js confirm ---cancel
		
		driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]")).click();
		String confirmText1=driver.switchTo().alert().getText();
		System.out.println(confirmText1);
		driver.switchTo().alert().dismiss();
		
		String resultText2=driver.findElement(By.id("result")).getText();
		System.out.println(resultText1);
		
		if(confirmText1.equals("I am a JS Confirm") && resultText2.equals("You clicked: Cancel")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		//js prompt----ok
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		String promptText=driver.switchTo().alert().getText();
		System.out.println(promptText);
		driver.switchTo().alert().sendKeys("Welcome Java");
		driver.switchTo().alert().accept();
		
		String promptResult=driver.findElement(By.id("result")).getText();
		System.out.println(promptResult);
		
		if(promptText.equals("I am a JS prompt")&& promptResult.equals("You entered: Welcome Java")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		//is prompt----cancel
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		String promptText1= driver.switchTo().alert().getText();
		System.out.println(promptText1);
		driver.switchTo().alert().sendKeys("Welcome Java");
		driver.switchTo().alert().dismiss();
		
		String promptResult1= driver.findElement(By.id("result")).getText();
		System.out.println(promptResult1);
		
		if(promptText1.equals("I am a JS prompt")&& promptResult1.equals("You entered: null")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}

	}

}
