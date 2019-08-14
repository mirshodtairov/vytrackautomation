package com.briteERP.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.briteERP.utilities.BrowserUtils;
import com.briteERP.utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class ERPTablesUnderGrid {
    WebDriver driver = Driver.get();

    public ERPTablesUnderGrid() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement totalOfThePivotTable;

    public double getTotalFromPivotTable(){
        String str = driver.findElement(By.xpath("//tr[1]/td[2]")).getText().replace(",", "");
        double result = Double.valueOf(str);
        return result;
    }
    public String getPriceInPivot(String businessName){
        String price = driver.findElement(By.xpath("//table[contains" +
        "(@class,'table-condensed')]/tbody//td[contains(text(),'"+businessName+"')]/../td[2]")).getText();
         return price;
    }
    public String getPriceInList(String businessName){
        String price = driver.findElement(By.xpath("//table[contains" +
                "(@class,'table-condensed')]/tbody//td[contains(text(),'"+businessName+"')]/../td[9]")).getText();
        return price;
    }

    public double sumOfAmountInTable() {

        BrowserUtils.waitFor(2);
        List<WebElement> list2 = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        List<String> str = new ArrayList<String>();
        BrowserUtils.waitFor(2);
        for (int i = 1; i<list2.size(); i++) {
            str.add(list2.get(i).getText().replace(",",""));
        }

        double result=0;
        for(String st:str){
            double a =  Double.valueOf(st);
                  result+=a;
        }

        return result;
    }

    public WebElement getFunctionFromTable(String chooseFunction) {
        String xpath = "//a[@href='#' and contains(text(), '" + chooseFunction + "')]";
        return Driver.get().findElement(By.xpath(xpath));
    }

  }