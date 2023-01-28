package testNGPack;
 
import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestValidLogin extends BaseTest{
  @Test
  @Parameters({"browser","usn","Pass"})
  public void validLogin() throws InterruptedException {

		 driver.findElement(By.name("username")).sendKeys("admin");
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		  
		  driver.findElement(By.id("loginButton")).click();
  }
}
