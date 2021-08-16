package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.BaseClass;
import utils.CommonMethod;

public class ContactUs_PageObjects extends BaseClass {
    /**
     * Constructor
     */
    public ContactUs_PageObjects(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "name")
    public WebElement customer_name_field;

    @FindBy(name = "email")
    public WebElement email_field;

    @FindBy(name = "phone")
    public WebElement phone_field;

    @FindBy(name = "message")
    public WebElement message_field;

    @FindBy(xpath = "//input[@value='Send to Customer Care']")
    public WebElement button_sendTo_customerCare;





}
