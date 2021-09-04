package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethod;

import java.util.List;

public class TransferFundsStepDefinitions extends CommonMethod {

    @When("User clicks on Transfer Funds button from home page")
    public void user_clicks_on_transfer_funds_button_from_home_page() {
        click(welPage.transfer_funds);


    }
    @When("User fills all fields")
    public void user_fills_all_fields(DataTable details) {
        List<String> data=details.asList();
        sendText(transferfund.amount_field,data.get(0));
        Select select=new Select(transferfund.fromAccountDropdown);
        select.selectByVisibleText(data.get(1));

        Select select1=new Select(transferfund.fromAccountDropdown);
        select1.selectByVisibleText(data.get(2));

    }
    @When("User clicks Transfer button")
    public void user_clicks_transfer() {
        click(transferfund.transfer_button);

    }
    @Then("User should see transfer message")
    public void user_should_see_transfer_message() {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@ng-if='showResult']/p[1]")).isDisplayed());
    }

    @When("User does not enter anything to amount field")
    public void user_does_not_enter_anything_to_amount_field() {
        sendText(transferfund.amount_field,"");

    }
    @Then("User should see {string} error message on transfer funds page")
    public void user_should_see_error_message_on_transfer_funds_page(String string) {
        String actualMessage=transferfund.error_message.getText();
        Assert.assertEquals(string,actualMessage);

    }
    @When("User chooses account from dropdown")
    public void user_chooses_account_from_dropdown() {
      Assert.assertTrue(transferfund.fromAccountDropdown.isEnabled());
      Assert.assertTrue(transferfund.toAccountDropDown.isEnabled());
    }



}
