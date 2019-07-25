package com.vytrack.tests.smoke_tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MenuOptionsTest {

    WebDriver driver;

    @BeforeClass
    public void WebDriverSetUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("http://qa3.vytrack.com");

    }
    @Test(priority = -1)
    public void test1() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("prependedInput")).sendKeys("user4");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+Keys.ENTER);
        Thread.sleep(2000);
        WebElement fleet =driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/a/span"));
        fleet.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/div/div/ul/li[3]/a/span")).click();
        Thread.sleep(3000);
        Assert.assertEquals("Car - Entities - System - Car - Entities - System",driver.getTitle());
        Thread.sleep(2000);
          String pageName= driver.findElement(By.className("oro-subtitle")).getText();
          Assert.assertEquals("Cars",pageName);
          Thread.sleep(2000);


        driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[2]/div/div/ul/li[3]/a/span")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(), "Accounts - Customers");
        Thread.sleep(2000);
        String pageName2= driver.findElement(By.className("oro-subtitle")).getText();
        Assert.assertEquals("Accounts",pageName2);
        Thread.sleep(2000);



        driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[2]/a/span")).click();
        driver.findElement(By.linkText("Contacts")).click();
        Assert.assertEquals(driver.getTitle(), "Accounts - Customers");
        Thread.sleep(2000);
        String pageName3= driver.findElement(By.className("oro-subtitle")).getText();
        Assert.assertEquals("Contacts",pageName3);
        Thread.sleep(2000);



        driver.findElement(By.cssSelector("#main-menu > ul > li:nth-child(3) > a > span")).click();
        driver.findElement(By.linkText("Calendar Events")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(), "Calendar Events - Activities");
        Thread.sleep(2000);
        String pageName4 = driver.findElement(By.cssSelector("#container > div.container-fluid.page-title > div > div > div.pull-left.pull-left-extra > div > h1")).getText();
        Assert.assertEquals("Calendar Events",pageName4);
        Thread.sleep(2000);

    }
    @Test(priority = 0)
    public void tearUp(){
        driver.quit();
    }


    @Test(priority = 1)
    public void CredentialsEntery() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("http://qa3.vytrack.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager53");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(2000);
    }


    @Test(priority = 2)
    public void Dashboard() throws InterruptedException {
        WebElement dashboard =driver.findElement(By.xpath("(//*[@class='title title-level-1'])[1]"));
        dashboard.click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Dashboard")).click();
        Assert.assertEquals(driver.getTitle(),	"Dashboard");
        Thread.sleep(2000);
        String page =driver.findElement(By.xpath("//*[@class='oro-subtitle']")).getText();
        Assert.assertEquals(page,"Dashboard");
        Thread.sleep(2000);

    }
    @Test(priority = 3)
    public void Fleet() throws InterruptedException {
        WebElement fleet =driver.findElement(By.xpath("(//*[@class='title title-level-1'])[2]"));
        fleet.click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Vehicles")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),	"All - Car - Entities - System - Car - Entities - System");
        Thread.sleep(2000);
        String page =driver.findElement(By.xpath("//*[@class='oro-subtitle']")).getText();
        Assert.assertEquals(page,"All Cars");
        Thread.sleep(2000);

    }
    @Test(priority = 4)
    public void Customer()throws InterruptedException{
        WebElement Customer =driver.findElement(By.xpath("(//*[@class='title title-level-1'])[3]"));
        Customer.click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Contacts")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),	"All - Contacts - Customers");
        Thread.sleep(2000);
        String page =driver.findElement(By.xpath("//*[@class='oro-subtitle']")).getText();
        Assert.assertEquals(page,"All Contacts");
        Thread.sleep(2000);

        WebElement Accounts =driver.findElement(By.xpath("(//*[@class='title title-level-1'])[3]"));
        Accounts.click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Accounts")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),	"All - Accounts - Customers");
        Thread.sleep(2000);
        String Contactspage =driver.findElement(By.xpath("//*[@class='oro-subtitle']")).getText();
        Assert.assertEquals(Contactspage,"All Accounts");
        Thread.sleep(2000);


    }
    @Test(priority = 5)
    public void Sales() throws InterruptedException {
        WebElement Customer =driver.findElement(By.xpath("(//*[@class='title title-level-1'])[4]"));
        Customer.click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Opportunities")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),	"Open Opportunities - Opportunities - Sales");
        Thread.sleep(2000);
        String OpportunitiePage =driver.findElement(By.xpath("//*[@class='oro-subtitle']")).getText();
        Assert.assertEquals(OpportunitiePage,"Open Opportunities");
        Thread.sleep(2000);

    }

    @Test(priority = 6)
    public void Activities() throws InterruptedException {
        WebElement Activities1 =driver.findElement(By.xpath("(//*[@class='title title-level-1'])[5]"));
        Activities1.click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Calls")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),	"All - Calls - Activities");
        Thread.sleep(2000);
        String ActivitiesPage =driver.findElement(By.xpath("//*[@class='oro-subtitle']")).getText();
        Assert.assertEquals(ActivitiesPage,"All Calls");
        Thread.sleep(2000);


        WebElement Activities2 =driver.findElement(By.xpath("(//*[@class='title title-level-1'])[5]"));
        Activities2.click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Calendar")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(),	"All - Calendar Events - Activities");
        Thread.sleep(2000);
        String CalendarEventsPage =driver.findElement(By.xpath("//*[@class='oro-subtitle']")).getText();
        Assert.assertEquals(CalendarEventsPage,"All Calendar Events");
        Thread.sleep(2000);

    }

    @AfterClass
    public void test2(){

        driver.quit();
    }




}
