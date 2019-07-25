package com.vytrack.tests.components.login_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTestNegative {
    WebDriver driver;

    @BeforeClass
    public void WebDriverSetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3.vytrack.com");


    }
    @Test
    public void LogInPositive() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager53");
        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput2")).sendKeys("userUser123"+ Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("(//html/body/div/div/div/div/div/form/fieldset/div/div)[1]")).getText(),"Invalid user name or password.");
        String titel = driver.getTitle();
        String URL = driver.getCurrentUrl();
        titel=titel.toLowerCase();
        Assert.assertTrue(URL.endsWith(titel));

    }

}
