package BriteERP.com.tests.components.LogIn;

import BriteERP.com.pages.CRMPage;
import BriteERP.com.pages.ERPLogInPage;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import xpath.TestBase;

public class LogInTests extends TestBase {
    ERPLogInPage erpLogInPage = new ERPLogInPage();
    @Test
    public void logIn(){
        String userName = ConfigurationReader.get("ERPusername");
        String password = ConfigurationReader.get("ERPpassword");
        erpLogInPage.LogIn(userName, password );



    }


}
