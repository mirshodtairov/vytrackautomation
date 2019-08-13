package com.briteERP.step_definition;

import com.briteERP.pages.*;
import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.ConfigurationReader;
import cucumber.api.java.en.*;
import org.junit.Assert;


public class CrmAssertionDef  {
    ERPLogInPage LogInPage = new ERPLogInPage();
    ERPTabsPage tabsPage= new ERPTabsPage();
    ERPGridPage erpGrigPage = new ERPGridPage();
    ERPTablesUnderGrid TableUnderCertGrid = new ERPTablesUnderGrid();
    CRMPage crmPage = new CRMPage();
    String el1;
    String el2;
    Double total;
    Double sumOfOppotunities;


    @Given("i am in log in page")
    public void i_am_in_log_in_page() {
        LogInPage.LogIn(ConfigurationReader.get("ERPusername"),ConfigurationReader.get("ERPpassword"));

    }

    @When("i proceed to {string}")
    public void i_proceed_to(String TabName) {
        TabName="CRM";
        tabsPage.getTab(TabName).click();
        BrowserUtils.waitFor(4);
    }

    @When("i proceed to {string} in the grid")
    public void i_proceed_to_in_the_grid(String GridOption) {
        BrowserUtils.waitFor(4);
        GridOption="Pivot";
        erpGrigPage.getGrids(GridOption).click();
    }

    @When("i expand {string}")
    public void i_expand(String total) {
        crmPage.total.click();
        crmPage.total.click();
    }

    @Then("i click {string} button")
    public void i_click_button(String ChooseFromList) {
        ChooseFromList="Opportunity";
        TableUnderCertGrid.getFunctionFromTable(ChooseFromList).click();
    }

    @Then("i choose one of the opportunities")
    public void i_choose_one_of_the_opportunities() {
        el1= TableUnderCertGrid.getPriceInPivot("Book Sale");
    }

    @Then("i proceed t {string} in the grid")
    public void i_proceed_t_in_the_grid(String GridOption) {
        GridOption="List";
        erpGrigPage.getGrids(GridOption).click();
    }

    @Then("i choose the same opportunity")
    public void i_choose_the_same_opportunity() {
        el2 =  TableUnderCertGrid.getPriceInList("Book Sale");
    }

    @Then("i verify that booth opportunities matches")
    public void i_verify_that_booth_opportunities_matches() {
        Assert.assertEquals(el1,el2);
    }

    @Then("i verify that total matches the sum of the table")
    public void i_verify_that_total_matches_the_sum_of_the_table() {
        total = TableUnderCertGrid.sumOfAmountInTable();
        sumOfOppotunities= TableUnderCertGrid.getTotalFromPivotTable();
        Assert.assertEquals(total, sumOfOppotunities);
    }
}
