package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.BaseClass;
import testbase.PageInitialize;

public class TransferFundsPageObjects extends BaseClass {

    public TransferFundsPageObjects(){
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "amount")
    public WebElement amount_field;
    @FindBy(id = "fromAccountId")
    public WebElement fromAccountDropdown;

    @FindBy(id ="toAccountId")
    public WebElement toAccountDropDown;

    @FindBy(xpath = "//input[@value='Transfer' and @class='button']")
    public WebElement transfer_button;

    @FindBy(id = "amount.errors")
    public WebElement error_message;



}
