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
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a=new Actions(dr);
		WebElement ele=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]"));
		Thread.sleep(2000);
		a.moveToElement(ele).perform();
		int s=dr.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li")).size();
		int s1=dr.findElements(By.xpath( "html/body/div[5]/header/section[3]/div/nav/ul/li[1]/div/div[1]/ul/li")).size();
	for(int i=1;i<s;i++)
	{   
		Actions a1=new Actions(dr);
		WebElement ele1=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li["+i+"]"));
		Thread.sleep(2000);
		a1.moveToElement(ele).perform();
		for(int j=1;j<s;j++)
		{
			dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li["+i+"]/div/div[1]/ul/li["+j+"]/a")).click();
			 Actions a2=new Actions(dr);
             WebElement ele2=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li["+i+"]"));
             Thread.sleep(2000);
             a1.moveToElement(ele2).perform();
		}
		
	
		
		
	}
	}
 
}
