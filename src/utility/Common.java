package utility;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import webElement.ServiceTaxRegMaster;


public class Common {


  // To check the text box visibility and enter the text
  public void enter_after_text_visibility(WebDriver driver, WebElement We, String a) {
    Boolean isDisplayed = We.isDisplayed();
    if (isDisplayed == true) {
      We.sendKeys(a);
    } else {
      System.out.println("Element not found to enter the text");
    }
  }



  public void Check_box_visibility(WebDriver driver, WebElement We) {
    Boolean isselected = We.isSelected();
    if (isselected == false) {
      We.click();
    }
  }

  public void Select_value_DDL(WebDriver driver, WebElement We, int s) {
    Select se = new Select(We);
    se.selectByIndex(s);

  }

  public void Radio_button(WebDriver driver, WebElement We) {
    Boolean Radio = We.isSelected();
    if (Radio.booleanValue() == false) {
      We.click();
    } else {
      System.out.println("The Radio button is already selected");
    }
  }

  public void Click(WebDriver driver, WebElement We) {
    Boolean isdisplayed = We.isDisplayed();
    if (isdisplayed == true) {
      We.click();
    }
  }

  
  public static void wait(WebDriver driver, WebElement We) {
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.visibilityOf(We));



  }

  public static void wait_clickable(WebDriver driver, WebElement We) {
    WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.elementToBeClickable(We));


  }

 
 

}
