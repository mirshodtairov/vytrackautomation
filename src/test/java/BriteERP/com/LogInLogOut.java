package BriteERP.com;

import org.testng.annotations.Test;
import utilities.BriteERPUtils;
import utilities.ConfigurationReader;
import xpath.TestBase;

public class LogInLogOut extends TestBase {


    @Test
    public void settingUp(){

        driver.get(ConfigurationReader.get("url"));
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        BriteERPUtils.login(driver, username, password);
    }
}
