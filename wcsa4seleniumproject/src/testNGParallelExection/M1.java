package testNGParallelExection;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class M1 {
  @Test
  public void m1() {
	  Assert.fail();
  
  Reporter.log("M1 is working",true);

}
  @Test(dependsOnMethods = "m1",alwaysRun = true)
  public void m2() {
	  Reporter.log("M2 method",true);
  }
}
