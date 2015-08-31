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
	
	

@BeforeSuite(alwaysRun=true)
public void beforesuite()	
{
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
	
