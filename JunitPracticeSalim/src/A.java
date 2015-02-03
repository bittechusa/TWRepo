import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A 
{
	static FirefoxDriver dr;
	@BeforeClass
	public static void start()
	{
		dr=new FirefoxDriver();
		dr.get("http://www.eshopper24.com");
	}
	@AfterClass
	public static void end()
	{
		dr.quit();
	}
	

}
