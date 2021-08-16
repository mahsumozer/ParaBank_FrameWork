package StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethod;

import java.util.Map;

public class RegisterFeatureStepDefinitions extends CommonMethod {

    @Given("clicks on register button")
    public void clicks_on_register_button() {
        click(login.register_button);

    }
    @When("user enters all information and click on register button")
    public void user_enters_all_information_and_click_on_register_button(Map<String, String> data)  {

        sendText(regis.firstname_field,data.get("Firstname"));
        sendText(regis.lastname_field,data.get("Lastname"));
        sendText(regis.address_field,data.get("Address"));
        sendText(regis.city_field,data.get("City"));
        sendText(regis.state_field,data.get("State"));
        sendText(regis.zipcode_field,data.get("Zipcode"));
        sendText(regis.phone_number_field,data.get("Phone"));
        sendText(regis.ssn_field,data.get("Ssn"));
        sendText(regis.create_username_field,data.get("Username"));
        sendText(regis.create_password_field,data.get("Password"));
        sendText(regis.confirm_password_fieldd,data.get("Confirm"));

        click(regis.button_register);

    }
    @Then("User should see welcome page")
    public void user_should_see_welcome_page() {
        WebElement welcomesign= driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
        String str=welcomesign.getText();

        Assert.assertTrue(str.startsWith("Welcome"));

    }


    /**
     * Sceanrio 2
     */
    @Then("User should see {string} message")
    public void user_should_see_message(String string) {
        WebElement usernameErrormessage=driver.findElement(By.id("customer.username.errors"));
        Assert.assertTrue(usernameErrormessage.isDisplayed());
    }

    @Then("User should see {string} message on next to password")
    public void user_should_see_message_on_next_to_password(String string) {
        String error_message_pass=driver.findElement(By.id("repeatedPassword.errors")).getText();

        Assert.assertEquals("Passwords did not match.",error_message_pass);

    }






}
