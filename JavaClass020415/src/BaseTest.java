import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;


public class BaseTest 
{
	WebDriver dr;
	
	@Before
	public void start()
	{
		//dr=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");
		dr=new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", "C:/driver/IEDriverServer.exe");
		//dr=new InternetExplorerDriver();
		//SafariDriver dr=new SafariDriver();
		dr.get("http://www.yahoo.com");
		
		
		
	}
	@After
	public void end()
	{
		
	}

}
