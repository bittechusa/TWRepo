import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class B 
{
	FirefoxDriver dr=new FirefoxDriver();
	public void loop() throws InterruptedException
	{
		dr.get("http://www.oldnavy.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int s=dr.findElements(By.xpath(".//*[@id='universalTopNavLayout']/div[2]/div/ul/li")).size();
		int s1=dr.findElements(By.xpath(".//*[@id='sideNavCategories']/ul/li")).size();
		for(int i=1;i<s;i++)
			{
			dr.findElement(By.xpath(".//*[@id='universalTopNavLayout']/div[2]/div/ul/li[4]/a/img")).click();
			Thread.sleep(2000);
			//dr.navigate().back();
			for(int j=1;j<s1;j++)
			{
				dr.findElement(By.xpath("")).click();
				Thread.sleep(4000);
				dr.navigate().back();
			}
			
		}
		
	}

}
