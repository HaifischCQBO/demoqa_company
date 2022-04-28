package Pages.Blazedemo;

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
    public By elementsRadioButtons = By.xpath("//*[@id=\"item-2\"]");
    public By radioButtonsclickYes = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]");
    public By radioButtonsclickImpressive = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]");

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
