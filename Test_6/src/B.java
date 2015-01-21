import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class B 
{
	FirefoxDriver dr= new FirefoxDriver();
	public void loop() throws InterruptedException
	{
		dr.get("http://www.mta.info");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions a= new Actions(dr);
		WebElement ele=dr.findElement(By.xpath(".//*[@id='menu-221-1']/a"));
		Thread.sleep(2000);
		a.moveToElement(ele).perform();
	int s=dr.findElements(By.xpath(".//*[@id='menu-221-1']/a")).size();
	int s1=dr.findElements(By.xpath(".//*[@id='menu-221-1']/a/ul")).size();
	for(int i=1;i<s;i++)
	{   
		Actions a1=new Actions(dr);
		WebElement ele1=dr.findElement(By.xpath(".//*[@id='menu-221-1']/a"));
		Thread.sleep(2000);
		a1.moveToElement(ele).perform();
		for(int j=1;j<s1;j++)
		{
			dr.findElement(By.xpath(".//*[@id='menu-221-1']/ul/li["+j+"]")).click();
			Thread.sleep(2000);
			dr.navigate().back();
			Thread.sleep(2000);
			 Actions a2=new Actions(dr);
             WebElement ele2=dr.findElement(By.xpath(".//*[@id='menu-221-1']/a"));
             Thread.sleep(2000);
             a2.moveToElement(ele2).perform();
		}
		
		
	}

	
		
		
	

}

}
