package utility;

import java.util.Properties;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBaseSetup {


  public static WebDriver driver;
  public static String url="http://gst.tejora.co/gst/" ;
  

   public WebDriver initFirefoxDriver(String URL) {

    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get(URL);
    return driver;

  }
   
   
   
   public String verify(String actual,String expected){
	   if(actual.equals(expected)){
			return "Test Pass";
		}
		else
			return "test fail";
   }

  @BeforeClass
  // public WebDriver initializeTestBaseSetup(String browserType, String appURL) {
  public WebDriver initializeTestBaseSetup( String url) {

        driver = initFirefoxDriver(url);
        return driver;
   }

}
