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
            System.out.println("me cree");
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-gpu");
            /*
            if(helpers.getXMLParameter("headless").equals("true")) {
                options.addArguments("--headless");
            }*/
            //options.addArguments("--headless");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        return driver;
    }

    public static void setDriverNull(){
        driver = null;
    }

    public static void setCloseWhenFinished(boolean close){
        closeWhenFinished = close;
    }
    public static boolean getCloseWhenFinished(){
        return  closeWhenFinished;
    }

}
