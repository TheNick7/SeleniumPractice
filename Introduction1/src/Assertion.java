import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Adding PASSENGERS
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(2000);
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				// Validation for 1 Adult
				Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "1 Adult");
				/*
				 * int i = 1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++;
				 * }
				 */
				for (int i = 1; i < 5; i++) {
					driver.findElement(By.id("hrefIncAdt")).click();

				}
				for (int j = 1; j < 3; j++) {
					driver.findElement(By.id("hrefIncChd")).click();
				}

				driver.findElement(By.id("hrefIncInf")).click();
				driver.findElement(By.id("btnclosepaxoption")).click();
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				
				// Validation for PASSENGERS 
				Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult, 2 Child, 1 Infant");
		
		// Assertion use for validation for that we have to intro TestNG Jar files.
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Thread.sleep(2000);
		
		
		
		
		
		
		
		

	}

}
