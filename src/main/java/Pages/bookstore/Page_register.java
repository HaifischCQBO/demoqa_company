package Pages.bookstore;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_register {
    public WebDriver driver;
    public Helpers helpers;

    public Page_register(WebDriver driver) {
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebBookStoreApplication // WebBookStoreApplication // WebBookStoreApplication // WebBookStoreApplication//
     * ---------------------------------------------------------------------------------------------------------
     */
    public By First_Name = By.id("firstname");
    public By Last_Name = By.id("lastname");
    public By User = By.id("userName");
    public By Password = By.id("password");

    public By elements = By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]");
    public By Button_register = By.xpath("//button[@id= 'register']");

    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funtions // Funtions // Funtions // Funtions // Funtions // Funtions // Funtions // Funtions // Funtions //
     * -----------------------------------------------------------------------------------------------------------
     */

    public void formRegister(){
        driver.findElement(First_Name).sendKeys("Carlos Andres");
        driver.findElement(Last_Name).sendKeys("Ramirez Henao");
        driver.findElement(User).sendKeys("cRamirez");
        driver.findElement(Password).sendKeys("1989Juli03@");
        driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
    }


    public void clickregister(){
        helpers.clickBy(Button_register);
    }
}
