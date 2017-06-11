package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
  // find web Element Login Tag 
  public WebElement loginTag(WebDriver driver) {
    return driver.findElement(By.xpath("html/body/div[1]/div/div[1]/h3"));
  }

  // find web Element User name 
  public WebElement username(WebDriver driver) {
    return driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/form/div[1]/label"));
  }

  // find web Element User name 
  public WebElement usernameTextbox(WebDriver driver) {
    return driver.findElement(By.xpath(".//*[@id='loginId']"));
  }

  // find web Element Password -- Text
  public WebElement passwordTextbox(WebDriver driver) {
    return driver.findElement(By.xpath(".//*[@id='password']"));
  }

  // find web Element Password -- Textbox
  public WebElement passord(WebDriver driver) {
    return driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/form/div[2]/label"));
  }

  // find web Element Submit -- Button
  public WebElement loginButton(WebDriver driver) {
    return driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/form/div[3]/div/div/div[1]/button"));
  }

  public WebElement cancelButton(WebDriver driver) {
	    return driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/form/div[3]/div/div/div[2]/button"));
	  }

}
