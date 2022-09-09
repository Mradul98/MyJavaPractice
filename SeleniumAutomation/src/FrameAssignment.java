import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\0036FP744\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://the-internet.herokuapp.com/nested_frames");
			driver.switchTo().frame("frame-top");
			driver.switchTo().frame("frame-middle");
			String text=driver.findElement(By.xpath("//div[@id='content']")).getText();
			System.out.println(text);
			
			

	}

}
