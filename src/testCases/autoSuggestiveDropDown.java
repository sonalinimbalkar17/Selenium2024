package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		// get the title of the page
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("WebDriver | Contact Us")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}

		// select food item element
		WebElement ele = driver.findElement(By.id("myInput"));
		ele.sendKeys("C");
		// list off food elements
		List<WebElement> elements = driver.findElements(By.cssSelector("#myInputautocomplete-list>div"));
		for (int i = 0; i <= elements.size(); i++) {
			if (elements.get(i).getText().contains("Chips")) {
				elements.get(i).click();
				driver.findElement(By.id("submit-button")).click();
				if (driver.getCurrentUrl().contains("Chips")) {
					System.out.println("test case pass");
					break;
				} else {
					System.out.println("test case fail");
				}
			}
		}

		
		WebElement ele2 = driver.findElement(By.id("myInput"));
		ele2.clear();
		ele2.sendKeys("M");
		List<WebElement> elements2 = driver.findElements(By.cssSelector("#myInputautocomplete-list>div"));
		for (int i = 0; i <= elements2.size(); i++) {
			if (elements2.get(i).getText().contains("Milkshake")) {
				elements2.get(i).click();
				driver.findElement(By.id("submit-button")).click();
				if (driver.getCurrentUrl().contains("Milkshake")) {
					System.out.println("test case pass");
					break;
				} else {
					System.out.println("test case fail");
				}
			}
		}
		driver.close();
	}

}
