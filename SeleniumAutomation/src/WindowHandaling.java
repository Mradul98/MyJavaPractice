import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandaling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\0036FP744\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> windowId=windows.iterator();
		String parentid=windowId.next();
		String childid=windowId.next();
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		String text=driver.findElement(By.cssSelector(".im-para.red")).getText();
		//Please email us at mentor@rahulshettyacademy.com with below template to receive response
		
		String arr1[]=text.split("at");
		String arr2[]=arr1[1].split(" ");
		System.out.println(arr2[0]);
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(arr2[0]);

	}

}
