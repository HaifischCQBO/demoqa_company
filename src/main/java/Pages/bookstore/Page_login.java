package Pages.bookstore;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Page_login {

    public WebDriver driver;
    public Helpers helpers;

    public Page_login(){
        this.driver = SingletonDriver.getWebDriver();
        helpers = new Helpers(driver);
    }
    // WEB ELEMENT // WEB ELEMENT //WEB ELEMENT //WEB ELEMENT //WEB ELEMENT //WEB ELEMENT //WEB ELEMENT

    public  By user_name = By.id("userName");
    public  By password = By.id("password");
    public  By button_login = By.xpath("//button[@id='login']");

    // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES

    public void formLogin(){
        driver.findElement(user_name).sendKeys("Lroldan");
        driver.findElement(password).sendKeys("Lroldan6!");
    }

    public void click_buttom_login(){
        helpers.clickElement(button_login);
    }
    public void scrollByElement(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", button_login);
    }
}
