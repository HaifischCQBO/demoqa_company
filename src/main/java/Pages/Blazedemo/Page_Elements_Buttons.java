package Pages.Blazedemo;

import Helpers.Helpers;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Elements_Buttons {
    public WebDriver driver;
    public static Helpers helpers;

    public Page_Elements_Buttons(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    // public By buttons_li = By.id("item-4");
    public By buttons_clickMe = By.id("OEeOV");
    // public By buttons_doubleClick = By.id("doubleClickBtn");
    // public By buttons_rightClick = By.id("rightClickBtn");


    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    //public void click_web_buttons_li(){
      //  helpers.clickBy(buttons_li);
        //driver.findElement(find_flights_button).click();
    //}

    public void click_web_buttons_clickMe(){
        helpers.clickBy(buttons_clickMe);
        //driver.findElement(find_flights_button).click();
    }
   /*     public void dobleClick_buttons_doubleClick(){
            helpers.clickBy(buttons_doubleClick);
        } */
}
