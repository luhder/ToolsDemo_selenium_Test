package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	 WebDriver driver;

	    // Locators
	    private By emailField = By.id("email");
	    private By passwordField = By.id("password");
	    private By loginButton = By.xpath("//input[@value='Login']");

	    // Constructor
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void enterUsername(String username) {
	        driver.findElement(emailField).sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLogin() {
	        driver.findElement(loginButton).click();
	    }

}
