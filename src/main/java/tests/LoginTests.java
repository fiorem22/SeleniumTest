package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LoginPage;

public class LoginTests {
 public WebDriver driver;
 public LoginPage loginPage;

@BeforeMethod
public void setUpClass (){
 System.setProperty("webdriver.chrome.driver", "/Users/fiorellamosqueirazapta/IdeaProjects/SeleniumTest/src/main/resources/chromedriver");
 driver = new ChromeDriver();
 driver.manage().window().maximize();
 }
@Test
 public void loginSucces(){
 driver.get("https://www.saucedemo.com/");
 loginPage = new LoginPage(driver);
 loginPage.writeUsername("standard_user");
 loginPage.writePassword("secret_sauce");
 loginPage.click();
  }
  @AfterMethod
 public void closeSucces(){
 //driver.close();
  }
}
