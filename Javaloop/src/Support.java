import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Support 
{
	FirefoxDriver dr=new FirefoxDriver();
	public void loop()throws InterruptedException
	{
		dr.get("http://www.facebook.com");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//dr.findElement (By,xpath(html/body/div[4]/div[2]/div/div/section/section))click();
		
	}

}
