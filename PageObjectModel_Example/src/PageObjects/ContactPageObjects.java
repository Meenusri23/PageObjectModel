package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPageObjects {
	
	@FindBy (linkText = "CONTACT")
	public static WebElement ContactLink;
	
	@FindBy (id = "wpforms-161-field_0")
	public static WebElement Firstname;
	
	@FindBy (id = "wpforms-161-field_0-last")
	public static WebElement Lastname;
	
	/*
	 * public static WebElement ContactLink(WebDriver driver) { return
	 * driver.findElement(By.linkText("CONTACT")); }
	 * 
	 * public static WebElement Firstname(WebDriver driver) { return
	 * driver.findElement(By.id("wpforms-161-field_0")); }
	 * 
	 * public static WebElement Lastname(WebDriver driver) { return
	 * driver.findElement(By.id("wpforms-161-field_0-last")); }
	 */
}
