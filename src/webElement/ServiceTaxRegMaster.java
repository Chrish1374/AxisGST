package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ServiceTaxRegMaster {
	
	// find web Element Home Tag 
	  public WebElement HomeTag(WebDriver driver) {
	    return driver.findElement(By.xpath("html/body/header/div/div/div/h1"));
	  }

	  // find web Element GST-Goods and Service Tax Registration Master 
	  public WebElement GSTSerTaxRegMaster(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='function']"));
	  }

	  // find web Element Login Id 
	  public WebElement loginId(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[2]/li[1]"));
	  }
	  
	  // find web Element SolID
	  public WebElement SolID(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[2]/li[2]"));
	  }
	  
	  // find web Element Function 
	  public WebElement function(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[1]/div/div/div[1]/div/label[1]"));
	  }
	  
	  // find web Element FunctionOption 
	  public WebElement functionOption(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[1]/div/div/div[1]/div/label[2]"));
	  }
	 

	  // find web Element Source Sys
	  public WebElement sourceSys(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[1]/div/div/div[2]/div/label[1]/strong"));
	  }
	  
	  // find web Element Source Sys Option
	  public WebElement sourceSysOption(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[1]/div/div/div[2]/div/label[2]"));
	  }

	  // find web Element sourceSysRefer
	  public WebElement sourceSysRefer(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[1]/div/div/div[3]/div/label[1]/strong"));
	  }
	  
	  // find web Element sourceSysReferOption
	  public WebElement sourceSysReferOption(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[1]/div/div/div[3]/div/label[2]"));
	  }
	  

	  // find web Element custName
	  public WebElement custName(WebDriver driver) {
		    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[1]/div/div/div[4]/div/div/label"));
		  }
	  
	  
	  // find web Element custNameTxtBox
	  public WebElement custNameTxtBox(WebDriver driver) {
		    return driver.findElement(By.xpath(".//*[@id='custTempName']"));
		  }
	  
	  // find web Element gstIn
	  public WebElement gstIn(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div/label"));
	  }
	  
	  // find web Element gstInTextBox
	  public WebElement gstInTextBox(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='gstMasterList0.gstNum']"));
	  }
	  
	  
	// find web Element gstInRegDate
		  public WebElement gstInRegDate(WebDriver driver) {
		    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div/label"));
		  }
	
		  
		// find web Element gstInRegDatePicker
		  public WebElement gstInRegDatePicker(WebDriver driver) {
		    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div/div/div/img"));
		  }
	
		// find web Element gstInRegDatePickerMonthYear
		  public WebElement gstInRegDatePickerMonthYear(WebDriver driver) {
		    return driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div"));
		  }
		  

	// find web Element gstInRegDatePickerMonthYearChangeButton
	  public WebElement gstInRegDatePickerMonthYearChangeButton(WebDriver driver) {
	   return driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]"));
	  }
			  	  
	// find web Element gstInRegDatePickerDates
	  public List<WebElement> gstInRegDatePickerDates(WebDriver driver) {
		   return driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
		  }
		  
   
		  
	// find web Element CustomerDivision
		  public WebElement customerDivision(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div/label"));
			  }
		  
	// find web Element CustomerDivisionTextbox
		  public WebElement customerDivisionTextbox(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterList0.customerDivision']"));
			  }	  
		// find web Element AddressLine1
		  public WebElement addressLine1(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div/label"));
			  }	  

		  
		// find web Element AddressLine1Textbox
		  public WebElement addressLine1Textbox(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterList0.addressLine1']"));
			  }	
		
		// find web Element State
		  public WebElement state(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div[1]/div/label"));
			  }	
		  
		// find web Element StateDropDown
		  public WebElement stateDropDown(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterList0.stateCode']"));
			  }	
		  
		// find web Element City
		  public WebElement city(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div[2]/div/label"));
			  }	
		
		// find web Element CityDropDown
		  public WebElement cityDropDown(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterList0.cityCode']"));
			  }	
		  
		
		// find web Element pinCode
		  public WebElement pinCode(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div[3]/div/label"));
			  }	  
		  
		// find web Element pinCodeTextBox
		  public WebElement pinCodeTextBox(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterList0.pincode']"));
			  }	 
		  
		// find web Element mobile
		  public WebElement mobile(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[4]/div[1]/div/label"));
			  }	
		  
		// find web Element mobileTextbox
		  public WebElement mobileTextbox(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterList0.mobile']"));
			  } 
		// find web Element email
		  public WebElement email(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[3]/div[2]/div/label"));
			  }	
		  
		// find web Element emailTextbox
		  public WebElement emailTextbox(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterList0.email']"));
			  }	
		  
		// find web Element sezFlag
		  public WebElement sezFlag(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[5]/div[1]/div/label"));
			  }	 
		  
			// find web Element sezFlagCheckBox
		  public WebElement sezFlagCheckBox(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterList0.sezFlag1']"));
			  }	 
		 
			// find web Element sezCode
		  public WebElement seCode(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[5]/div[2]/div/label"));
			  }	
		  
		// find web Element sezCodeTextbox
		  public WebElement sezCodeTextbox(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='sez_code_0']"));
			  }	
		  
			// find web Element remark
		  public WebElement remark(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[5]/div[3]/div/label"));
			  }	
		  
		  
			// find web Element remarkTextbox
		  public WebElement remarkTextbox(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterList0.freeText1']"));
			  }	
		  
		  
		// find web Element exemptionFlag
		  public WebElement exemptionFlag(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[6]/div[1]/div/label"));
			  }	
		  
		// find web Element exemptionFlagCheckbox
		  public WebElement exemptionFlagCheckbox(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterList0.exempFlag1']"));
			  }
		  
		// find web Element exemptionType
		  public WebElement exemptionType(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[6]/div[2]/div/label"));
			  }	
		  
		// find web Element exemptionTypetextbox
		  public WebElement exemptionTypetextbox(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='exempType_0']"));
			  }	  
		  
		  
		// find web Element exemptionValidTill
		  public WebElement exemptionValidTill(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[6]/div[3]/div/label"));
			  }	
		  
		// find web Element exemptionValidTillDatePicker
		  public WebElement exemptionValidTillDatePicker(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='gstMasterForm']/div/div[1]/div[2]/div/div/div/div/div[2]/div[6]/div[3]/div/div/div/div/img"));
			  }	 
		  
		// find web Element exemptionValidTillDatePickerMonyhYear
		  public WebElement exemptionValidTillDatePickerMonyhYear(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div"));
			  }	
		  
		// find web Element exemptionValidTillDatePickerMonyhYearPrevChangeButton
		  public WebElement exemptionValidTillDatePickerMonyhYearPrevChangeButton(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]"));
			  }	
		  
		// find web Element exemptionValidTillDatePickerMonyhYearNextChangeButton
		  public WebElement exemptionValidTillDatePickerMonyhYearNextChangeButton(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]"));
			  } 
		  
		  
		// find web Element exemptionValidTillDatePickerDates
		  public List<WebElement> exemptionValidTillDatePickerDates(WebDriver driver) {
			    return driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
			  }   
		  
		  
		// find web Element submitSysForm
		  public WebElement submitSysForm(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='submitSysForm']"));
			  }  
		  
		
		  
}
