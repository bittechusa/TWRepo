import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A 
{
	static FirefoxDriver dr;
	
	
	@BeforeClass
	public static void start1() throws InterruptedException
	{
		dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
	
	}
	@AfterClass
	public static void end1()
	{
		dr.quit();
	}
	
	
}
