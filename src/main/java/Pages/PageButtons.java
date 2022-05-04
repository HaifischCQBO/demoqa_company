package Pages;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
    public By clickMessage = By.id("dynamicClickMessage");
    public By rightMessage = By.id("rightClickMessage");
    public By doubleMessage = By.id("doubleClickMessage");


    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void clickElementsButtons(){
        helpers.clickElement(ElementsButtons);
    }

    public void clickMeButton(){
        helpers.clickElement(buttons_clickMe);
    }

    public void doubleClick(){
        helpers.double_clickBy(buttonsDoubleClick);
    }

    public void rightClick() {
        helpers.rightClick(buttonsRightClick);
    }

    public String getTextRightClikMessage(){

        helpers.goToElement(driver.findElement(rightMessage));

        return helpers.getValue(rightMessage);
    }
    public boolean rightClickMessage() {
        boolean present;

        try {
            driver.findElement(rightMessage);
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
        return present;
    }
    public String getTextDoubleClikMessage(){

        helpers.goToElement(driver.findElement(doubleMessage));

        return helpers.getValue(doubleMessage);
    }
    public boolean doubleClickMessage() {
        boolean present;

        try {
            driver.findElement(doubleMessage);
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
        return present;
    }
    public String getTextClikMessage(){

        helpers.goToElement(driver.findElement(clickMessage));

        return helpers.getValue(clickMessage);
    }
    public boolean ClickMessage() {
        boolean present;

        try {
            driver.findElement(clickMessage);
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
        return present;
    }

}