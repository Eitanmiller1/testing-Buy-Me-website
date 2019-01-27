package Projectauto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.io.ObjectInputStream;
import java.util.List;

public class Senderandrecived {


    public static void PressRadio(WebDriver driver) {
        WebElement sendToButton = driver.findElement(By.xpath(Constants.RADIO_BUTTON_XPATH));
        sendToButton.click();

    }

    public static void reciverName(WebDriver driver) {
        driver.findElement(By.xpath(Constants.RECIVER_XPATH)).sendKeys(Constants.RECIVER_NAME);
    }

    public static void senderName(WebDriver driver) {
        driver.findElement(By.xpath(Constants.SENDER_XPATH)).sendKeys(Constants.SENDRE_NAME);

    }

    public static void pickevent(WebDriver driver) {
        List<WebElement> eventchoise = driver.findElements(By.className(Constants.EVENT_LIST));
        eventchoise.get(6).click();
        driver.findElements(By.className(Constants.EVENT)).get(1).click();
    }

    public static void enterBlessing(WebDriver driver) {
        WebElement blessingElement = driver.findElement(By.xpath(Constants.BLESSING_XPATH));
        blessingElement.clear();
        blessingElement.sendKeys(Constants.BLESSING);
    }

    public static void afterPay(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.AFTER_PAY_XPATH))).click();
    }

    public static void pickSendOption(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(Constants.SEND_OPTION_WAIT))));
        List<WebElement> sendOptionsList = driver.findElements(By.className(Constants.SEND_OPTION_LIST));
        sendOptionsList.get(1).click();

    }
}









