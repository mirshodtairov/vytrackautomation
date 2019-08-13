package com.briteERP.tests.components.LogIn;

import com.briteERP.pages.ERPLogInPage;
import org.junit.Test;
import com.briteERP.utilities.ConfigurationReader;
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
