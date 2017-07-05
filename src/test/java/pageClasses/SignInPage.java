package pageClasses;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;
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
	
	@FindBy(id = "email_create")
	private WebElement emailAddrTextbox;
	
	@FindBy(id = "SubmitCreate")
	private WebElement createAccountButton;
	
	public MyAccountPage goToAccountPage(String id, String passwd){
		emailTextBox.sendKeys(id);
		passwordTextBox.sendKeys(passwd);
		signInButton.click();
		return new MyAccountPage(driver);
		
	}
	
	public SignUpPage goToSignUpPage(String emailaddr){
		emailAddrTextbox.sendKeys(emailaddr);
		createAccountButton.click();
		Assert.assertTrue("User is not re-directed on SignUp page", driver.getTitle().contains("account-creation"));
		return new SignUpPage(driver);
	}
	

}
