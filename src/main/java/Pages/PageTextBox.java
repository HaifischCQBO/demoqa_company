package Pages;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoSuchElementException;

public class PageTextBox {
    public WebDriver driver;
    public Helpers helpers;

    public PageTextBox(WebDriver driver) {
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By elementsTextBox = By.id("item-0");
    public By inputFullname = By.id("userName");
    public By inputEmail = By.id("userEmail");
    private By inputCurrentAddress = By.id("currentAddress");
    private By inputPermanentAddress = By.id("permanentAddress");
    private By submitButton = By.id("submit");

    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void fillTextBox(){
        helpers.SendText(inputFullname, "Andres Felipe Ramirez Morales");
        helpers.SendText(inputEmail,"2320557@tcs.com");
        helpers.SendText(inputCurrentAddress,"***####");
        helpers.SendText(inputPermanentAddress,"*****####");
    }

    public void clickElementsTextbox(){
        helpers.clickBy(elementsTextBox);
    }
    public void clickSubmit(){
        helpers.clickBy(submitButton);
    }

}

