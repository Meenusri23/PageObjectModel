package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {

	
	 //String submit1 = "submit";
	 
	 @FindBy (how = How.ID, using = "username") 
	 public static WebElement Username;
	  
	  @FindBy (id = "password") 
	  public static WebElement Password;
	 
	 @FindBy (id = "submit") 
	 public static WebElement LoginBtn;
	 
	
	 

	
	/*
	 * public static WebElement Username(WebDriver driver) { return
	 * driver.findElement(By.id("username")); }
	 * 
	 * public static WebElement Password(WebDriver driver) { return
	 * driver.findElement(By.id("password")); }
	 * 
	 * public static WebElement LoginBtn(WebDriver driver) { return
	 * driver.findElement(By.id("submit")); }
	 */
	 
}
