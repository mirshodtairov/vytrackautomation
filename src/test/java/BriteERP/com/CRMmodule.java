package BriteERP.com;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CRMmodule {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://54.148.96.210");

    }

    @Test
    public void test() throws InterruptedException {
        WebElement signInButton = driver.findElement(By.xpath("//a[@href='/web/login']"));
        signInButton.click();
        WebElement login = driver.findElement(By.id("login"));
        login.sendKeys("eventscrmmanager13@info.com");
        driver.findElement(By.id("password")).sendKeys("eventscrmmanager" + Keys.ENTER);
        driver.findElement(By.linkText("com")).click();
        //driver.findElement(By.className("btn btn-primary btn-sm o-kanban-button-new")).click();
         WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Create')]")));
        WebElement create = driver.findElement(By.xpath("//button[contains(text(),'Create')]"));
        create.click();
        driver.findElement(By.xpath("(//*[@type='text'])[5]")).sendKeys("Customer deal");
        WebElement customer =driver.findElement(By.xpath("(//*[@type='text'])[6]"));
        Faker faker = new Faker();
        customer.sendKeys(faker.name().fullName());
        driver.findElement(By.xpath("//div[@class='o_form_sheet']")).click();
        driver.findElement(By.xpath("(//button[@type='button']/span)[6]")).click();
        WebElement ExpectedRevenue =driver.findElement(By.xpath("(//*[@type='text'])[7]"));
        ExpectedRevenue.clear();
        ExpectedRevenue.sendKeys("3500");
        WebElement submit = driver.findElement(By.xpath("//button[@name='close_dialog']/span"));
        submit.click();////*[@id="modal_47"]/div/div/div[3]/div/footer/button[1]/span
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div > button[accesskey='l']")).click();
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/table/tbody/tr/td")).click();
        WebElement ActionButton = driver.findElement(By.xpath("(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]"));
        ActionButton.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/ul/li[4]/a")).click();
      //  Select fromActionList = new Select(ActionButton);
       // wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[contains(text(), 'Delete')]"))));
        driver.findElement(By.xpath("//a[contains(text(), 'Delete')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[.='Ok']")).click();


 //       driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary'][1]/span")).click();


//        driver.findElement(By.xpath("//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'][contains(text(),'Action')]")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.linkText("Delete")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[.='Ok']")).click();


   }




    }
