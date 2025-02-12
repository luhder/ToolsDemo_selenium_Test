package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepdefinitions {
	 WebDriver driver;
	    LoginPage loginPage;

	    @Given("user is on the login page")
	    public void user_is_on_the_login_page() {
	        driver = new ChromeDriver();
	        driver.get("https://practicesoftwaretesting.com/auth/login");
	        loginPage = new LoginPage(driver);
	    }

	    @When("user enters email {string} and password {string}")
	    public void user_email_username_and_password(String email, String password) {
	        loginPage.enterUsername(email);
	        loginPage.enterPassword(password);
	    }

	    @And("clicks on the login button")
	    public void clicks_on_the_login_button() {
	        loginPage.clickLogin();
	    }

	    @Then("user is navigated to the homepage")
	    public void user_is_navigated_to_the_homepage() {
	        String expectedUrl = "https://practicesoftwaretesting.com/home";
	        assert driver.getCurrentUrl().equals(expectedUrl) : "URL mismatch!";
	        driver.quit();
	    }
	

}
