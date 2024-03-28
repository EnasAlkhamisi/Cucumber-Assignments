package Assignment2_6;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2StepDefinitions {

    WebDriver driver;
    @Given("user goes to the {string}")
    public void userGoesToUrl(String url) {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Then("user waits for {int} seconds")
    public void userWaits(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    @And("verifies that the page title contains the word {string}")
    public void verifyPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assertions.assertTrue(actualTitle.contains(expectedTitle),
                "Expected title: " + expectedTitle +
                        ", Actual title: " + actualTitle);
    }

    @And("closes the page")
    public void closePage() {
        driver.quit();
    }


}