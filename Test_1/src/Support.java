import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Support {
	FirefoxDriver dr=new FirefoxDriver();
	public void loop() throws InterruptedException
	{
		dr.get("http://www.bluefly.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.findElement(By.xpath(".//*[@id='main-nav-men']/a")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath(".//*[@id='departmentLeftNaviContainer']/div[3]/ul/li[7]/a")).click();
		int s=dr.findElements(By.xpath("//div[@class='listProductGrid ui-helper-clearfix']/div/div")).size();
		for(int i=1;i<=s;i++)
		{
		dr.findElement(By.xpath("//div[@class='listProductGrid ui-helper-clearfix']/div/div["+i+"]/div[1]/a/img")).click();
		Thread.sleep(2000);
		dr.navigate().back();
		Thread.sleep(2000);

		}

		}
		}
