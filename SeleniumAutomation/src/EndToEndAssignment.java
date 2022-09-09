import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\0036FP744\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Mradul Katiyar");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mradul@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("mradul@123");
		driver.findElement(By.id("exampleCheck1")).click();
		boolean a = driver.findElement(By.id("exampleCheck1")).isSelected();
		System.out.println(a);
		Select obj = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		obj.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("05/12/1998");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		String text=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		Assert.assertEquals(text, "Success! The Form has been submitted successfully!.");
		driver.close();
		

	}

}
