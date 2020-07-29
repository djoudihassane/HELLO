package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DropDrag {

	
	
	WebDriver driver;
	@Test
	public void draganddrop() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	//	DesiredCapabilities capability =  DesiredCapabilities.chrome();
		//capability.setCapability("marionet",true);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		WebElement Drag =  driver.findElement(By.id("sourceImage"));
		WebElement Drop =  driver.findElement(By.id("targetDiv"));
		Actions act = new Actions(driver);
		act.dragAndDrop(Drag, Drop).doubleClick().build().perform();
		driver.findElement(By.xpath("/html/body/div/div[11]/div/p/button")).click();
		driver.switchTo().alert().accept();
		
	}
}
