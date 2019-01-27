package Projectauto;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class main {


    private static WebDriver driver;

    private static  void takeScreenShot(String imagesPath) {


    }


    @BeforeClass
    public static void a() {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\comply\\IdeaProjects\\eitan1\\src\\chromedriver.exe");
        driver = new ChromeDriver();// אומר לדרייבר כמה זמן נותנים לו למצוא את האלמנט עד שהוא נכשל
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://buyme.co.il/");

    }

    @Test

    public  void test01(){

      // מסך הרגיסטרציה
        driver.findElement(By.partialLinkText(Constants.locator)).click();
        driver.findElement(By.className(Constants.locator2)).click();
        Regis.enterFirstName(driver);
        Regis.sendEmail(driver);
        Regis.enterPassword(driver);
        Regis.enterVerificationPass(driver);
        Regis.clickTerms(driver);
        Regis.submit(driver);
    }
     @Test
        // מסך הבית
    public  void test02 () throws InterruptedException {
        HomeScreen.choosePrice(driver);
        HomeScreen.pickArea(driver);
        HomeScreen.pickCategory(driver);
        HomeScreen.submitHS(driver);
    }
    @Test
        // מסך הבחירה
    public  void test03 () {
        ChooseGift.pickBusiness(driver);
        ChooseGift.assertChange(driver);
        ChooseGift.selectPrice(driver);
    }
    @Test
    //מסך המקבל והשולח
    public  void test04(){
     Senderandrecived.PressRadio(driver);
     Senderandrecived.reciverName(driver);
     Senderandrecived.senderName(driver);
     Senderandrecived.pickevent(driver);
     Senderandrecived.enterBlessing(driver);
     Senderandrecived.afterPay(driver);


    }
    }


















