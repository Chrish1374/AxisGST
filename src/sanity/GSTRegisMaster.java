package sanity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseTestCases.CommonCases;
import utility.Common;


public class GSTRegisMaster extends CommonCases {
	
	@Test
	public void gstResgMaster() throws InterruptedException{
		
		
		serTaxRegMaster.custNameTxtBox(driver).sendKeys("ahscdhsi");
		serTaxRegMaster.gstInTextBox(driver).sendKeys("2435KHRCT65TR12");
		WebElement calImg=serTaxRegMaster.gstInRegDatePicker(driver);
		gstInDatePicker(driver,calImg,"720165");
		serTaxRegMaster.customerDivisionTextbox(driver).sendKeys("assdas");
		serTaxRegMaster.addressLine1Textbox(driver).sendKeys("asaasvferss");
		WebElement state =serTaxRegMaster.stateDropDown(driver);
		com.Select_value_DDL(driver, state, 02);
		WebElement city =serTaxRegMaster.cityDropDown(driver);
		com.Click(driver, city);
		Thread.sleep(1000);
		com.Select_value_DDL(driver, city, 4);
		
		serTaxRegMaster.pinCodeTextBox(driver).sendKeys("165742");
		serTaxRegMaster.mobileTextbox(driver).sendKeys("1146574232");
		serTaxRegMaster.emailTextbox(driver).sendKeys("sdcnki@gsb.com");
		serTaxRegMaster.sezFlagCheckBox(driver).click();
		WebElement sezCode=serTaxRegMaster.sezCodeTextbox(driver);
		Common.wait(driver, sezCode);
		sezCode.sendKeys("165742");
		serTaxRegMaster.remarkTextbox(driver).sendKeys("sdacn");
		serTaxRegMaster.exemptionFlagCheckbox(driver).click();
		WebElement exemptionType=serTaxRegMaster.exemptionTypetextbox(driver);
		
		com.enter_after_text_visibility(driver, exemptionType,"hsuus");
		WebElement exempCalImg=serTaxRegMaster.exemptionValidTillDatePicker(driver);
		exempVailTillDatePicker(driver,exempCalImg,"920178");
		
		
		serTaxRegMaster.submitSysForm(driver).click();
		
	}
	
}
