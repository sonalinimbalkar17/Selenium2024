package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test case
				//arrangement
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi Services SSE\\Downloads\\chromedriver\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
				
				//action
				
//				driver.findElement(By.name("first_name")).sendKeys("sonali");
//				driver.findElement(By.name("last_name")).sendKeys("nimbalkar");
//				driver.findElement(By.name("email")).sendKeys("sonali@gmail.com");
//				driver.findElement(By.name("message")).sendKeys("i am learning java");
//				driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
				
				//assertion
				
//				boolean a1=driver.findElement(By.tagName("h1")).isDisplayed();
//				if(a1) {
//					System.out.println("login succesfull");
//				}
//				else {
//					System.out.println("login fail");
//				}
				
		//------------------------------------------------------------------------------------------------------------------------------------------------

				//1.sendKeys()
				
				driver.findElement(By.name("first_name")).sendKeys("sonali");
				driver.findElement(By.name("last_name")).sendKeys("nimbalkar");
				driver.findElement(By.name("email")).sendKeys("sonali@gmail.com");
				driver.findElement(By.name("message")).sendKeys("i am learning java");
				driver.findElement(By.cssSelector("[type=\"reset\"]")).click();
				
				String text=driver.findElement(By.name("first_name")).getText();
				if(text.equals("")) {
					System.out.println("test case pass");
					
				}
				else {
					System.out.println("test case fail");
				}

				
				//2.getText()
				
				//<h2 name="contactme" class="section_header">CONTACT US</h2>
				
				String textbyTagname=driver.findElement(By.tagName("h2")).getText();
				if(textbyTagname.equals("CONTACT US")) {
					System.out.println("tast case pass");
				}
				else {
					System.out.println("test case fail");
				}
				
				//3.getAttribute()
				String className=driver.findElement(By.name("contactme")).getAttribute("class");
				if(className.equals("section_header")) {
					System.out.println("test case pass");
				}
				else {
					System.out.println("test case fail");
				}
			
				//4.clear()
				WebElement userName=driver.findElement(By.name("first_name"));
				userName.sendKeys("sonali");
				//Thread.sleep(2000);
				userName.clear();
			
				
				//5.isEnabled()
				
				driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
				boolean aa = driver.findElement(By.cssSelector("[value='cabbage']")).isEnabled();
				if(aa) {
					System.out.println("is enabled");
				}
				else {
					System.out.println("is not enabled");//is not enabled
					
				}
				
				
				boolean aa1 = driver.findElement(By.cssSelector("[value='pumpkin']")).isEnabled();
				if(aa1) {
					System.out.println("is enabled");//is enabled
				}
				else {
					System.out.println("is not enabled");
					
				}
				
				//6. isDisplayed()
				boolean bb=driver.findElement(By.tagName("h1")).isDisplayed();
				if(bb) {
					System.out.println("it is displayed");
				}
				else {
					System.out.println("it's not displayed");
				}

				//7.isSelected()
				boolean cc=driver.findElement(By.cssSelector("[value='cabbage']")).isSelected();
				if(cc) {
					System.out.println("it is selected");
				}
				else {
					System.out.println("it's not selected");//its not selected
				}
				
		

	}

}
