package com.briteERP.com.tests.components.LogIn;

import com.briteERP.com.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import xpath.TestBase;

public class CRMpriceAssertion extends TestBase {

    ERPLogInPage LogInPage = new ERPLogInPage();
    ERPTabsPage tabsPage= new ERPTabsPage();
    ERPGridPage erpGrigPage = new ERPGridPage();
    ERPTablesUnderGrid TableUnderCertGrid = new ERPTablesUnderGrid();
    CRMPage crmPage = new CRMPage();



    @Test
    public void  priceComparison() throws InterruptedException {

        String userName = ConfigurationReader.get("ERPusername");
        String password = ConfigurationReader.get("ERPpassword");
        LogInPage.LogIn(userName, password );
        tabsPage.getTab("CRM").click();
        erpGrigPage.getGrids("Pivot").click();
        crmPage.total.click();
        crmPage.total.click();
        TableUnderCertGrid.getFunctionFromTable("Opportunity").click();
        String el1= TableUnderCertGrid.getPriceInPivot("Book Sale");
        BrowserUtils.waitFor(3);
        erpGrigPage.getGrids("List").click();
        BrowserUtils.waitFor(6);
        String el2 =  TableUnderCertGrid.getPriceInList("Book Sale");
        Assert.assertEquals(el1,el2);

    }
    @Test
    public void sumUnderPivotTable(){
        String userName = ConfigurationReader.get("ERPusername");
        String password = ConfigurationReader.get("ERPpassword");
        LogInPage.LogIn(userName, password );
        tabsPage.getTab("CRM").click();
        erpGrigPage.getGrids("Pivot").click();
        crmPage.total.click();
        crmPage.total.click();
        TableUnderCertGrid.getFunctionFromTable("Opportunity").click();
        BrowserUtils.waitFor(3);
        BrowserUtils.waitFor(3);
        double expected = TableUnderCertGrid.sumOfAmountInTable();
        double actual = TableUnderCertGrid.getTotalFromPivotTable();
        Assert.assertEquals(actual,expected);

    }
}
