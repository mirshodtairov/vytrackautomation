package com.briteERP.pages;

import com.briteERP.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.briteERP.utilities.Driver;

public class ERPGridPage {

    public WebElement getGrids(String chooseGrid){
        String xPath= "//button[@data-original-title='" +chooseGrid+ "']";
        return Driver.get().findElement(By.xpath(xPath));

    }
}
