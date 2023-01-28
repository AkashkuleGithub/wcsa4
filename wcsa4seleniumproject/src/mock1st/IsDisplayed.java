package mock1st;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 driver.get("http://127.0.0.1/login.do");
		 
		WebElement Usernametextbox = driver.findElement(By.name("username"));
		Usernametextbox.sendKeys("Admin");
		
		WebElement Passwordtextbox = driver.findElement(By.name("pwd"));
		Passwordtextbox.sendKeys("manager");
		
		WebElement LoginButton = driver.findElement(By.xpath("//a[@id='loginButton']"));
		Thread.sleep(2000);
		
		Usernametextbox.clear();
		Passwordtextbox.clear(); 
		
		boolean status = LoginButton.isDisplayed();
		System.out.println(status);
	}

}
