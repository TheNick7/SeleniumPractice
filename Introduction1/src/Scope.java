import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 // Give count of links present on the site
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Limited section part of the link on site ex: footer section
		WebElement Footerdriver = driver.findElement(By.id("gf-BIG"));// limiting webriver scope
		System.out.println(Footerdriver.findElements(By.tagName("a")).size());
		 
	}
}
