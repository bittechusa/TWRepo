import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class A 
{
	WebDriver dr;
	Utility ut;
	@Test
	public void m1()
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	dr=new ChromeDriver();
	ut=new Utility(dr);
	
	dr.get("http://www.eshopper24.com");
	WebElement e=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a"));
	ut.waitfor(dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a")));
	e.click();
	ut.verifyImage();
	
	System.out.println("hi");
	/*if(dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/section/p[1]/img")).isDisplayed())
	{
		System.out.println("image found");
	}
	else
		System.out.println("image not found");
	}*/
	}

}
