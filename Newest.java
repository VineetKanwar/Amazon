package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newest {

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
		driver.findElement(By.cssSelector("#a-autoid-0-announce")).click();
		driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_4\"]")).click();
	boolean newarrivals = 	driver.getPageSource().contains("Newest arrivals");
	driver.close();
	System.out.println(newarrivals);
	
		//Select obj = new Select(driver.findElement(By.cssSelector("#a-autoid-0-announce")));
		//obj.selectByVisibleText("Newest arrivals");
		
		
		

	}

}
