package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo
{
  @Test
  public void sumo() 
  {
	  Reporter.log("This is method of sumo class!!",true);
	  }
	  @Test
	  public void sumo1()
	  {
	  Reporter.log("this is sumo1 method!!",true);
	}
	  @Test
	  public void sumo2()
	  {
				  Reporter.log("this is method of sumo2!!",true);
	  }
	}
  
