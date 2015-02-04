import org.junit.Test;
import org.openqa.selenium.By;

import com.bit.support.Support;


public class SmokeTest extends BaseTest 
{
	Support sp;
	@Test
	public void m1()
	{
		sp=new Support(dr);
		//sp.link(By.tagName("a"));
		sp.getAttribute();
		
	}

}
