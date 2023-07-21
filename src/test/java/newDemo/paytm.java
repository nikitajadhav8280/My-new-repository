package newDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paytm 
{
  @Test
  public void paytmtest() throws InterruptedException
  {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://paytm.com/");
	 driver.close();
	 Thread.sleep(100);
	
	  
  }
}
