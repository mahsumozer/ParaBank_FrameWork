package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.BaseClass;

public class UpdateInfoPageObjects extends BaseClass {

    public UpdateInfoPageObjects(){
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
    public WebElement phonenumber_field;

    @FindBy(xpath = "//input[@value='Update Profile']")
    public WebElement update_profile_button;







}
