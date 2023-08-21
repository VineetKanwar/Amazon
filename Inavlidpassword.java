package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inavlidpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("vineetkanwarsingh@gmail.com" + "\n");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("password1234556555" + "\n");
		// driver.findElement(By.id("signInSubmit")).click();
		boolean error = driver.findElement(By.cssSelector("#auth-warning-message-box > div > div > ul > li > span")).isDisplayed();
		System.out.println(error);
		driver.close();

		


	}

}
