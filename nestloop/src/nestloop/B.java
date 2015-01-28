package nestloop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B 
{
	FirefoxDriver dr=new FirefoxDriver();
	
	public void m1(); 
	{
		dr.get("https://www.eshopper24.com/");
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a"));
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ele=dr.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li")).size();
		
	}

}
