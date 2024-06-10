package tests;

import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InventoryPage;

public class InventoryTest extends Base {
    @BeforeMethod
    public void openInventoryPage() {
        driver.get("https://www.saucedemo.com/inventory.html");  // Reemplaza con la URL correcta
    }
    @Test(dependsOnMethods =
            {"tests.LoginTest.loginSuccess"})

     public void addToCartSuccess(){
          inventoryPage.clickAddToCart();
    }
}
