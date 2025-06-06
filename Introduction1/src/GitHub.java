import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
	
		driver.manage().window().maximize();
		
		// SignUp
		driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign in →')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("login_field")).sendKeys("nikhil.bhalekari07@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Nikhil@0712");
		driver.findElement(By.cssSelector(".btn.btn-primary.btn-block.js-sign-in-button")).click();
		driver.findElement(By.xpath("//body/div[1]/div[5]/div[1]/div[1]/aside[1]/div[1]/div[1]/loading-context[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		
		

	}

}
