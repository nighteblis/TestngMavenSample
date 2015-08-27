package cf.lihao.testng.Test;

import org.testng.annotations.*;

public class Test1 {
	
	@Test(groups = { "functest", "checkintest" })
	  public void testMethod1() {
	  }
	 
	  @Test(groups = {"functest", "checkintest"} )
	  public void testMethod2() {
	  }
	 
	  @Test(groups = { "checkintest" })
	  public void testMethod3() {
		  System.out.println("method3");
	  }
	

}
