package BriteERP.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class ERPGridPage {


    public WebElement getGrids(String chooseGrid){
        String xPath= "//button[@data-original-title='" +chooseGrid+ "']";
        return Driver.get().findElement(By.xpath(xPath));

    }
}
