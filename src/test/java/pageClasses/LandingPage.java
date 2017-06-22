package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

	public LandingPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className = "login")
	private WebElement loginButton;
	
	public SignInPage goToSignInPage(){
		 loginButton.click();
		return new SignInPage(driver);
		
	}
	
}


