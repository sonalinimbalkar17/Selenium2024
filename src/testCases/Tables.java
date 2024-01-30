package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();
		// table 1
		//td--colunms
		//tr--rows
		// total number rows
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
		System.out.println(rows.size());// 4

		// total number columns
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr[2]/td"));
		System.out.println(columns.size());// 3

		// iterate over every row and 3rd column and add the age
		int total = 0;
		for (int i = 2; i <= rows.size(); i++) {
			String age = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + i + "]//td[3]")).getText();
			System.out.println(age);
			// convert string into int
			total = total + Integer.valueOf(age);
		}
		System.out.println(total);// 159
		System.out.println(total / rows.size() - 1);// 38

		// table 2
		// iterate over every row and 3rd column and add the age
		int Total = 0;
		for (int i = 2; i <= rows.size(); i++) {
			String age = driver.findElement(By.xpath("//*[@id=\"t02\"]/tbody/tr[" + i + "]//td[3]")).getText();
			System.out.println(age);
			// convert string into int
			Total = Total + Integer.valueOf(age);
		}
		System.out.println(Total);// 163
		System.out.println(Total / rows.size() - 1);// 39

		// text present or not table 1
		for (int i = 2; i <= rows.size(); i++) {
			String first_name = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + i + "]//td[1]")).getText();
			if (first_name.equals("Jemma")) {
				System.out.println("it is found in table");
				break;
			}

		}

	}

}
