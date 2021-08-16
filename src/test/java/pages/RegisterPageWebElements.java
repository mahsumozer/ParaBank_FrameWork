package pages;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.BaseClass;

public class RegisterPageWebElements extends BaseClass {

    public RegisterPageWebElements(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(id = "customer.firstName")
    public WebElement firstname_field;

    @FindBy(id = "customer.lastName")
    public WebElement lastname_field;

    @FindBy(id = "customer.address.street")
    public WebElement address_field;

    @FindBy(id = "customer.address.city")
    public WebElement city_field;

    @FindBy(id = "customer.address.state")
    public WebElement state_field;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipcode_field;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phone_number_field;

    @FindBy(id = "customer.ssn")
    public WebElement ssn_field;

    @FindBy(id = "customer.username")
    public WebElement create_username_field;

    @FindBy(id = "customer.password")
    public WebElement create_password_field;

    @FindBy(id = "repeatedPassword")
    public WebElement confirm_password_fieldd;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement button_register;














}
