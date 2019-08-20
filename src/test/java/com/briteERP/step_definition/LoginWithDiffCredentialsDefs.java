package com.briteERP.step_definition;

import com.briteERP.pages.LogInPage;
import com.briteERP.pages.TabsPage;
import com.briteERP.utilities.Driver;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginWithDiffCredentialsDefs {

    LogInPage erpLogInPage =  new LogInPage();
    TabsPage tabsPage = new TabsPage();




    @Given("I login as a {string} with {string}")
    public void i_login_as_a_with(String userType, String userPassword) {
        erpLogInPage.LogIn(userType, userPassword);

    }



    @Then("Title page must be {string}")
    public void title_page_must_be(String expectedTitle) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
        Assert.assertTrue(wait.until(ExpectedConditions.titleIs(expectedTitle)));

    }





}
