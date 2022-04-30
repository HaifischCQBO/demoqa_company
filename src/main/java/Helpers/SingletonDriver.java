package Helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SingletonDriver {

    private static WebDriver driver;
    private static boolean closeWhenFinished = false;

    private SingletonDriver(){}

    public static WebDriver getWebDriver(){

        if(driver == null){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-gpu");
            /**
            if(helpers.getXMLParameter("headless").equals("true")) {
                options.addArguments("--headless");
            }*/
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        return driver;
    }

    public static void setCloseWhenFinished(boolean close){
        closeWhenFinished = close;
    }
    public static boolean getCloseWhenFinished(){
        return  closeWhenFinished;
    }

}
