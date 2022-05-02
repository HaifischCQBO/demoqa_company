package Baseclass;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    public WebDriver driver;
    @BeforeMethod
    public void setUp(){
        Helpers helpers = new Helpers();
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-gpu");// argumento para no consumir demasiados recursos
        options.addArguments("start-maximized");
        if(helpers.getXMLParameter("headless").equals("true")) {
            options.addArguments("--headless");
        }
        driver = new ChromeDriver(options);

    }

    @AfterMethod
    public void Finished(){
        driver.quit();
    }
}
