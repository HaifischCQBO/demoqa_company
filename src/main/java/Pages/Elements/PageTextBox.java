package Pages.Elements;

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

    // Results
    public By textName = By.xpath("//p[text()='Name:']");
    public By textEmail = By.xpath("//p[text()='Email:']");
    public By textCurrentAddress = By.xpath("//p[text()='Current Address :']");
    public By textPermanentAddress = By.xpath("//p[text()='Permananet Address :']");

    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void fillTextBox(){
        helpers.SendText(inputFullname, "Andres Felipe Ramirez Morales");
        helpers.SendText(inputEmail,"2320557@tcs.com");
        helpers.SendText(inputCurrentAddress,"94 North Jennings St, Sun Prairie, WI 53590");
        helpers.SendText(inputPermanentAddress,"55 Ivy Lane, Lebanon, PA 17042");
    }

    public void clickElementsTextbox(){
        helpers.clickElement(elementsTextBox);
    }
    public void clickSubmit(){
        helpers.clickElement(submitButton);
    }

    public String getTextFullName(){

        return helpers.getValue(inputFullname);
    }
    public String getTextEmail(){

        return helpers.getValue(inputEmail);
    }
    public String getTextCurrentAddress(){

        return helpers.getValue(inputCurrentAddress);
    }
    public String getTextPermanentAddress(){

        return helpers.getValue(inputPermanentAddress);
    }

    public String getResultTextName(){
        return helpers.getText(textName);
    }
    public String getResultTextEmail(){
        return helpers.getText(textEmail);
    }
    public String getResultTextCurrentAddress(){
        return helpers.getText(textCurrentAddress);
    }
    public String getResultTextPermanentAddress(){
        return helpers.getText(textPermanentAddress);
    }

}

