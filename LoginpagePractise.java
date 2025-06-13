import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginpagePractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

       //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        
      //Products
	    String[] Items = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};

        
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
       
        driver.findElement(By.xpath("//label[2]//span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#okayBtn")).click();
        //driver.findElement(By.xpath("//select[@class='form-control']")).click();
        driver.findElement(By.xpath("//option[@value='consult']")).click();
        driver.findElement(By.xpath("//input[@id='terms']")).click();
        driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
       /* for (int i = 0; i < products.size(); i++)

		{

			products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click(); */
	}

	
	

}
