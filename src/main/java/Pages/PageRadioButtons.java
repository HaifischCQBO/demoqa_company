package Pages;

import Helpers.Helpers;
import org.openqa.selenium.By;
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
    /**
     * -----------------------------------------------------------------------------------------------------------
     * Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */


    public void clickRadioButtons() {
        helpers.clickBy(elementsRadioButtons);
    }

    public void clickRadioYes() {
        helpers.clickBy(radioButtonsclickYes);
    }

    public void clickRadioImpressive(){
        helpers.clickBy(radioButtonsclickImpressive);
    }


}
