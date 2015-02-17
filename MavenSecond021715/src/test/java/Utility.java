import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utility 
{
	WebDriver dr;
	Utility(WebDriver dr)
	{
		this.dr=dr;
	}
	public void verifyImage()
	{
		if(dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/section/p[1]/img"))!=null)
		{
			System.out.println("image found");
		}
		else
			System.out.println("image not found");
		}
	public void waitfor(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(dr, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	

}
