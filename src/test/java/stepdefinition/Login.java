package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Login {

    @Given("^that I navigate to dev\\.giftrete\\.com$")
    public void that_I_navigate_to_dev_giftrete_com() {

        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver\\geckodriver.exe");


        WebDriver driver = new FirefoxDriver();
        String appUrl = "http://www.giftrete.com";
        driver.get(appUrl);
    }

    @When("^I click on login$")
    public void i_click_on_login()  {

    }

    @When("^I entered the username$")
    public void i_entered_the_username()  {

    }

    @When("^I entered the password$")
    public void i_entered_the_password()  {

    }

    @When("^I click on the login button$")
    public void i_click_on_the_login_button()  {

    }

    @Then("^I should be logged in$")
    public void i_should_be_logged_in()  {

    }

    @When("^I entered the invalid username$")
    public void i_entered_the_invalid_username()  {

    }

    @Then("^I should not be logged in$")
    public void i_should_not_be_logged_in()  {

    }

    @When("^I entered the invalid password$")
    public void i_entered_the_invalid_password()  {

    }

    @When("^I entered the username \"([^\"]*)\"$")
    public void i_entered_the_username(String username)  {

    }

    @When("^I entered the password \"([^\"]*)\"$")
    public void i_entered_the_password(String password)  {

    }

    @Then("^I log out$")
    public void i_log_out()  {

    }
}
