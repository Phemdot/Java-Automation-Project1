package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationSteps {

    @Given("^I navigate to giftrete site$")
    public void i_navigate_to_giftrete_site() throws Throwable {

        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        String appUrl = "http://www.giftrete.com";
        driver.get(appUrl);

        driver.navigate().forward();
    }

    @When("^I go to the registration page$")
    public void i_go_to_the_registration_page() throws Throwable {


    }

    @When("^I fill in all the registration data$")
    public void i_fill_in_all_the_registration_data() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I should be able to register$")
    public void i_should_be_able_to_register() throws Throwable {
    }




}
