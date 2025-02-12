package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    WebDriver driver;

    // Locators
    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By date = By.id("dob");
    private By address = By.id("address");
    private By postal = By.id("postcode");
    private By city = By.id("city");
    private By state = By.id("state");
    private By phone = By.id("phone");
    private By email = By.id("email");
    private By password = By.id("password");
    private By registerButton = By.xpath("//button[@type='submit']");
    private By countryDropdown = By.id("country");
    private By successMessage = By.xpath("//div[@class='success-message']");  


    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String fname) {
        driver.findElement(firstName).sendKeys(fname);
    }

    public void enterLastName(String lname) {
        driver.findElement(lastName).sendKeys(lname);
    }

    public void enterDateOfBirth(String dob) {
        driver.findElement(date).sendKeys(dob);
    }

    public void enterAddress(String addr) {
        driver.findElement(address).sendKeys(addr);
    }

    public void enterPostalCode(String postalCode) {
        driver.findElement(postal).sendKeys(postalCode);
    }

    public void enterCity(String cityName) {
        driver.findElement(city).sendKeys(cityName);
    }

    public void enterState(String stateName) {
        driver.findElement(state).sendKeys(stateName);
    }

    // ✅ Fixed selectCountry method
    public void selectCountry(String countryName) {
        Select select = new Select(driver.findElement(countryDropdown));
        select.selectByVisibleText(countryName);
    }

    public void enterPhone(String phoneNumber) {
        driver.findElement(phone).sendKeys(phoneNumber);
    }

    public void enterEmail(String emailAddress) {
        driver.findElement(email).sendKeys(emailAddress);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickRegister() {  
        driver.findElement(registerButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}
