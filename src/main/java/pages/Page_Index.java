package pages;

import Helpers.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Index {

    public WebDriver driver;
    public Helpers helpers;

    public Page_Index(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    private By Elements = By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]/div/div[2]/svg/path");



    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void click_elements(){
        helpers.clickBy(Elements);
    }


}
