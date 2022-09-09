import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=obj.nextLine();
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\0036FP744\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		String text1=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		//Hello mradul, share this practice page and share your knowledge
		String [] textarr1=text1.split(",");
		String [] textarr2=textarr1[0].split(" ");
		Assert.assertEquals(textarr2[1],name);
				
		

	}

}
