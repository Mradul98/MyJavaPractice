package Automation_Testing.Mavan_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject_Login {

	WebDriver driver;
	public PageObject_Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="UserEmail")
	WebElement UserEmail;

}
