package StepDefinitions;

import io.cucumber.java.en.*;
import org.apache.log4j.LogManager;
import org.junit.Assert;
import utils.CommonMethod;
import utils.ConfigsReader;

import org.apache.log4j.Logger;

public class LoginFeatureStepDefinitions extends CommonMethod {





    @Given("user is on login page")
    public void user_is_on_login_page() {


    }
    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
//        sendText(login.username_field, ConfigsReader.getPropertiesValue("username"));
//        sendText(login.password_field,ConfigsReader.getPropertiesValue("password"));
//        click(login.login_button);
        login.logininSuccessfuly();
        logger.info("Started");

    }
    @Then("user should have access to homepage")
    public void user_should_have_access_to_homepage() {
        Assert.assertTrue(driver.getTitle().equals("ParaBank | Accounts Overview"));
        logger.info("step2");


    }

    @When("user enter forget to enter username")
    public void user_enter_forget_to_enter_username() {

        sendText(login.password_field,ConfigsReader.getPropertiesValue("password"));
        click(login.login_button);


    }
    @Then("user should see {string} error message")
    public void user_should_see_error_message(String expectedmessage) {

        Assert.assertEquals(expectedmessage,login.error_message.getText());

    }

    @When("user forget to enter username and password and click login button")
    public void user_forget_to_enter_username_and_password_and_click_login_button() throws InterruptedException {
        click(login.login_button);
        Thread.sleep(2000);
    }


}
