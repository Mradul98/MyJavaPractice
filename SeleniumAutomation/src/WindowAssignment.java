import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\0036FP744\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		driver.switchTo().window(parentwindow);
		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	}

}
