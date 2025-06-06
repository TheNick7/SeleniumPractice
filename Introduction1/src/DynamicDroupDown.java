import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDroupDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:/Users/Admin/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		

		// Handling check boxes. Using cssSlector that regular expression for css.
		System.out.println(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).click();
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		//Count the number of checkboxes 
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("divpaxinfo")).click();
		
		
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@value='BLR']")).getText());
		Thread.sleep(2000);
		//Parent to child realationship for Xpath //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		System.out.println(driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).getText());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		for(int i =1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select Dropdown = new Select(staticdropdown);
		Dropdown.selectByIndex(3);
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		Dropdown.deselectByVisibleText("AED");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		Dropdown.deselectByValue("INR");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		
		// Handling check boxes. Using cssSlector that regular expression for css.
		System.out.println(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).click();
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	
	}

}
