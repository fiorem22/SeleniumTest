package tests;

import base.Base;
import org.testng.annotations.Test;

public class LoginTest extends Base {
    @Test
    public void loginSuccess(){
        driver.get("https://www.saucedemo.com/");

        loginPage.writeUsername("standard_user");
        loginPage.writePassword("secret_sauce");
        loginPage.click();
    }
}

