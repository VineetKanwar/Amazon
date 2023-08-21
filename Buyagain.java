package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buyagain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.cssSelector("#ap_email")).sendKeys("vineetkanwarsingh@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("password");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/h2")).click();
		boolean buy = driver.findElement(By.xpath("//*[@id=\"a-page\"]/section/div/div[3]/ul/li[2]/a")).isEnabled();
		driver.close();
		System.out.println(buy);

		
		
	}

}
