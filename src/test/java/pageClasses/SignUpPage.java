package pageClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {

	public SignUpPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "id_gender2")
	private WebElement titleRadioButton;
	
	@FindBy(id = "customer_firstname")
	private WebElement firstNameTextbox;
	
	@FindBy(id = "customer_lastname")
	private WebElement lastNameTextbox;
	
	@FindBy(id = "passwd")
	private WebElement passwordTextbox;
	
	@FindBy(id = "address1")
	private WebElement addressTextbox;
	
	@FindBy(id = "city")
	private WebElement cityTextbox;
	
	@FindBy(id = "id_state")
	private WebElement stateTextbox;
	
	@FindBy(id = "postcode")
	private WebElement postcodeTextbox;
	
	@FindBy(id = "phone_mobile")
	private WebElement mobileTextbox;
	
	@FindBy(id = "submitAccount")
	private WebElement registerButton;
	
	public MyAccountPage registration(String firstname, String lastname, String password, String address, String city, String state, String postcode, String mobile) throws InterruptedException{
		firstNameTextbox.sendKeys(firstname);
		TimeUnit.SECONDS.sleep(3);
		lastNameTextbox.sendKeys(lastname);
		TimeUnit.SECONDS.sleep(3);
		passwordTextbox.sendKeys(password);
		TimeUnit.SECONDS.sleep(3);
		addressTextbox.sendKeys(address);
		TimeUnit.SECONDS.sleep(3);
		cityTextbox.sendKeys(city);
		TimeUnit.SECONDS.sleep(3);
		stateTextbox.sendKeys(state);
		TimeUnit.SECONDS.sleep(3);
		postcodeTextbox.sendKeys(postcode);
		TimeUnit.SECONDS.sleep(3);
		mobileTextbox.sendKeys(mobile);
		TimeUnit.SECONDS.sleep(3);
		registerButton.click();
		return new MyAccountPage(driver);
	
	}
	
}
