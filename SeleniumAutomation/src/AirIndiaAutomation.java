import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AirIndiaAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\0036FP744\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airindia.in/");
		Thread.sleep(2000);
		WebElement element1=driver.findElement(By.id("ddladult1"));
		WebElement element2=driver.findElement(By.id("ddlchildren1"));
		WebElement element3=driver.findElement(By.id("ddlinfants1"));
		Select dropdown1=new Select(element1);
		dropdown1.selectByIndex(4);
		String assert1=dropdown1.getFirstSelectedOption().getText();
		Assert.assertEquals(assert1,"5");
		Select dropdown2=new Select(element2);
		dropdown2.selectByIndex(3);
		String assert2=dropdown2.getFirstSelectedOption().getText();
		Assert.assertEquals(assert2,"3");
		
		
		

	}

}
