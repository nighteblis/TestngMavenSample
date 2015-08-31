package cf.lihao.testng.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;

@Test
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class Case extends AbstractTestNGSpringContextTests {

	
	@Autowired
    private TestBean testbean ;
	
	
	@Test(groups = { "functest", "checkintest" })
	public void testMethod1() {
	}
	@Test(groups = {"functest", "checkintest"} )
	public void testMethod2() {
	}
	@Test(groups = { "checkintest" })
	  public void testMethod3() {
		  testbean.init();
		  System.out.println("method3");
	  }

}
