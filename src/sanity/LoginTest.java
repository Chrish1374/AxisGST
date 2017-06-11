package sanity;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseTestCases.CommonCases;

public class LoginTest extends CommonCases {

  @BeforeClass
  public void login() throws InterruptedException {

    driver = loginSuccess("sfs", "sdc");
    Thread.sleep(1000);

  }

  @Test
  public void TestCase() throws InterruptedException {
  
	 


  }
  
 

}
