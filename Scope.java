import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		 // Give count of links present on the site
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Limited section part of the link on site ex: footer section
		WebElement Footerdriver = driver.findElement(By.id("gf-BIG"));// limiting webriver scope
		System.out.println(Footerdriver.findElements(By.tagName("a")).size());
		 
		//
		WebElement Coloumdriver = Footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(Coloumdriver.findElements(By.tagName("a")).size());
		
		
		//Click on each of links and check where they are opening or not. (It will work next time get get more also)
		for(int i=1; i< Coloumdriver.findElements(By.tagName("a")).size(); i++) {
			
			//This will us to open links in tab
			String ClickOnLinksTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			Coloumdriver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLinksTab);
			
			Thread.sleep(5000L);
		}
			// opens all the tabs
			Set<String> abc=driver.getWindowHandles();//4
			Iterator<String> it=abc.iterator();
			
			while(it.hasNext())
			{
				
						driver.switchTo().window(it.next());
						System.out.println(driver.getTitle());
			}
		}
				

}

