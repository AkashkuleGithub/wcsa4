package testNGParallelExection;

import org.testng.annotations.Test;

public class M2 {
  @Test(dependsOnMethods =" m1")
  public void m2() {
  }
}
