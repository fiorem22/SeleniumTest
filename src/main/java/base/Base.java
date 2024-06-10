package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.InventoryPage;
import pages.LoginPage;

public class Base {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected InventoryPage inventoryPage;

    @BeforeClass
    public void setUp () {
        System.setProperty("webdriver.chrome.driver", "/Users/fiorellamosqueirazapta/IdeaProjects/SeleniumTest/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
    }

    @AfterClass
    public void tearDown () {
        if (driver == null) {
           driver.quit();
        }
    }
}
