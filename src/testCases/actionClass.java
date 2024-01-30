package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arrangement
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");

		// dragDrop
		// action
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		// assertion 1
		String text = driver.findElement(By.id("droppable")).getText();
		System.out.println(text);
		if (text.equals("Dropped!")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}
		// assertion 2
		String classVal = driver.findElement(By.id("draggable")).getAttribute("class");
		System.out.println(classVal);
		if (classVal.equals("ui-widget-content ui-draggable ui-draggable-handle")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}

		// double-click
		// action
		WebElement doubleClickEl = driver.findElement(By.id("double-click"));
		Actions action2 = new Actions(driver);
		action2.doubleClick(doubleClickEl).build().perform();
		// assertion
		String doubleClickText = doubleClickEl.getAttribute("class");
		System.out.println(doubleClickText);
		if (doubleClickText.equals("div-double-click double")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}

		// click and hold
		// action
		WebElement clickHoldEl = driver.findElement(By.id("click-box"));
		Actions action3 = new Actions(driver);
		action3.clickAndHold(clickHoldEl).build().perform();
		// assertion
		String clickHoldText = clickHoldEl.getText();
		System.out.println(clickHoldText);
		if (clickHoldText.equals("Well done! keep holding that click now.....")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}

		clickHoldEl.click();
		if (clickHoldEl.getText().equals("Dont release me!!!")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}

		// hover to element
		WebElement hoverEl = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
		Actions action4 = new Actions(driver);
		action4.moveToElement(hoverEl).build().perform();

		boolean a1 = driver.findElement(By.className("list-alert")).isDisplayed();
		if (a1) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}

	}

}
