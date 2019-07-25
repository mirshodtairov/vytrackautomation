package com.vytrack.tests.components.Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.VytrackUtils;
import xpath.TestBase;

public class EndDateAutoAdjust extends TestBase {


    @Test
    public void changeMenu() throws InterruptedException {
        driver.get(ConfigurationReader.get("VYurl"));
        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");
        VytrackUtils.login(driver, username, password);
        VytrackUtils.selectMenuOption(driver, "Activities", "Calendar Events");
        VytrackUtils.waitForUIOverlay();
        driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']")).click();
        WebDriverWait wait = new WebDriverWait(Driver.get(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[starts-with(@id,'date_selector_oro_calendar_event')])[1]")));
        Thread.sleep(3000);
        WebElement startDate =driver.findElement(By.xpath("(//*[starts-with(@id,'date_selector_oro_calendar_event')])[1]"));
        startDate.click();
        driver.findElement(By.linkText("30")).click();
        WebElement EndDate = driver.findElement(By.xpath("(//*[starts-with(@id,'date_selector_oro_calendar_event')])[2]"));
        Assert.assertEquals(startDate.getAttribute("value"),EndDate.getAttribute("value"));

    }

}
