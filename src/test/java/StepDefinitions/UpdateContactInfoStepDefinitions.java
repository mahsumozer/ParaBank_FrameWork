package StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.CommonMethod;
import utils.ConfigsReader;

import java.util.Map;

public class UpdateContactInfoStepDefinitions extends CommonMethod {

    @Given("User is already on Welcome page")
    public void user_is_already_logged_in() {
        sendText(login.username_field, ConfigsReader.getPropertiesValue("username"));
        sendText(login.password_field,ConfigsReader.getPropertiesValue("password"));
        click(login.login_button);

    }
    @Given("User clicks on Update Contact info button")
    public void user_clicks_on_update_contact_info_button() {
        click(welPage.update_contact_info);




    }
    @When("User fills all fields and clicks on Update profile button")
    public void user_fills_all_fields_and_clicks_on_update_profile_button(Map<String, String> data) {
        sendText(updateInfo.firstname_field,data.get("Firstname"));
        sendText(updateInfo.lastname_field,data.get("Lastname"));
        sendText(updateInfo.address_field,data.get("Address"));
        sendText(updateInfo.city_field,data.get("City"));
        sendText(updateInfo.state_field,data.get("State"));
        sendText(updateInfo.zipcode_field,data.get("Zipcode"));
        sendText(updateInfo.phonenumber_field,data.get("Phone"));

        click(updateInfo.update_profile_button);


    }
    @Then("User sould see {string} message")
    public void user_sould_see_message(String string) {
        String updatedMessage=driver.findElement(By.xpath("//h1[contains(text(),'Profile Updated')]")).getText();

        Assert.assertEquals("Profile Updated",updatedMessage);



    }


}
