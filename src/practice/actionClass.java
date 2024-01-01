package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

	public static void main(String[] args) {

		//arrangement
		//drag drop
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		//driver.manage().window().maximize();
//		//action
//		WebElement drag=driver.findElement(By.id("draggable"));
//		WebElement drop=driver.findElement(By.id("droppable"));
//		Actions action =new Actions(driver);
//		action.dragAndDrop(drag, drop).build().perform();
//		
//		//assertion
//		String text=drop.getText();
//		System.out.println(text);
//		if(text.equals("Dropped!")) {
//			System.out.println("test case pass");
//		}
//		else {
//			System.out.println("test case fail");
//		}
//		
//		driver.close();
		
		
		//double click
		//action
//		WebElement el=driver.findElement(By.id("double-click"));
//		Actions action=new Actions(driver);
//		action.doubleClick(el).build().perform();
//		//assertion
//		WebElement el2=driver.findElement(By.cssSelector("h2"));
//		String text=el2.getText();
//		System.out.println(text);
//		if(text.equals("Double Click Me!")) {
//			System.out.println(("test case pass"));
//		}
//		else {
//			System.out.println("test case fail");
//		}
//		driver.close();
		
		
		//click and hold
		//action
//		WebElement el=driver.findElement(By.id("click-box"));
//		Actions action=new Actions(driver);
//		action.clickAndHold(el).build().perform();
//		//assertion 1(hold)
//		if(el.getText().equals("Well done! keep holding that click now.....")) {
//			System.out.println("test case pass");
//		}
//		else {
//			System.out.println("test case fail");
//		}
//		//assertion 2(click)
//		el.click();
//		if(el.getText().equals("Dont release me!!!")) {
//			System.out.println("test case pass");
//		}
//		else {
//			System.out.println("test case fail");
//		}
//
//		driver.close();
//		
		
		//hover
		WebElement el=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
		Actions action=new Actions(driver);
		action.moveToElement(el).build().perform();
		boolean a1 = driver.findElement(By.className("list-alert")).isDisplayed();
		if (a1) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}


	}

}
