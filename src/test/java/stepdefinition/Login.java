package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

    @Given("^that I navigate to dev\\.giftrete\\.com$")
    public void that_I_navigate_to_dev_giftrete_com() {
        WebDriver driver = new FirefoxDriver();

        String appUrl = "http://www.giftrete.com";
        driver.get(appUrl);
    }

    @When("^I click on login$")
    public void i_click_on_login()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I entered the username$")
    public void i_entered_the_username()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I entered the password$")
    public void i_entered_the_password()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I click on the login button$")
    public void i_click_on_the_login_button()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should be logged in$")
    public void i_should_be_logged_in()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I entered the invalid username$")
    public void i_entered_the_invalid_username()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should not be logged in$")
    public void i_should_not_be_logged_in()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I entered the invalid password$")
    public void i_entered_the_invalid_password()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I entered the username \"([^\"]*)\"$")
    public void i_entered_the_username(String username)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I entered the password \"([^\"]*)\"$")
    public void i_entered_the_password(String password)  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I log out$")
    public void i_log_out()  {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
