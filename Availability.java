package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Availability {

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
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("T shirt" +"\n");
		driver.findElement(By.xpath("//*[@id=\"p_n_availability/12035748011\"]/span/a/span")).click();
		

	boolean avail = driver.getPageSource().contains("Availability");
		
		driver.close();
		System.out.println(avail);
		

	}

}
