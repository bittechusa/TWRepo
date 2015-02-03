import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class B {
	FirefoxDriver dr=new FirefoxDriver();
	public void loop() throws InterruptedException
	{
	dr.get("https://www.eshopper24.com");
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Actions a=new Actions(dr);
	WebElement ele=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]"));
	Thread.sleep(2000);
	a.moveToElement(ele).perform();
	dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/div/div[1]/ul/li/a")).click();
	int s=dr.findElements(By.xpath("html/body/div[4]/div[2]/div/div/aside/figure[2]/div/ul/li[2]/ul/li[1]/ul/li/ul/li")).size();
	int s1=dr.findElements(By.xpath("html/body/div[4]/div[2]/div/div/section/section/div")).size();
	for(int i=1;i<=s;i++)
	{Thread.sleep(2000);
		dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/aside/figure[2]/div/ul/li[2]/ul/li[1]/ul/li/ul/li["+i+"]/a/b")).click();
		
		Thread.sleep(2000);

		  for(int j=1;j<3;j++)
				{
					dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/section/section/div["+j+"]/figure/a/img")).click();
					Thread.sleep(2000);
					dr.navigate().back();
					
					
					
				}
		
  
    
	}
		
		
		
	
	}

}
