import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class B 
{
FirefoxDriver dr=new FirefoxDriver();
public void Facebook()
{
	dr.get("http://www.facebook.com");
	dr.manage().window().maximize();
	//dr.findElements(By.id("pokomonemon@ovi.com")).size();
	//dr.findElements(By.id("Emon1996")).size();
	dr.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	
	
}
}
