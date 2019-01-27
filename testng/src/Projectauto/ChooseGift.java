package Projectauto;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ChooseGift {

    public static void pickBusiness (WebDriver driver){
        driver.findElement(By.className(Constants.PICK_BUSINESS_ELEMENT));
        List<WebElement> cardElement = driver.findElements(By.className(Constants.PICK_BUSINESS_LIST));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        cardElement.get(1).click();
    }
    public static void assertChange (WebDriver driver){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String currentURL = driver.getCurrentUrl();
        String homeUrl = Constants.HOME_URL;
        Assert.assertNotEquals(homeUrl,currentURL);
    }
    public static void  selectPrice(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(Constants.SELECT_PRICE_ELEMENTS)).sendKeys(Constants.PRICE);
        Actions action = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        action.moveToElement(driver.findElement(By.xpath(Constants.SELECT_PRICE))).click().perform();



    }
}
