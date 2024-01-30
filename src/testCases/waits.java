package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		// four waits in Selenium
		// Thread.sleep(static) 
		//Explicit(Dynamic)
		//Implicit(Dynamic)  
		//Fluent(Dynamic)
				
				// 1 Thread.Sleep()
				Thread.sleep(5000);
				System.out.println("sonali");
				
				driver.get("https://webdriveruniversity.com/IFrame/index.html");

				// 2 Implicit Wait()
				//driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				// 3 Explicit Wait()
				WebElement element = driver.findElement(By.id("#nav-title")) ;
				WebDriverWait wait=new WebDriverWait(driver, 12);
				wait.until(ExpectedConditions.elementToBeClickable(element));

				// Fluent
				 Wait<WebDriver> waitA = new FluentWait<WebDriver>(driver)
					       .withTimeout(20,TimeUnit.SECONDS)
					       .pollingEvery(15,TimeUnit.SECONDS);     
				 wait.until(ExpectedConditions.elementToBeSelected(element));							
	
		}
	
}
