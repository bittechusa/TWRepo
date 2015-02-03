import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class C 
{
	FirefoxDriver dr;
	C(FirefoxDriver ss)
	{
		dr=ss;
	}

	public void AnyProduct(By by, String y)
	{
		dr.findElement(by).sendKeys(y);
	}
}
