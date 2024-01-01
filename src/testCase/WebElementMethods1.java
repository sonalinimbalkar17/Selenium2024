package testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

		// 8. submit() // Tagname => form

//		driver.findElement(By.cssSelector("[name=\"first_name\"]")).sendKeys("sonali");
//		driver.findElement(By.cssSelector("[name=\"last_name\"]")).sendKeys("nimbalkar");
//		driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys("sonali@gmail.com");
//		driver.findElement(By.cssSelector("[name=\"message\"]")).sendKeys("i am learning java");
//		driver.findElement(By.id("contact_form")).submit();
//		
//		boolean aa=driver.findElement(By.tagName("h1")).isDisplayed();
//		if(aa) {
//			System.out.println("test case pass");
//		}
//		else {
//			System.out.println("test case fail");
//		}
//		
		// 9. getTagName()

//		String tagName=driver.findElement(By.cssSelector("[name=\"message\"]")).getTagName();
//		if(tagName.equals("textarea")) {
//			System.out.println("test case pass");
//		}
//		else {
//			System.out.println("test case fail");
//		}

		// 10. getCssValue()

//		String fontSize=driver.findElement(By.cssSelector("[name=\"first_name\"]")).getCssValue("font-size");
//		System.out.println(fontSize);//18px
//		if(fontSize.equals("18px")) {
//			System.out.println("test case pass");
//		}
//		else {
//			System.out.println("test case fail");
//		}

		// or

//		String getFontWeight = driver.findElement(By.cssSelector("[name='message']")).getCssValue("font-weight");
//		System.out.println(getFontWeight);
//		if(Integer.parseInt(getFontWeight) == 500) {
//			System.out.println("Test case pass");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
//		driver.close();

		// 11. getLocation()
//		Point p  = driver.findElement(By.id("contact_form")).getLocation();
//		System.out.println(p);//(39, 176)
//		driver.close();		

		// 12. getSize()
		List<WebElement> className = driver.findElements(By.className("contact_button"));
		int count = className.size();
		if (count == 2) {
			System.out.println("test case pass");
		}

		else {
			System.out.println("test case fail");
		}

	
	}

}
