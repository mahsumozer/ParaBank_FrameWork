package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethod;

import java.util.List;

public class BillPayStepDefinitions extends CommonMethod {

    @Given("User clicks on Bill pay button")
    public void user_clicks_on_bill_pay_button() {
        click(welPage.bill_pay);


    }
    @When("User enter all information")
    public void user_enter_all_information(DataTable details) {
        List<String> data=details.asList();

        sendText(billpay.payee_name_field, data.get(0));
        sendText(billpay.address_field,data.get(1));
        sendText(billpay.payee_city_field,data.get(2));
        sendText(billpay.payee_state, data.get(3));
        sendText(billpay.payee_zipcode,data.get(4));
        sendText(billpay.payee_phone, data.get(5));
        sendText(billpay.payee_accounNumber,data.get(6));
        sendText(billpay.verfiy_account,data.get(7));
        sendText(billpay.ammount,data.get(8));


    }

    @When("User clicks on Send payment button")
    public void user_clicks_on_send_payment_button() {
       click(billpay.send_payment_button);

    }

    @Then("User should see see {string} message")
    public void should_see_see_message(String string) {
        WebElement Web_Message=driver.findElement(By.xpath("//h1[@class='title' and text()='Bill Payment Complete']"));




    }

    @When("User enter all information and choose account")
    public void user_enter_all_information_and_choose_account(DataTable details) {

        List<String> data=details.asList();

        sendText(billpay.payee_name_field, data.get(0));
        sendText(billpay.address_field,data.get(1));
        sendText(billpay.payee_city_field,data.get(2));
        sendText(billpay.payee_state, data.get(3));
        sendText(billpay.payee_zipcode,data.get(4));
        sendText(billpay.payee_phone, data.get(5));
        sendText(billpay.payee_accounNumber,data.get(6));
        sendText(billpay.verfiy_account,data.get(7));
        sendText(billpay.ammount,data.get(8));

        Select select=new Select(billpay.account_dropdown);
        select.selectByValue(data.get(9));

    }

}
