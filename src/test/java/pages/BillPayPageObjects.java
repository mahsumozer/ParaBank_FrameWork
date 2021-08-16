package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.BaseClass;

public class BillPayPageObjects extends BaseClass {

    public BillPayPageObjects(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "payee.name")
    public WebElement payee_name_field;

    @FindBy(name = "payee.address.street")
    public WebElement address_field;

    @FindBy(name = "payee.address.city")
    public WebElement payee_city_field;

    @FindBy(name = "payee.address.state")
    public WebElement payee_state;

    @FindBy(xpath = "//input[contains(@name,'zipCode')]")
    public WebElement payee_zipcode;

    @FindBy(name = "payee.phoneNumber")
    public WebElement payee_phone;

    @FindBy(name = "payee.accountNumber")
    public WebElement payee_accounNumber;

    @FindBy(name = "verifyAccount")
    public WebElement verfiy_account;

    @FindBy(name = "amount")
    public WebElement ammount;

    @FindBy (name = "fromAccountId")
    public WebElement account_dropdown;

    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement send_payment_button;



















}
