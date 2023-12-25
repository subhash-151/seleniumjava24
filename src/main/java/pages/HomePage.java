package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;

public class HomePage extends Base_Library {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='×']")
	private WebElement crossbutton;
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	
	public void clickOnClose() throws Exception {
		crossbutton.click();
		Thread.sleep(3000);
	}
	
	public void clickOnpractice() throws InterruptedException {
		practice.click();
		Thread.sleep(3000);
	}
	public void clickOnElement() throws InterruptedException {
		element.click();
		Thread.sleep(3000);
	}

}
