package com.vytrack.tests.components.login_navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginTestPositive {


    WebDriver driver;

    @BeforeClass
    public void WebDriverSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3.vytrack.com");


    }

    @Test
    public void LogInPositive() throws InterruptedException {

        List<String> credentials = Arrays.asList("storemanager51", "salesmanager101", "user1");

        Thread.sleep(3000);
        String password = "UserUser123";
        for (int i = 0; i <= credentials.size() - 1; i++) {

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.id("prependedInput")).sendKeys(credentials.get(i));
            driver.findElement(By.id("prependedInput2")).sendKeys(password + Keys.ENTER);
            Thread.sleep(2000);
            Assert.assertEquals(driver.getTitle(), "Dashboard");
            Thread.sleep(2000);
            Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[1]")).isDisplayed());
            if (credentials.get(i).startsWith("user")) {
                Assert.assertEquals(driver.findElement(By.xpath("//*[@class='oro-subtitle']")).getText(), "Quick Launchpad");
            }
            //LogOut
            driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@class='no-hash']")).click();
        }
    }
    @AfterClass
    public void TearDown() {
        driver.quit();
    }


}
