package Baseclass;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    public WebDriver driver;
    Helpers helpers = new Helpers();

    @BeforeMethod
    public void setUp(){
        driver = SingletonDriver.getWebDriver();
        SingletonDriver.setCloseWhenFinished(true);
    }

    @AfterMethod
    public void Finished(){
        if(SingletonDriver.getCloseWhenFinished())
            driver.quit();
    }


}
