package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageClasses.*;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableTest {
	
	public WebDriver driver;
	BasePage basePage;
	LandingPage landingPage;
	SignInPage signInPage;
	SignUpPage signUpPage;
	
	@Before("@SignUp")
	public void beforeSetup(){
		basePage = PageFactory.initElements(driver, BasePage.class);
		driver = basePage.testSetup();
	}

	@After("@SignUp")
	public void afterSetup(){
		System.out.println("Bye Signup test");
		driver.quit();
	}
	
	@Given("^User enter \"([^\"]*)\" and land on Signup page$")
	public void user_enter_and_land_on_Signup_page(String emailaddr) throws Throwable {
		landingPage = PageFactory.initElements(driver, LandingPage.class);
		signInPage = landingPage.goToSignInPage();
		signUpPage = signInPage.goToSignUpPage(emailaddr);
		if(driver.getTitle().contains("account-creation")){
			System.out.println("I am on SignUp Page");
		}
	
		
	}

	@When("^User enter all fields and click on Register$")
	public void user_enter_all_fields_and_click_on_Register(DataTable table) throws Throwable {
	
		List<List<String>> data = table.raw();
		String firstname = data.get(1).get(1);
		String lastname = data.get(2).get(1);
		String password = data.get(3).get(1);
		String address = data.get(4).get(1);
		String city = data.get(5).get(1);
		String state = data.get(6).get(1);
		String postcode = data.get(7).get(1);
		String mobile = data.get(8).get(1);
		signUpPage.registration(firstname, lastname, password , address, city, state, postcode, mobile);
	}

	@Then("^User shouls see My Account page$")
	public void user_shouls_see_My_Account_page() throws Throwable {

	}


}
