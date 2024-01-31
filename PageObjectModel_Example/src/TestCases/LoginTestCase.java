package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObjects.LoginPageObjects;

public class LoginTestCase {
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.Username.sendKeys("student");
		
		LoginPageObjects.Password.sendKeys("Password123");
		
		LoginPageObjects.LoginBtn.click();
		
		//LoginPageObjects.Username.
		
		
		/*
		 * LoginPageObjects.Username(driver).sendKeys("student");
		 * 
		 * LoginPageObjects.Password(driver).sendKeys("Password123");
		 * 
		 * LoginPageObjects.LoginBtn(driver).click();
		 */
		
		
		/*
		 * driver.findElement(By.id("username")).sendKeys("student");
		 * 
		 * driver.findElement(By.id("password")).sendKeys("Password123");
		 * 
		 * driver.findElement(By.id("submit")).click();
		 */
		
		//driver.close();
	}

}
