package BriteERP.com.tests.components.LogIn;

import BriteERP.com.pages.ERPGridPage;
import BriteERP.com.pages.ERPLogInPage;
import BriteERP.com.pages.ERPTablesUnderGrid;
import BriteERP.com.pages.ERPTabsPage;
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



    @Test
    public void  priceComparison() throws InterruptedException {

        String userName = ConfigurationReader.get("ERPusername");
        String password = ConfigurationReader.get("ERPpassword");
        LogInPage.LogIn(userName, password );
        tabsPage.getTab("CRM").click();
        erpGrigPage.getGrids("Pivot").click();
        WebElement total = driver.findElement(By.xpath("//tbody/tr[2]/td[1]"));
        total.click();
        TableUnderCertGrid.getFunctionFromTable("Opportunity").click();
        BrowserUtils.waitFor(3);
        TableUnderCertGrid.sumOfAmountInTable();
               // WebElement el1 =TableUnderCertGrid.getRawsFromTable().get(3);
        erpGrigPage.getGrids("List").click();
        BrowserUtils.waitFor(6);

        //WebElement el2 = TableUnderCertGrid.getRawsFromTable().get(0);

        //Assert.assertEquals(el2.getText(), "Iphone Sale 500.00 1");








    }
    @Test
    public void sumUnderPivotTable(){
        String userName = ConfigurationReader.get("ERPusername");
        String password = ConfigurationReader.get("ERPpassword");
        LogInPage.LogIn(userName, password );
        tabsPage.getTab("CRM").click();
        erpGrigPage.getGrids("Pivot").click();
        WebElement total = driver.findElement(By.xpath("//tbody/tr[2]/td[1]"));
        total.click();
        TableUnderCertGrid.getFunctionFromTable("Opportunity").click();
        BrowserUtils.waitFor(3);
        BrowserUtils.waitFor(3);
        TableUnderCertGrid.sumOfAmountInTable();
    }
}
