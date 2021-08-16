package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.BaseClass;

public class WelcomePageObjects extends BaseClass {


    public WelcomePageObjects(){
        PageFactory.initElements(driver,this);
    }


    @FindBy(partialLinkText = "Update Contact Info")
    public WebElement update_contact_info;

    @FindBy(partialLinkText = "Open New Account")
    public WebElement open_new_Account;

    @FindBy(partialLinkText = "Accounts Overview")
    public WebElement account_overview;

    @FindBy(partialLinkText = "Transfer Funds")
    public WebElement transfer_funds;

    @FindBy(partialLinkText = "Bill Pay")
    public WebElement bill_pay;

    @FindBy(partialLinkText = "Find Transactions")
    public WebElement find_transactions;

    @FindBy (partialLinkText = "Request Loan")
    public WebElement request_loan;

    @FindBy(partialLinkText = "Log Out")
    public WebElement log_out;

    @FindBy(xpath = "//a[text()='home']")
    public WebElement home_sign;

    @FindBy(xpath ="//a[text()='contact']")
    public WebElement contact_us;
















}
