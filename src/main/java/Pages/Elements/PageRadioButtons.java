package Pages.Elements;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class PageRadioButtons {
    public WebDriver driver;
    public static Helpers helpers;

    public PageRadioButtons(WebDriver driver) {
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     * WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By elementsRadioButtons = By.id("item-2");
    public By radioButtonsclickYes = By.xpath("//div[@class=\"custom-control custom-radio custom-control-inline\"][1]");
    //button[text()='Click Me']
    public By radioButtonsclickImpressive = By.xpath("//div[@class=\"custom-control custom-radio custom-control-inline\"][2]");
    public By SelectionMessage = By.xpath("//p[text()='You have selected ']");

    /**
     * -----------------------------------------------------------------------------------------------------------
     * Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */


    public void clickRadioButtons() {
        helpers.clickElement(elementsRadioButtons);
    }

    public void clickRadioYes() {
        helpers.clickElement(radioButtonsclickYes);
    }

    public void clickRadioImpressive(){
        helpers.clickElement(radioButtonsclickImpressive);
    }
    public String getTextSelectionMessage(){

        helpers.goToElement(driver.findElement(SelectionMessage));

        return helpers.getValue(SelectionMessage);
    }
    public boolean RadioButtonsMessage() {
        boolean present;

        try {
            driver.findElement(SelectionMessage);
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
        return present;
    }


    }
