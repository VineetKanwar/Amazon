package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextPage {

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
		driver.findElement(By.xpath("///*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[68]/div/div/span/a[3]")).isEnabled();
	boolean previous = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[66]/div/div/span/a[1]")).isSelected();
		driver.close();
		System.out.println(previous);
		

	}

}
