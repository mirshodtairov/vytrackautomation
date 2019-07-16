package com.vytrack.tests.components.login_navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class
PageAccessTests {


    WebDriver driver;

    @BeforeClass
    public void WebDriverSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3.vytrack.com");


    }
    @Test(priority = 1)
    public void contractsPage1() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3.vytrack.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager53");
        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(2000);
        WebElement Customer =driver.findElement(By.xpath("(//*[@class='title title-level-1'])[2]"));
        Customer.click();
        driver.findElement(By.xpath("//*[contains(text(),'Vehicle Contracts')]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class='oro-subtitle']")).getText(),"All Vehicle Contract");
        driver.quit();


    }
    @Test(priority = 2)
    public void contractsPage2() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3.vytrack.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("prependedInput")).sendKeys("salesmanager102 ");
        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(2000);
        WebElement Customer =driver.findElement(By.xpath("(//*[@class='title title-level-1'])[2]"));
        Customer.click();
        driver.findElement(By.xpath("//*[contains(text(),'Vehicle Contracts')]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class='oro-subtitle']")).getText(),"All Vehicle Contract");
        driver.quit();


    } @Test(priority = 3)
    public void contractsPage3() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://qa3.vytrack.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("prependedInput")).sendKeys("user2");
        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(2000);
        WebElement Customer =driver.findElement(By.xpath("(//*[@class='title title-level-1'])[1]"));
        Customer.click();
        driver.findElement(By.xpath("//*[contains(text(),'Vehicle Contracts')]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("(//*[@class='message'])[2]")).getText(),"You do not have permission to perform this action.");
        driver.quit();


    }
}
