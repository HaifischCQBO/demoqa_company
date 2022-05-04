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


    //Crear un nuevo driver, para prueba de test de boton Seleccionar archivo
    @BeforeMethod
    public void Elements(){
        Helpers helpers = new Helpers();
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu");
        if(helpers.getXMLParameter("headless").equals("true")) {
            options.addArguments("--headless");
        }
        driver = new ChromeDriver(options);
    }

    @AfterMethod
    public void Finished(){
        driver.quit();
    }

   /* @BeforeMethod
    public void setUp(){
        driver = SingletonDriver.getWebDriver();
        SingletonDriver.setCloseWhenFinished(true);
    }*/

   /* @AfterMethod
    public void Finished(){
        if(SingletonDriver.getCloseWhenFinished())
            driver.quit();
    }*/


}
