package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Helpers.Helpers;

public class Page_text_box {

    public WebDriver driver;
    public Helpers helpers;

    public Page_text_box(WebDriver driver) {
        this.driver = driver;
        helpers = new Helpers(driver);
    }


    /**
     * ---------------------------------------------------------------------------------------------------------
     * WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    private By Full_name_field = By.id("userName");
    private By Name_Email_field = By.id("userEmail");
    private By Current_Address_field = By.id("currentAddress");
    private By Permanent_Address_field = By.id("permanentAddress");
    private By Button_Submit_field = By.id("submit");

    /**
     * -----------------------------------------------------------------------------------------------------------
     * Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */


    public void Text_Box_form() {


        helpers.SendText(Full_name_field, "brayan mahecha");

        helpers.SendText(Name_Email_field, "x@hotmail.com");

        helpers.SendText(Current_Address_field, "cra 72 # 40-83");

        helpers.SendText(Permanent_Address_field, "calle 37a # 20d-150");

    }
}


    public void click_botton_submit (){
    helpers.clickElement(Button_Submit_field);
    }