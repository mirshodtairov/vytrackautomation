package com.briteERP.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.briteERP.utilities.Driver;

public class TabsPage {






    public WebElement getTab(String tabName) {
        String tabXpath = "//span[@class='oe_menu_text' and contains(text(), '" + tabName + "')]";
        return Driver.get().findElement(By.xpath(tabXpath));
    }

}
