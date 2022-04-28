package Pages;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageElementsDynamicsProperties {
    public WebDriver driver;
    public Helpers helpers;

    public PageElementsDynamicsProperties(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    private By DynamicsProperties_button = By.xpath("//*[@id=\"item-8\"]");


    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void click_DynamicsProperties_button() {
        helpers.clickBy(DynamicsProperties_button);
    } //click

}
