package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Base_Library;


public class LandingPage extends Base_Library {

	public LandingPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='×']")
	private WebElement crossbutton;

	public void clickOnClose() {
		crossbutton.click();
	}

}
