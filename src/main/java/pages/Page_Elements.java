package pages;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Elements {

    public WebDriver driver;
    public Helpers helpers;

    public Page_Elements(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    private By Broken_Button_option = By.xpath(// li[@id="item-6"]);
    private By Text_Box_Button_option = By.xpath(// li[@id="item-0"]);




    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void click_Broken_Links(){
        helpers.clickBy(Broken_Button_option);
    }



    public void click_text_box(){

        helpers.clickBy(Text_Box_Button_option);
    }


}
