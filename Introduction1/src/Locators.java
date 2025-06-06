import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// Implicit wait 5 sec time out
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("Nikhil");
		driver.findElement(By.name("inputPassword")).sendKeys("12345");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		// For forget password.
		driver.findElement(By.linkText("Forgot your password?")).click();
		// For pause for running script
		Thread.sleep(2000);
		// XPATH "//input[@placeholder='Name']"
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nikhil");
		// cssSelector
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("nikhil@tcs.com");
		// clear the email
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		// cssslector
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("nikhil@gmail.com");
		// otherway cssslector
		// driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("nikhil.gmail.com");
		// parent to child through xpath
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9764730085");
		// resetlogin
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		// parent to child through cssSlector
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		// Let login through correct username and password
		//// div[@class='forgot-pwd-btn-conainer']/button[1] Parent to child traverse.
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		// for username we are going regular exp input[type*='pass']
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector(" div[class='login-container'] p")).getText());
		driver.findElement(By.cssSelector(".logout-btn")).click();
	}

}
