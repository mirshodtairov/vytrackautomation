package com.briteERP.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.briteERP.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class LogInPage {

    WebDriver driver = Driver.get();
     @FindBy(css="#login")
    public WebElement userNameElement;
     @FindBy(css="#password")
    public WebElement passwordElement;
     @FindBy(xpath = "//*[@type='submit']")
    public WebElement logInBtn;


    public LogInPage(){
        PageFactory.initElements(driver, this);
    }

    public void LogIn(String username, String password){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        logInBtn.click();

    }

}
