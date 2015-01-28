import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SmokeTest {
	  static FirefoxDriver dr=new FirefoxDriver();

	public static void main(String[] args) {
		//dr.get("http:google.com");
		dr.get("http:faceboook.com");
		  BaseTest bt=new BaseTest(dr);
	        bt.geturl();
	        bt.type(By.id("email"), "arif");
	        bt.type(By.id("pass"), "123");
	       // bt.click(By.id("u_0_n"));
	       // bt.verifyTitle("Facebook");
	       // bt.verifyText("shahidulo");
	       // bt.geturl();
	      //  bt.m2();
	      //  BaseTest bt1=new BaseTest("yellow");
	       // bt1.m2();
	        //bt1.m2();
	        
	        //dr.findElement(by).click();
	    }

}



