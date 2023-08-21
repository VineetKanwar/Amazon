package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("vineetkanwarsingh@gmail.com" + "\n");
		driver.findElement(By.id("ap_password")).sendKeys("password" + "\n");
		boolean greeting = 	driver.getPageSource().contains("Vineet");

		//driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		//boolean greeting = driver.findElement(By.linkText("Your Account")).isDisplayed();
		//boolean greeting = 	driver.getPageSource().contains("Your Account");
		driver.close();
		System.out.println(greeting);
		


	}

}
