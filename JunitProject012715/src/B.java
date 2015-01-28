import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;


public class B extends A 
{
	@Test
	public void login() throws InterruptedException
	{
		dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("pokomonemon@ovi.com");
		dr.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Emon1996");
		dr.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		dr.findElement(By.xpath(".//*[@id='pageLoginAnchor']")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath(".//*[@id='logout_form']/label/input")).click();
		Thread.sleep(3000);
	}
	

}
