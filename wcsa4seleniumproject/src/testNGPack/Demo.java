package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo
{
  @Test
  public void demo() 
  {
	//System.out.println("This is method of demo class"); 
	Reporter.log("This is method of demo class!!",true);
  }
  @Test
  public void demo1()
  {
  Reporter.log("this is demo1 method",true);
}
  @Test
  public void demo2()
  {
	  int a=78;
	  int b=2;
	  int res=a/b;
			  Reporter.log("this is method of demo2",true);
  }
}
