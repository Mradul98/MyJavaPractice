import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownHandaling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\0036FP744\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dp = new Select(dropdown);
		dp.selectByIndex(2);
		String text = (dp.getFirstSelectedOption().getText());
		Assert.assertEquals(text, "AED");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		

	}

}
