package Pages.Blazedemo;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Page_Buttons {
    public WebDriver driver;
    public static Helpers helpers;

    public Page_Buttons(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By elements_buttons = By.id("item-4");
    public By buttons_clickMe = By.id("OEeOV");
    public By buttons_doubleClick = By.id("doubleClickBtn");
    public By buttons_RightClick = By.id("rightClickBtn");

    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */


    public void clickButtons(){
        helpers.clickBy(elements_buttons);
    }

    public void clickMe_buttons(){
        helpers.clickBy(buttons_clickMe);
    }

    public void doubleClick(){
        Actions dobleClick = new Actions(driver);
        dobleClick.doubleClick();
    }

    public void rightClick() {
        Actions clickDerecho = new Actions(driver);
        clickDerecho.contextClick();
    }

}
