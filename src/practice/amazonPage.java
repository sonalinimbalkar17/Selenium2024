package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Open Amazon website
		driver.get("https://www.amazon.in/");

		// Find the search bar and enter a search query
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Laptop");
		// searchBox.sendKeys(Keys.RETURN);//or
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();

		// Click on the specific option search result
		driver.findElement(By.linkText(
				"Lenovo IdeaPad 1 AMD Ryzen 3 7320U 15.6\" HD Thin and Light Laptop (8 GB/512GB SDD/Windows 11 Home/1Yr Warranty/Cloud Grey/1.58Kg), 82VG00EVIN"))
				.click();
	
		// find current url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://www.amazon.in/s?k=Laptop&ref=nb_sb_noss")) {
			System.out.println("test case pass");
		} else {
			System.out.println("test case fail");
		}

        // Close the browser window
		driver.quit();

	}

}
