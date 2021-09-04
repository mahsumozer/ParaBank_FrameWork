package StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.CommonMethod;

import java.util.Map;

public class CustomerCareStepDefinitions extends CommonMethod {



    @Given("User is on Welcome page")
    public void user_is_welcome_page() {
        login.logininSuccessfuly();
    }

    @Given("User clicks on Contact us button")
    public void user_clicks_on_contact_us_button() {
        click(welPage.contact_us);

    }
    @When("User fills the form and clicks on send button")
    public void user_fills_the_form_and_clicks_on_send_button(Map<String, String> data) {
        sendText(contact.customer_name_field,data.get("Name"));
        sendText(contact.email_field,data.get("Email"));
        sendText(contact.phone_field,data.get("Phone"));
        sendText(contact.message_field,data.get("Message"));

        click(contact.button_sendTo_customerCare);



    }
    @Then("User should see {string} message on page")
    public void user_should_see_message_on_page(String string) {
        String message=driver.findElement(By.xpath("//div[@id='rightPanel']/p[2]")).getText();

        Assert.assertEquals("A Customer Care Representative will be contacting you.",message);


    }

}
