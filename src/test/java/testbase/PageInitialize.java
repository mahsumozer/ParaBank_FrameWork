package testbase;


import pages.*;

public class PageInitialize extends BaseClass {

    public static LoginPageWebElements login;
    public static RegisterPageWebElements regis;
    public static WelcomePageObjects welPage;
    public static UpdateInfoPageObjects updateInfo;
    public static ContactUs_PageObjects contact;
    public static  BillPayPageObjects billpay;
    public static TransferFundsPageObjects transferfund;




    public static void initializePageObjects(){
        login=new LoginPageWebElements();
        regis=new RegisterPageWebElements();
        welPage=new WelcomePageObjects();
        updateInfo=new UpdateInfoPageObjects();
        contact=new ContactUs_PageObjects();
        billpay=new BillPayPageObjects();
        transferfund=new TransferFundsPageObjects();




    }
}
