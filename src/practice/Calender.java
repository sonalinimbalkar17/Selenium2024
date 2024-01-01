package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		driver.findElement(By.id("datepicker")).click();
		selectDate(driver, "May", "2024", "1");

	}

	private static void selectDate(ChromeDriver driver, String month, String year, String date) {
		// selecting month and year
		while (true) {
			String monthYearEl = driver.findElement(By.cssSelector(".datepicker-switch")).getText();
			System.out.println(monthYearEl);
			String monthA = monthYearEl.split(" ")[0];
			String yearA = monthYearEl.split(" ")[1];
			if (monthA.equals(month) && yearA.equals(year)) {
				break;
			}
			driver.findElement(By.cssSelector(".next")).click();

		}

		// select date
		List<WebElement> days = driver.findElements(By.cssSelector(".day"));
		for (int i = 0; i <= days.size(); i++) {
			if (days.get(i).getText().equals(date)) {
				days.get(i).click();
				break;
			}

		}

	}

}
