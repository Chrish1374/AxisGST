package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {
	
	// find web Element Home Tag 
	  public WebElement HomeTag(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[1]/li[1]/a"));
	  }

	  // find web Element Function 
	  public WebElement functio(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='function']"));
	  }

	  // find web Element Customer Id 
	  public WebElement customerId(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='addForm']/div[3]/div[1]/div[1]/div/label[1]"));
	  }

	  // find web Element customerRadio
	  public WebElement customerRadio(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='cust_id']"));
	  }

	  // find web Element Source Sys
	  public WebElement sourceSys(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='addForm']/div[3]/div[1]/div[1]/div/label[2]"));
	  }

	  // find web Element sourceSysRadio
	  public WebElement sourceSysRadio(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='source_sys']"));
	  }
	  
	  // find web Element custIdTxtBox
	  public WebElement custIdTxtBox(WebDriver driver) {
		    return driver.findElement(By.xpath(".//*[@id='custId']"));
		  }
	  
	  // find web Element srcNameTxtBox
	  public WebElement srcNameTxt(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='srcName']"));
	  }
	  
	// find web Element srcRefNumTxtBox
		  public WebElement srcRefTxt(WebDriver driver) {
		    return driver.findElement(By.xpath(".//*[@id='srcRef']"));
		  }
	  
	// find web Element submitFunctionForm
		  public WebElement submitButton(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='submitFunctionForm']"));
			  }
		  
		// find web Element errorMsg
		  public WebElement errorMsg(WebDriver driver) {
			    return driver.findElement(By.xpath(".//*[@id='addForm']/div[3]/div[1]/div[4]/div/div"));
			  }	  

}
