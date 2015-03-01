import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class C 
{
	 WebDriver dr;
	 C (WebDriver dr2)
	 {
		dr=dr2; 
	 }
	 public  void m1(By by,String x)
	 {
		 dr.findElement(by).sendKeys(x);
	 }
	 public void m2(By by)
	 {
		 dr.findElement(by).click();
	 } 
	 
}
