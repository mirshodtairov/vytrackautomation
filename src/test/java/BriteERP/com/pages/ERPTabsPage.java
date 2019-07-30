package BriteERP.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

public class ERPTabsPage {



    public WebElement getTab(String tabName) {
        String tabXpath = "//span[@class='oe_menu_text' and contains(text(), '" + tabName + "')]";
        return Driver.get().findElement(By.xpath(tabXpath));
    }

}
