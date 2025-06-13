import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		System.out.println("Page title is:" + driver.getTitle());
		String PageTitle = driver.getTitle();
		String ExpectedTitle = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";

		if (PageTitle.equals(ExpectedTitle)) {
			System.out.println("Test case successfull.");
		} else {
			System.out.println("Test case fail.");
		}
		driver.findElement(By.xpath("//div[contains(text(),'one way')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'one way')]")).getText());
		driver.findElement(By.xpath("//div[contains(text(),'round trip')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'round trip')]")).getText());
		Thread.sleep(2000);
		
		

	}

}
