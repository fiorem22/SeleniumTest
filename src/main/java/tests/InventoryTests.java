package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class InventoryTests {
 public WebDriver driver;
 public InventoryPage inventoryPage;
 public LoginPage loginPage;

    @BeforeMethod
    public void setUpClass (){
        System.setProperty("webdriver.chrome.driver", "/Users/fiorellamosqueirazapta/IdeaProjects/SeleniumTest/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void addToCartSucces(){
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        loginPage.writeUsername("standard_user");
        loginPage.writePassword("secret_sauce");
        loginPage.click();
        inventoryPage.clickAddToCart();
    }

    @AfterMethod
    public void closeSucces(){
        //driver.close();
    }
}
