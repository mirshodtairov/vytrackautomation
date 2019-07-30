package BriteERP.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class ERPTablesUnderGrid {


    public WebElement getFunctionFromTable(String chooseFunction){
        String xpath = "//a[@href='#' and contains(text(), '"+chooseFunction+"')]";
        return Driver.get().findElement(By.xpath(xpath));
    }

    public List<WebElement> getRawsFromTable(){
        List<WebElement> listOfOpportunities = Driver.get().findElements(By.xpath("//tbody/tr"));
        return listOfOpportunities;
    }
}
