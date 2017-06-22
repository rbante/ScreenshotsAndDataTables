package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pageClasses.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableTest {
	
	public WebDriver driver;
	LandingPage landingPage;
	SignInPage signInPage;
	MyAccountPage myAccountPage;
	
	@Before
	public void beforeSetup(){
		System.setProperty("webdriver.gecko.driver", "C:\\Roshu_selenium\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com");
	}

	@After
	public void afterSetup(){
		System.out.println("Byeee!!!");
		driver.quit();
	}
	
	@Given("^User on signin page$")
	public void user_on_signin_page() throws Throwable {
	    landingPage = PageFactory.initElements(driver, LandingPage.class);
	    signInPage = landingPage.goToSignInPage();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and click Signin button$")
	public void user_enters_and_and_click_Signin_button(String EmailId, String Password) throws Throwable {
		myAccountPage = signInPage.goToAccountPage(EmailId, Password);
	}

	@Then("^User redirects to account page$")
	public void user_redirects_to_account_page() throws Throwable {
		System.out.println("Account Page");
	}
	
	@And("^User logout$")
	public void user_logout() throws Throwable {
		myAccountPage.goToAuthenticationPage();
	}

}

