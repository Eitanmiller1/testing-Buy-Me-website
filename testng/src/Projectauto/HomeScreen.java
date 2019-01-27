package Projectauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.security.pkcs11.wrapper.Constants;

import java.util.List;

public class HomeScreen {

    public static void choosePrice(WebDriver driver)throws InterruptedException{
        Thread.sleep (2000);
        driver.findElement (By.xpath(Constants.Price_Xpath)).click();
        List<WebElement> priceList = driver.findElements(By.className(Constants.PICK_PRICE_LIST));
        priceList.get(2).click();
    }
    public static void pickArea (WebDriver driver) {
        driver.findElement(By.xpath(Constants.PICK_ERA)).click();
        List<WebElement> AreaList = driver.findElements(By.className(Constants.PICK_AREA_LIST));
        AreaList.get(2).click();
    }
    public static void pickCategory (WebDriver driver){
        driver.findElement(By.xpath(Constants.PICK_CATAGORY)).click();
        List<WebElement> categoryList = driver.findElements(By.className(Constants.PICK_CATEGORY_LIST));
        categoryList.get(10).click();

    }
    public static void submitHS (WebDriver driver){
        driver.findElement(By.className(Constants.SUBMIT_HS)).click();
    }
}
