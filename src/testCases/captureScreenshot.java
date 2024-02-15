package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class captureScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver21\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		// full page screenshot
		// TakesScreenshot ts=(TakesScreenshot)driver;//use WebDriver
//		TakesScreenshot ts = driver;// use ChromeDriver
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File trg = new File(".\\screenshots\\homepage.png");
//		FileUtils.copyFile(src, trg);

		// screenshot of section/ specific portion of the page
		WebElement section=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src = section.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshots\\featuresproducts.png");
		FileUtils.copyFile(src, trg);
		
//		WebElement el = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		File src = el.getScreenshotAs(OutputType.FILE);
//		File tar = new File(".\\screenshots\\logo.png");
//		FileUtils.copyFile(src, tar);
		driver.close();

	}
}
