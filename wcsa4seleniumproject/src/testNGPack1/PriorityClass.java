package testNGPack1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityClass {
	@Test(priority = 3)
  public void z() {
		Reporter.log("z",true);
  }
	@Test
	  public void h() {
			Reporter.log("h",true);
	  }
	@Test
	  public void g() {
			Reporter.log("g",true);
	  }
	@Test(priority = 3)
	  public void b() {
			Reporter.log("b",true);
	  }
	@Test(priority = 0)
	  public void a() {
			Reporter.log("z",true);
	  }
	@Test(priority = 7)
	  public void m() {
			Reporter.log("m",true);
}
	@Test(priority = -1)
	  public void p() {
			Reporter.log("p",true);
	
}
}