package sanity;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseTestCases.CommonCases;

public class RegsByCustId extends CommonCases {
  
	
	
	@Test
  public void regsByCustomerId() throws InterruptedException {
	  Select func=new Select(regs.functio(driver));
		func.selectByValue("add");;
		regs.customerRadio(driver).click();
		regs.custIdTxtBox(driver).sendKeys("12BHS765");
		regs.submitButton(driver).click();
		Thread.sleep(1500);
		String actual=regs.errorMsg(driver).getText();
		String expected="Customer Id not found.";
		System.out.println(actual);
		String result=verify(actual,expected);
		System.out.println(result);
  }
	
	
	

}
