package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.BaseClass;
import utils.CommonMethod;
import utils.ConfigsReader;

public class LoginPageWebElements extends CommonMethod {

    public LoginPageWebElements(){
        PageFactory.initElements(driver,this);
    }

    public  static void logininSuccessfuly(){
        sendText(login.username_field, ConfigsReader.getPropertiesValue("username"));
        sendText(login.password_field,ConfigsReader.getPropertiesValue("password"));
        click(login.login_button);

    }

    @FindBy(name = "username")
    public WebElement username_field;

    @FindBy(name = "password")
    public WebElement password_field;


    @FindBy(xpath = "//input[@class='button' and @value='Log In']")
    public WebElement login_button;

    @FindBy(xpath = "//div[@id='rightPanel']/p")
    public WebElement error_message;

    @FindBy(linkText = "Forgot login info?")
    public WebElement forget_password_button;

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement register_button;









}
