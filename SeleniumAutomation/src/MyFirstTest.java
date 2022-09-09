import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\0036FP744\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/c/MalaiMarke");
		
		
	}

}
