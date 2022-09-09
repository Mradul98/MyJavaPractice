import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Locator2 {
	
	public static String GetThePassword(WebDriver driver) throws InterruptedException
	
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		String Password=(driver.findElement(By.cssSelector("form p")).getText());
		//Please use temporary password 'rahulshettyacademy' to Login.
		String arr1[]=Password.split("'");
		String arr2[]=arr1[1].split("'");
		return arr2[0];
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name="Mrdaul";
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\0036FP744\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=GetThePassword(driver);
		

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys(name);

		driver.findElement(By.name("inputPassword")).sendKeys(password);

		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText();
		Assert.assertEquals(text, "You are successfully logged in.");
		String text1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/h2")).getText();
		Assert.assertEquals(text1,"Hello "+name+",");
		driver.findElement(By.className("logout-btn")).click();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.close();

	}

}
