import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOf_Links_inWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\0036FP744\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		
		

	}

}
