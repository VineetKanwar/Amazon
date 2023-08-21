package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keepmesignedin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("vineetkanwarsingh@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("password");
		driver.findElement(By.cssSelector("#authportal-main-section > div:nth-child(2) > div > div:nth-child(2) > div > form > div > div:nth-child(7) > div > div > label > div > label > span")).click();
		driver.findElement(By.id("signInSubmit")).click();
		driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://www.amazon.ca/");
		boolean greeting = driver.findElement(By.id("nav-link-accountList-nav-line-1")).isDisplayed();
		System.out.println(greeting);
		driver.close();
		
		

	}

}
