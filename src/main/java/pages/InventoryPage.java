package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class InventoryPage {
    public WebDriver driver;
    WebDriverWait wait;
    By btnAddToCart = By.id("add-to-cart-sauce-labs-backpack");

    public InventoryPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Espera explícita de 10 segundos
    }

    public void clickAddToCart(){
//        WebElement btnAddToCartElement = driver.findElement(btnAddToCart);
//        btnAddToCartElement.click();
        wait.until(ExpectedConditions.elementToBeClickable(btnAddToCart));
        driver.findElement(btnAddToCart).click();
    }
}
