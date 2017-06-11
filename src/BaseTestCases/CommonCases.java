package BaseTestCases;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.TestBaseSetup;
import webElement.Login;
import webElement.Logout;
import webElement.Registration;
import webElement.ServiceTaxRegMaster;
import utility.Common;

public class CommonCases extends TestBaseSetup {
  
	public Common com=new Common();
	public Login lo = new Login();
	public Logout lout=new Logout();
	public Registration regs=new Registration();
	public ServiceTaxRegMaster serTaxRegMaster= new ServiceTaxRegMaster();
  
  public WebDriver loginSuccess(String un, String password) {
    driver = initializeTestBaseSetup(url);
    lo.usernameTextbox(driver).sendKeys(un);
    lo.passwordTextbox(driver).sendKeys(password);
    lo.loginButton(driver).click();
    return driver;
  }

  public void logout(){
	  lout.logoutTag(driver).click();
	  String actual= lo.loginTag(driver).getText();
		if(actual.equals("LOGIN")){
			System.out.println("pass");
		}
		else
			System.out.println("Fail");
  }
  
  
  
  
  public void gstInDatePicker(WebDriver driver,WebElement calImg,String actualDate) throws InterruptedException{
	  calImg.click();
	  WebElement MonthYear=serTaxRegMaster.gstInRegDatePickerMonthYear(driver);
	  String monthYear=MonthYear.getText();
	  System.out.println(monthYear);
	  String[] mmyy=monthYear.split(" ");
	  //WebElement prevButton=serTaxRegMaster.gstInRegDatePickerMonthYearChangeButton(driver);
	  int month=0;
	  
      switch (mmyy[0]) {
          case "January":  month = 1;
                   break;
          case "February":  month = 2;
                   break;
          case "March":  month = 3;
                   break;
          case "April":  month = 4;
                   break;
          case "May":  month = 5;
                   break;
          case "June":  month = 6;
                   break;
          case "July":  month = 7;
                   break;
          case "August":  month = 8;
                   break;
          case "September":  month =9;
                   break;
          case "October": month = 10;
                   break;
          case "November": month = 11;
                   break;
          case "December": month = 12;
                   break;
          
      }
      
      String YYMM=""+mmyy[1]+month;
      int expectedyYYMM=Integer.parseInt(YYMM);
      System.out.println(expectedyYYMM);
      int actualYYMM=Integer.parseInt(actualDate.substring(1, 6));
      
      String actualDD=actualDate.substring(0,1);
      System.out.println(actualDD);
      if(expectedyYYMM>actualYYMM){
    	  
    	  int noClick=expectedyYYMM-actualYYMM;
    	  
    	  System.out.println(noClick);
      
    	  for(int i=0;i<noClick;i++){
    		  
    		 
    		  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]")).click();

    		 
    	  }
    	  
    	  List <WebElement> dates= serTaxRegMaster.gstInRegDatePickerDates(driver);
    	  outerloop:
    	  for(int i=0;i<dates.size();i++){
    		  System.out.println(dates.get(i).getText());
    		  if(actualDD.equals(dates.get(i).getText())){
    			  System.out.println("success");
    			  serTaxRegMaster.gstInRegDatePickerDates(driver).get(i).click();
    			  break outerloop;
    		  }
    	  }
      }
  }
  
  
  
  
  public void exempVailTillDatePicker(WebDriver driver,WebElement calImg,String actualDate) throws InterruptedException{
	  calImg.click();
	  WebElement MonthYear=serTaxRegMaster.exemptionValidTillDatePickerMonyhYear(driver);
	  String monthYear=MonthYear.getText();
	  System.out.println(monthYear);
	  String[] mmyy=monthYear.split(" ");
	  //WebElement prevButton=serTaxRegMaster.gstInRegDatePickerMonthYearChangeButton(driver);
	  int month=0;
	  
      switch (mmyy[0]) {
          case "January":  month = 1;
                   break;
          case "February":  month = 2;
                   break;
          case "March":  month = 3;
                   break;
          case "April":  month = 4;
                   break;
          case "May":  month = 5;
                   break;
          case "June":  month = 6;
                   break;
          case "July":  month = 7;
                   break;
          case "August":  month = 8;
                   break;
          case "September":  month =9;
                   break;
          case "October": month = 10;
                   break;
          case "November": month = 11;
                   break;
          case "December": month = 12;
                   break;
          
      }
      
      String YYMM=""+mmyy[1]+month;
      int expectedyYYMM=Integer.parseInt(YYMM);
      System.out.println(expectedyYYMM);
      int actualYYMM=Integer.parseInt(actualDate.substring(1, 6));
      
      String actualDD=actualDate.substring(0,1);
      System.out.println(actualDD);
      if(expectedyYYMM>actualYYMM){
    	  
    	  int noClick=expectedyYYMM-actualYYMM;
    	  
    	  System.out.println(noClick);
      
    	  for(int i=0;i<noClick;i++){
    		  
    		 
    		  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]/span")).click();

    		 
    	  }
    	  
    	  
    	  
    	  List <WebElement> dates= serTaxRegMaster.exemptionValidTillDatePickerDates(driver);
    	  outerloop:
    	  for(int i=0;i<dates.size();i++){
    		  System.out.println(dates.get(i).getText());
    		  if(actualDD.equals(dates.get(i).getText())){
    			  System.out.println("success");
    			  serTaxRegMaster.gstInRegDatePickerDates(driver).get(i).click();
    			  break outerloop;
    		  }
    	  }
      }
      else if(expectedyYYMM<actualYYMM){
int noClick=actualYYMM-expectedyYYMM;
    	  
    	  System.out.println(noClick);
      
    	  for(int i=0;i<noClick;i++){
    		  
    		 
    		  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();

    		 
    	  }
    	  
    	  
    	  
    	  List <WebElement> dates= serTaxRegMaster.exemptionValidTillDatePickerDates(driver);
    	  outerloop:
    	  for(int i=0;i<dates.size();i++){
    		  System.out.println(dates.get(i).getText());
    		  if(actualDD.equals(dates.get(i).getText())){
    			  System.out.println("success");
    			  serTaxRegMaster.gstInRegDatePickerDates(driver).get(i).click();
    			  break outerloop;
    		  }
    	  }

	  }
  }
  
  
  
}
