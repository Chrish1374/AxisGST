package sanity;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import BaseTestCases.CommonCases;


public class RegsBySourSys extends CommonCases{
	
	
	@Test
public void regsBySourceSys() throws InterruptedException {
	  Select func=new Select(regs.functio(driver));
		func.selectByValue("add");;
		regs.sourceSysRadio(driver).click();
		regs.srcNameTxt(driver).sendKeys("12BHS765");
		regs.srcRefTxt(driver).sendKeys("12765");
		regs.submitButton(driver).click();
		Thread.sleep(1500);
		
}
	
	
	
}
