package PageFactoryWithoutAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class LoginWithoutFindBy {
	
	public static WebElement username;
	
	public static WebElement password;
	
	public static WebElement submit;
	
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		
		username.sendKeys("student");
		
		password.sendKeys("Password123");
		
		submit.click();
		
	}

}
