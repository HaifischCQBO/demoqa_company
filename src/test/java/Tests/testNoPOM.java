package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class testNoPOM {

    public WebDriver driver;
    @Test
    @Ignore
    public void PrimeraPrueba() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/");
    }
/*
    public void PrimerPrueba() {


        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-gpu");// argumento para no consumir demasiados recursos
        driver = new ChromeDriver(options);

        driver.get("https://demoqa.com/checkbox");
    }
*/
}
