import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Keyboard;


public class B extends A
{
	
    
  
     //Keyboard kb= (() dr).getKeyboard();
     
	
	C x;
	@Test
	public void x1() throws InterruptedException
	{
		x=new C(dr);
		x.m1(By.xpath(".//*[@id='email']"), "pokomonemon@ovi.com");
		x.m1(By.xpath(".//*[@id='pass']"), "rocking1996");
		x.m2(By.xpath(".//*[@id='loginbutton']"));
		Thread.sleep(3000);
		//x.m2(By.xpath(".//*[@id='u_0_3']/a"));
		//Thread.sleep(3000);
		//x.m2(By.xpath(".//*[@id='u_0_2']/div[3]/div/div[1]/div/div/ul/li[1]/a"));
		//Thread.sleep(3000);
		//kb.sendKeys("hooooo haaaaaaa");
		//Thread.sleep(2000);
		//kb.sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		x.m2(By.xpath(".//*[@id='userNavigationLabel']"));
		Thread.sleep(3000);
		x.m2(By.xpath(".//*[@id='logout_from']/label/input"));
		Thread.sleep(3000);
		dr.navigate().back();
		
		
	}
	
	
	

}
