package SeleniumJavaFramework.SeleniumJavaFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrowserTest {
	
	public static void main(String[] args) {
		
		//Set the path
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\BSS\\eclipse-workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\Mozilla geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com");
	}

}
