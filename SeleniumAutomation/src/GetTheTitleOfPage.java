import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTheTitleOfPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\0036FP744\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe"
		 * );
		 */

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\0036FP744\\Desktop\\Selenium\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe"
		 * );
		 */
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\0036FP744\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// WebDriver driver = new FirefoxDriver();
		// WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
