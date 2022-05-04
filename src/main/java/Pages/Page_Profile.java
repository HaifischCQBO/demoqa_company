package Pages;

import Helpers.Helpers;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Page_Profile {
    public WebDriver driver;
    public Helpers helpers;

    public Page_Profile(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By select_profile = By.xpath("//div[6]/div/ul/li[3]");
    public By select_login = By.xpath("//label/a[1]");
    public By select_input_username = By.xpath("//*[@id=\"userName\"]");
    public By select_input_password = By.xpath("//*[@id=\"password\"]");
    public By botton_login = By.xpath("//*[@id=\"login\"]");
    public By delete_libro = By.xpath("//div[1]/div/div[5]/div/span");
    public By botton_ok = By.id("closeSmallModal-ok");

    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void click_profile(){
        helpers.clickElement(select_profile);
        //driver.findElement(find_flights_button).click();
    }
    public void click_login(){
        helpers.clickElement(select_login);
        //driver.findElement(find_flights_button).click();
    }
    public void dates_login(){
        helpers.SendText(select_input_username, "vargas quiroga");
        helpers.SendText(select_input_password,"Colombia1$");
    }
    public void click_botton(){
        helpers.clickElement(botton_login);

    }
    public void click_delete(){
        helpers.Pause(4);
        helpers.clickElement(delete_libro);

    }
    public void click_ok() {
        helpers.clickElement(botton_ok);
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }


}
