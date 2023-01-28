package assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartxpathAssignment {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.flipkart.com/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[.='✕']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung mobiles");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(4000);
String priceofMobile = driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F23 5G (Forest Green, 128 GB)']/../following-sibling::div[@class='col col-5-12 nlI3QM']//div[@class='_30jeq3 _1_WHN1']")).getText();
	System.out.println(priceofMobile+":is the price of mobile" );
	}

}
