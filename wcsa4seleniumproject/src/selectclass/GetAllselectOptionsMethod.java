package selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllselectOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	     
	     driver.get("file:///C:/Automation/wcsa4%20new/multiple%20selectdown.html");
	     WebElement dropdownElement = driver.findElement(By.id("i1"));
	     Select sel = new Select(dropdownElement);
	     
	     for(int i=0;i<6;i++)
	     {
	    	 sel.selectByIndex(i);
	    	List<WebElement> alloptions = sel.getAllSelectedOptions();
	    	for(WebElement opts:alloptions)
	    	{
	    		String values = opts.getText();
	    		System.out.println(values);
	    		Thread.sleep(2000);
	    	}
	    	 
	     }


	}

}
