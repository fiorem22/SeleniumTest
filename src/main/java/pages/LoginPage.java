package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;
    By inputUsername = By.id("user-name");
    By inputPassword = By.id("password");
    By btnLogin = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void writeUsername(String username) {
        WebElement inputUsernameElement = driver.findElement(inputUsername);
        inputUsernameElement.sendKeys(username);
    }

    public void writePassword(String password) {
        WebElement inputPasswordElement = driver.findElement(inputPassword);
        inputPasswordElement.sendKeys(password);
    }

    public void click(){
        WebElement btnLoginElement = driver.findElement(btnLogin);
        btnLoginElement.click();
    }
}
