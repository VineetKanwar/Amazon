package amazon;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class Greetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("vineetkanwarsingh@gmail.com" + "\n");
		//driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("password");
		driver.findElement(By.id("signInSubmit")).click();
		boolean greeting = driver.findElement(By.id("nav-link-accountList-nav-line-1")).isDisplayed();
		driver.close();
		System.out.println(greeting);
		
	}

}
