package newDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PhonePay {
  @Test
  public void PhonePaytest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.phonepe.com/");
	  driver.close();
	  Thread.sleep(100);  
  }
}
