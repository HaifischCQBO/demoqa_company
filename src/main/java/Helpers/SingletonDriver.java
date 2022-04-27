package Helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SingletonDriver {

    private static WebDriver driver;
    private static boolean closeWhenFinished = false;

    private SingletonDriver(){}

    public static WebDriver getWebDriver(){
        Helpers helpers = new Helpers();
        if(driver == null){

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-gpu");
            if(helpers.getXMLParameter("headless").equals("true")) {
                options.addArguments("--headless");
            }
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();

            //hacer zoom
            //JavascriptExecutor js = (JavascriptExecutor) driver;
            //driver.get("chrome://settings/");
            //js.executeScript("chrome.settingsPrivate.setDefaultZoom(0.5);");

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
