 import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A 
{
	static WebDriver dr;
	@BeforeClass
	public static void m1()
	{
	//dr=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "/Users/rockingemon/Downloads/chromedriver");
		dr=new ChromeDriver();
	dr.get("https://www.facebook.com");
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public static void m2()
	{
		dr.quit();
	}

}
