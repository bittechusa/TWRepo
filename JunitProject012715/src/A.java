import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A 
{
	static FirefoxDriver dr;
	@Before
	public void start()
	{
		dr=new FirefoxDriver();
		dr.get("http://eshopper24.com");
	}
	
	/*@BeforeClass
	public static void start1()
	{
		dr=new FirefoxDriver();
		dr.get("http://eshopper24.com");
	}
	@AfterClass
	public static void end1()
	{
		dr.quit();
	}*/
	
	@After
	public void end()
	{
		dr.quit();
	}

}
