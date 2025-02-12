package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.RegistrationPage;
import java.time.Duration;
public class RegisterStep {
    WebDriver driver;
    RegistrationPage registrationPage;

    @Given("User is on the registration page")
    public void user_is_on_the_registration_page() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://practicesoftwaretesting.com/auth/register");

        registrationPage = new RegistrationPage(driver);
    }

    @When("User enters a valid email, password, and other required details")
    public void user_enters_a_valid_email_password_and_other_required_details() {
        registrationPage.enterFirstName("TestUser");
        registrationPage.enterLastName("1");
        registrationPage.enterDateOfBirth("02/02/2000");
        registrationPage.enterAddress("abcd efg");
        registrationPage.enterPostalCode("123456");
        registrationPage.enterCity("Kochi");
        registrationPage.enterState("Kerala");
        registrationPage.enterEmail("Simplemail@gmail.com");  
        registrationPage.enterPhone("1234567890");
        registrationPage.enterPassword("SimpleUser@ToolsDemo@123");
        registrationPage.selectCountry("India");
      
    }

    @When("User clicks on the register button")
    public void user_clicks_on_the_register_button() {
        registrationPage.clickRegister();
    }

    @Then("the user should be registered successfully and see a confirmation message")
    public void the_user_should_be_registered_successfully_and_see_a_confirmation_message() {
        String actualMessage = registrationPage.getSuccessMessage();
        Assert.assertTrue(actualMessage.contains("Registration successful"), 
                          "Registration failed: Expected success message not found.");
        
        driver.quit();
    }
}
