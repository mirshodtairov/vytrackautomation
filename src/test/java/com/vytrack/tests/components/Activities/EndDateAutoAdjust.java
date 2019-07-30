package com.vytrack.tests.components.Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.VytrackUtils;
import xpath.TestBase;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

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
    @Test
    public void EndTimeAutoAdjust() throws InterruptedException {
        driver.get(ConfigurationReader.get("VYurl"));
        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");
        VytrackUtils.login(driver, username, password);
        VytrackUtils.selectMenuOption(driver, "Activities", "Calendar Events");
        VytrackUtils.waitForUIOverlay();
        driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']")).click();
        WebElement startTime = driver.findElement(By.xpath("(//*[starts-with(@id,'time_')])[1]"));
        Thread.sleep(3000);
        startTime.click();
        WebElement choosenTime = driver.findElement(By.xpath("/html/body/div[6]/ul/li[15]"));
        choosenTime.click();
        WebElement endTime = driver.findElement(By.xpath("(//*[starts-with(@id,'time_')])[2]"));
        String StringStartTime= startTime.getAttribute("value");
        String StringEndTime = endTime.getAttribute("value");
        StringStartTime=StringStartTime.replaceAll("\\D","");
        StringEndTime=StringEndTime.replaceAll("\\D","");
        System.out.println(StringStartTime);
        System.out.println(StringEndTime);
        int intStartTime = Integer.parseInt(StringStartTime);
        int intEndTime = Integer.parseInt(StringEndTime);
        Assert.assertTrue(intEndTime>intStartTime);
    }
    

    @Test
    public void EndDateAutoAdjust() throws InterruptedException {
        driver.get(ConfigurationReader.get("VYurl"));
        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");
        VytrackUtils.login(driver, username, password);
        VytrackUtils.selectMenuOption(driver, "Activities", "Calendar Events");
        VytrackUtils.waitForUIOverlay();
        driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']")).click();
        WebElement startTime = driver.findElement(By.xpath("(//*[starts-with(@id,'time_')])[1]"));
        Thread.sleep(3000);
        startTime.click();
        WebElement choosenTime = driver.findElement(By.xpath("/html/body/div[6]/ul/li[48]"));
        choosenTime.click();
        //System.out.println(startTime.getAttribute("value"));
        WebElement endTime = driver.findElement(By.xpath("(//*[starts-with(@id,'time_')])[2]"));
        //System.out.println(endTime.getAttribute("value"));
        Assert.assertEquals(endTime.getAttribute("value"), "12:30 AM");
        System.out.println(LocalDate.now());
        WebElement EndDate = driver.findElement(By.xpath("(//*[starts-with(@id,'date_selector_oro_calendar_event')])[2]"));
        System.out.println(EndDate.getAttribute("value"));


    }

}
