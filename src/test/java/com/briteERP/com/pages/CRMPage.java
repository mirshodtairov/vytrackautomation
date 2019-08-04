package com.briteERP.com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class CRMPage {
    WebDriver driver = Driver.get();
    @FindBy(xpath = "(//*[@class='oe_menu_toggler'])[2]")
    public WebElement CRMBtn;

    @FindBy(xpath = "//tbody/tr/td[1]")
    public  WebElement total;


    public CRMPage()
    {
        PageFactory.initElements(driver, this );
    }



}
