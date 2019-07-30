package BriteERP.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ERPTablesUnderGrid {
    WebDriver driver = Driver.get();

    public ERPTablesUnderGrid() {
        PageFactory.initElements(driver, this);
    }

    public void sumOfAmountInTable() {
       // int length = driver.findElements(By.xpath("//tbody/tr/td[2]")).size();
        double total = 0;
        BrowserUtils.waitFor(2);
        List<WebElement> list2 = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        List<String> str = new ArrayList<>();
        BrowserUtils.waitFor(2);
        for (int i = 2; i<list2.size(); i++) {
            str.add(list2.get(i).getText().replace(",",""));
        }
        List<Integer> sum = new ArrayList<>();
        int result=0;
        for(String st:str){
            int a = (int)Integer.parseInt(st.substring(0,st.length()-3));
                  result+=a;
        }
        System.out.println("sum "+sum);
        System.out.println(result);
    }





//        for (int i = 2; i < length; i++) {
//
//           list2.add(driver.findElements(By.xpath("//tbody/tr/td[2]")).get(i).getText().replace(",",""));
//
//
//
//
//        }



    public WebElement getFunctionFromTable(String chooseFunction) {
        String xpath = "//a[@href='#' and contains(text(), '" + chooseFunction + "')]";
        return Driver.get().findElement(By.xpath(xpath));
    }

    public List<WebElement> getRawsFromTable() {
        List<WebElement> listOfOpportunities = Driver.get().findElements(By.xpath("//tbody/tr"));
        return listOfOpportunities;
    }
}