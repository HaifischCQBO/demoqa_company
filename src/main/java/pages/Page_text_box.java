package pages;

import org.openqa.selenium.WebDriver;

import Helpers.Helpers;

public class Page_text_box {
    
    public WebDriver driver;
    public Helpers helpers;
    
}


    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    private By Full_name = By.id("userName");
    private By Name_Email = By.id("userEmail");
    private By Current_Address = By.id("currentAddress");
    private By Permanent_Address = By.id("permanentAddress");
    private By Button_Submit = By.id("submit");

    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */


    public void Text_Box_form(){

        helpers.clickBy(Full_name);
        helpers.SendText(Full_name,"brayan mahecha");
        helpers.clickBy(Name_Email);
        helpers.SendText(Name_Email,"x@hotmail.com");
        helpers.clickBy(Current_Address);
        helpers.SendText(Current_Address,"cra 72 # 40-83");
        helpers.clickBy(Permanent_Address);
        helpers.SendText(Permanent_Address,"calle 37a # 20d-150");
        helpers.clickBy(Button_Submit);
    }