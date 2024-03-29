package Assignment1_6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public RegistrationPage enterFirstName(String firstName) {
        WebElement firstNameField = driver.findElement(By.name("firstname"));
        firstNameField.sendKeys(firstName);
        return this;
    }

    public RegistrationPage enterLastName(String lastName) {
        WebElement lastNameField = driver.findElement(By.name("lastname"));
        lastNameField.sendKeys(lastName);
        return this;
    }

    public RegistrationPage enterEmail(String email) {
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys(email);
        return this;
    }

    public RegistrationPage enterTelephone(String telephone) {
        WebElement telephoneField = driver.findElement(By.name("telephone"));
        telephoneField.sendKeys(telephone);
        return this;
    }

    public RegistrationPage enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);
        return this;
    }

    public RegistrationPage confirmPassword(String password) {
        WebElement confirmPasswordField = driver.findElement(By.name("confirm"));
        confirmPasswordField.sendKeys(password);
        return this;
    }

    public RegistrationPage agreeToPrivacyPolicy() {
        WebElement privacyPolicyCheckbox = driver.findElement(By.cssSelector("label[for='input-agree']"));
        privacyPolicyCheckbox.click();
        return this;
    }

    public void submitRegistrationForm() {
        WebElement registerButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Continue' and @class='btn btn-primary']"));
        registerButton.click();
    }


    public boolean isSuccessMessageDisplayed() {
        WebElement successAlert =driver.findElement(By.cssSelector(".alert.alert-success"));
        return successAlert.isDisplayed();
    }
}