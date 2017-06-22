package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "email")
	private WebElement emailTextBox;
	
	@FindBy(id = "passwd")
	private WebElement passwordTextBox;
	
	@FindBy(id = "SubmitLogin")
	private WebElement signInButton;
	
	public MyAccountPage goToAccountPage(String id, String passwd){
		emailTextBox.sendKeys(id);
		passwordTextBox.sendKeys(passwd);
		signInButton.click();
//		Assert.assertTrue(driver.getTitle().contains("account"));
		return new MyAccountPage(driver);
		
	}
	

}
