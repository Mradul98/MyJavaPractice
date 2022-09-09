import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\0036FP744\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//driver.findElement(By.xpath("(//a[@value='KNU'])[2]")).click(); //Index concept in xpath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='KNU']")).click();
		Thread.sleep(2000);
		String text=(driver.findElement(By.cssSelector("input[name='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getText());
		Assert.assertEquals(text,"Kanpur (KNU)");
		driver.close();
		
		
		

	}

}
