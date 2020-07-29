package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	WebDriver driver;

	public DropDown(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.ID, using = "testingDropdown")
	WebElement DropDown;
	@FindBy(how = How.LINK_TEXT, using = ("Manual Testing"))
	WebElement Manual;
	@FindBy(how = How.ID, using = "male")
	WebElement RadioButton;
	@FindBy(how = How.CSS, using = "body > div > div:nth-child(14) > div > form > input.Automation")
	WebElement Check;
	@FindBy(how = How.ID, using = "sourceImage")
	WebElement Drag;
	@FindBy(how = How.ID, using = "targetDiv")
	WebElement Drop;
	@FindBy(how = How.XPATH, using = "/html/body/div/div[11]/div/p/button")
	WebElement Alert;

	public void Chouse() throws Exception {
		// Drop Down
		Select select = new Select(driver.findElement(By.id("testingDropdown")));
		Thread.sleep(3000);
		select.selectByVisibleText("Manual Testing");

		// Radio Button
		RadioButton.click();
		// Check box
		Check.click();

	}

	
	//drag and drop and alert handle
	public void draganddrop() {

		Actions act = new Actions(driver);
		act.dragAndDrop(Drag, Drop).build().perform();
		Alert.click();
		driver.switchTo().alert().accept();

	}
 //scroll
	public void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,2000)");
	}
}
