package testNGPack1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void logInMethod() 
  {
	  Reporter.log("LOg In is Done",true);
  }
  @Test(dependsOnMethods = "logInMethod")
  public void createUser() 
  {
	  Reporter.log("User created!",true);
}
  @Test(dependsOnMethods = "createUser")
  public void logoutMethod() 
  {
	  Reporter.log("LOgout is Done",true);
}
}
