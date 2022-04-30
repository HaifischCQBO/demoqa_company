package pages;

import Helpers.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Index {

    public WebDriver driver;
    public Helpers helpers;


    // Inicializamos driver

    public Page_Index(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    private By Elements = By.xpath("//div[@class=\"card mt-4 top-card\"][1]");



    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void click_elements(){
        helpers.clickBy(Elements);
    }


}
