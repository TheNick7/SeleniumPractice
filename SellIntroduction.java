import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SellIntroduction {

	public static void main(String[] args) {
		
		// Invoking Browser
		// Chrome ChromeDriver- Methods close get
		// FireFox FirefoxDriver- Methods close get
		//WebDriver close get
		//WebDriver methods + class methods
		//   chromedriver.exe - Chrome browser
		// Step to invoke chrome driver
		// Selenium Manager also do this invoking part
		//System.setProperty("webdriver.chrome.driver","C:/Users/Admin/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.getWindowHandle();
		

	}

}
