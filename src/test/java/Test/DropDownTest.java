package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.DropDown;
import Util.OpenBrowser;



public class DropDownTest {

WebDriver driver;


@BeforeMethod
public  void browseropen() {
     driver = OpenBrowser.openbrowser();
	}
	@Test
	public void droptest() throws Exception {
		driver.manage().window().maximize();
		
		
		DropDown drop = PageFactory.initElements(driver, DropDown.class );
		drop.Scroll();
		drop.Chouse();
		drop.draganddrop();
		
		
	
		
		
	}
	
	
	public void draganddrop() {
		WebElement Drag =  driver.findElement(By.id("sourceImage"));
		WebElement Drop =  driver.findElement(By.id("targetDiv"));
		DesiredCapabilities capability =  DesiredCapabilities.chrome();
		capability.setCapability("marionet",true);
		WebDriver driver = new ChromeDriver(capability);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(Drag, Drop).build().perform();
		
	}
	/*@AfterMethod
	public void close() {
		
		driver.close();
		driver.quit();
	}*/
	
}
