	import org.openqa.selenium.By;
	
	import org.openqa.selenium.WebDriver;
	
	import org.openqa.selenium.WebElement;
	
	import org.openqa.selenium.chrome.ChromeDriver;
	
	import org.openqa.selenium.interactions.Actions;
	
	public class frameTest {
	
	 public static void main(String[] args) {

 


		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable");
		// How to find how many frames into our website.
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		
		
		
		Actions a =new Actions(driver);

		//driver.findElement(By.id("draggable")).click();
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		//for get back to actual site
		driver.switchTo().defaultContent();
	 }
	 }