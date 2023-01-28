package scenarios;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Droppble {


		public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		     
		     
		     driver.get("https://jqueryui.com/droppable/");
		     Actions act = new Actions(driver);
		    WebElement w = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		    driver.switchTo().frame(w);
		   
		 WebElement target = driver.findElement(By.id("draggable"));
		            WebElement source = driver.findElement(By.id("droppable"));
		 
		   act.dragAndDrop(target,source).build().perform();
		   Thread.sleep(4000);
		     
		    	     
	}

}
