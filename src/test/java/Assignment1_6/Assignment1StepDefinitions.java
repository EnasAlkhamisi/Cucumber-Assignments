package Assignment1_6;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1StepDefinitions {

         WebDriver driver;

        @Given("I am on the registration page")
        public void iAmOnRegistrationPage() {
            driver = new ChromeDriver();
            driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        }

        @When("I enter valid registration details")
        public void enterValidRegistrationDetails() {
            RegistrationPage registrationPage = new RegistrationPage(driver);
            registrationPage.enterFirstName("Enas")
                    .enterLastName("Alkhamisi")
                    .enterEmail("Enas@Alkhamisi.com")
                    .enterTelephone("1234567890")
                    .enterPassword("password")
                    .confirmPassword("password")
                    .agreeToPrivacyPolicy();
        }

        @When("I submit the registration form")
        public void submitRegistrationForm() {
            RegistrationPage registrationPage = new RegistrationPage(driver);
            registrationPage.submitRegistrationForm();
        }

        @Then("I should see a successful registration message")
        public void verifySuccessfulRegistrationMessage() {
            RegistrationPage registrationPage = new RegistrationPage(driver);
            assert registrationPage.isSuccessMessageDisplayed();
        }

        @After
        public void closeBrowser() {
            driver.quit();
        }
    }
