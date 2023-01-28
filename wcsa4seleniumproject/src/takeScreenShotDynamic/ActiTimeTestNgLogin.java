package takeScreenShotDynamic;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(CustomListner.class)
public class ActiTimeTestNgLogin extends BaseTest{
  @Test
  public void setUp() {
	  
	  initialization();
  }
  @Test(priority = 1)
  public void logInPage() {
	 SoftAssert sa = new SoftAssert();
	 String actualLogInPageTitle = driver.getTitle();
	 sa.assertEquals(actualLogInPageTitle,"actiTIME - Login");
	 driver.findElement(By.name("username")).sendKeys("admin");
	
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	  
	  driver.findElement(By.id("loginButton")).click();	
  }
  @Test
  public void homepage() {
		 SoftAssert sa = new SoftAssert();
		 String actualLogInPageTitle = driver.getTitle();
		 sa.assertEquals(actualLogInPageTitle,"actiTIME - Login");
		 driver.findElement(By.name("username")).sendKeys("admin");
		
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		  
		  driver.findElement(By.id("loginButton")).click();	
  }
}
