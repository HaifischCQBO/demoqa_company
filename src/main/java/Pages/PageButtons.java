package Pages;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageButtons {
    public WebDriver driver;
    public static Helpers helpers;

    public PageButtons(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By ElementsButtons = By.id("item-4");
    public By buttons_clickMe = By.xpath("//button[text()='Click Me']");
    public By buttonsDoubleClick = By.id("doubleClickBtn");
    public By buttonsRightClick = By.id("rightClickBtn");


    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void clickElementsButtons(){
        helpers.clickBy(ElementsButtons);
    }

    public void clickMeButton(){
        helpers.clickBy(buttons_clickMe);
    }

    public void doubleClick(){
        helpers.doubleClick(buttonsDoubleClick);
    }

    public void rightClick() {
        helpers.rightClick(buttonsRightClick);
    }

}