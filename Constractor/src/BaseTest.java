import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest<driver> {
	  FirefoxDriver driver;
	    String color="red";
	    BaseTest(FirefoxDriver dr)
	    {
	        driver=dr;
	     System.out.println("hi");    
	    }
	    public void click(By by)
	    {
	        System.out.println(color);
	        driver.findElement(by).click();
	    }
	    public void m2()
	    {
	        System.out.println(color);
	    }
	    public void type(By by,String x)
	    {
	        driver.findElement(by).sendKeys(x);
	    }
	    public void verifyTitle(String n)
	    {
	        System.out.println(driver.getTitle());
	        if(driver.getTitle().contains(n))
	        {
	            System.out.println("titled matched");
	        }
	        else
	            System.out.println("title did not match");
	    }
	    public void verifyText(String m)
	    {
	        if( driver.getPageSource().contains(m))
	         {
	            System.out.println("text found");
	            
	         }
	        else
	        {
	            System.out.println("text not found");
	        }
	    }
	    public void geturl()
	    {
	        System.out.println(driver.getCurrentUrl());
	    }
	    
	    BaseTest(String x)
	    {
	        color=x;
	        //System.out.println(color);
	    }
	 


}
