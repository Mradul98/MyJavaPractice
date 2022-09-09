import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceBookLogingAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\0036FP744\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");

		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("8512831285");
		driver.findElement(By.id("pass")).sendKeys("8400191881");
		
		driver.findElement(By.name("login")).click();
	
		System.out.println(driver.findElement(By.cssSelector("a[href='https://www.facebook.com/recover/initiate?lwv=120&lwc=1348092&ars=facebook_login_pw_error']")).getText());
		driver.wait();
		driver.close();

	}

}
