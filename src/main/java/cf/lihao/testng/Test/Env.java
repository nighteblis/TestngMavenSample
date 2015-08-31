package cf.lihao.testng.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Env {
	
	
	private TestBean test ;
	private ApplicationContext context;

@BeforeSuite(alwaysRun=false)
public void beforesuite()	
{

	System.out.println();
	
	  context = new FileSystemXmlApplicationContext("src/main/java/spring.xml");

	  test = (TestBean) context.getBean("testBean");
	      
	test.init();	
	System.out.println("before suite");
}
@AfterSuite	(alwaysRun=true)
public void aftersuite()	
{
	System.out.println("after suite");
}
@BeforeTest(alwaysRun=true)
public void beforetest()	
{
	System.out.println("before test");
}
@AfterTest(alwaysRun=true)
public void Aftertest()	
{
	System.out.println("after test");
}
}
	
