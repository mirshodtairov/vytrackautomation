package com.briteERP.com.tests.components.LogIn;

import com.briteERP.com.pages.ERPLogInPage;
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
