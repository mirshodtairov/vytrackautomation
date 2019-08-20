package com.briteERP.step_definition;

import com.briteERP.pages.LogInPage;
import com.briteERP.pages.TabsPage;
import com.briteERP.utilities.BrowserUtils;
import cucumber.api.java.en.*;

import java.util.List;

public class tabsDefs {
TabsPage tabsPage = new TabsPage();
LogInPage logInPage = new LogInPage();



    @Given("i login as a {string} with {string}")
    public void i_login_as_a_with(String user, String password) {
       logInPage.LogIn(user,password);
    }

    @Then("I proceed to all tabs one by one")
    public void i_proceed_to_all_tabs_one_by_one(List<String> tabsOption) {
        for (int i = 0; i < tabsOption.size(); i++) {
            System.out.println(tabsOption.get(i));
            tabsPage.getTab(tabsOption.get(i)).click();
            BrowserUtils.waitFor(4);


        }
    }


}
