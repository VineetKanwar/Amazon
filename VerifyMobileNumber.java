package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class VerifyMobileNumber {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Actions action= new Actions(driver);
		
		driver.get("https://www.amazon.ca/");
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		driver.findElement(By.cssSelector("#nav-flyout-ya-newCust > a")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("VIneet");
		driver.findElement(By.id("ap_email")).sendKeys("438928");
		driver.findElement(By.id("ap_password")).click();
		boolean verify = driver.findElement(By.cssSelector("#continue")).isDisplayed();
		driver.close();


		
		
		
		System.out.println(verify);

		
		

	}

}


