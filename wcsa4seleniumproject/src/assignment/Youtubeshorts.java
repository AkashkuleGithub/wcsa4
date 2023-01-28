package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubeshorts {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://www.youtube.com/");
					driver.manage().window().maximize();

					driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[10]")).click();
					Thread.sleep(3000);
					List<WebElement> options = driver.findElements(By.xpath("//a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-slim-media']"));
					
					for (WebElement  webElement : options){
						String opt = webElement.getText();
						Thread.sleep(2000);
						System.out.println(opt);

	           }
		}
}
