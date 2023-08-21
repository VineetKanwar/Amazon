package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class Province {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.amazon.ca/");
				driver.findElement(By.id("nav-link-accountList")).click();
				driver.findElement(By.cssSelector("#ap_email")).sendKeys("vineetkanwarsingh@gmail.com");
				driver.findElement(By.id("continue")).click();
				driver.findElement(By.id("ap_password")).sendKeys("password");
				driver.findElement(By.id("signInSubmit")).click();
				driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
				driver.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")).click();
				driver.findElement(By.id("ya-myab-plus-address-icon")).click();
				driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressStateOrRegion > span > span")).click();
				Select obj = new Select(driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressStateOrRegion > span > span")));
				obj.selectByIndex(1);
			boolean address = 	driver.findElement(By.id("address-ui-widgets-form-submit-button")).isEnabled();
			System.out.println(address);
				driver.close();

				
		
	}

}
