package Projectauto;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
public class Regis {


    public static void enterFirstName(WebDriver driver) {
        driver.findElement(By.className(Constants.FIRST_NAME_CLASS)).sendKeys(Constants.NAME);
    }

    public static void sendEmail(WebDriver driver) {
        WebElement emailElement = driver.findElement(By.xpath(Constants.E_Mail_Xpath));
        emailElement.sendKeys(Constants.email);
    }

    public static void enterPassword(WebDriver driver) {
        WebElement passwordElement = driver.findElement(By.xpath(Constants.PassWord_Xpath));
        passwordElement.sendKeys(Constants.pass);

    }

    public static void enterVerificationPass(WebDriver driver) {
        WebElement verpassElement = driver.findElement(By.xpath(Constants.Pass_Xpath));
        verpassElement.sendKeys(Constants.Password);
    }

    public static void clickTerms(WebDriver driver) {
        new Actions(driver).moveToElement(driver.findElement(By.className(Constants.AGREE_BUTTON))).click().perform();
    }

    public static void submit(WebDriver driver) {
        driver.findElement(By.className(Constants.SUBMIT_RS)).click();
    }

}





