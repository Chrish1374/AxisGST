package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {
	
	// find web Element Logout Tag 
	  public WebElement logoutTag(WebDriver driver) {
	    return driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul[2]/li[4]/a"));
	  }
}
