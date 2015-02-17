import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseTest 
{
	WebDriver dr;
	@Before
	public void start()
	{
		String x=System.getProperty("Browser");
		if(x.equals("F"))
		{
		dr=new FirefoxDriver();
		dr.get("http://www.bluefly.com");
		}
		else if(x.equals("C"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\jarfile\\chromedriver.exe");
			dr=new ChromeDriver();
		}
		else if(x.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\jarfile\\IEServerdriver.exe");
			dr=new InternetExplorerDriver();
			
		}
		else
		{
		dr=new FirefoxDriver();
		dr.get("http://www.eshopper24.com");
		}
	}
	@Test
	public void test1()
	{
		//dr.findElement(by)
	}
	

}
