package pages;

import Helpers.Helpers;

import com.google.inject.spi.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_broken {

    public WebDriver driver;
    public Helpers helpers;

    public Page_broken(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }
}


    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    private By Valid_Link = By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/a[1]");
    private By Brok_Link = By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/a[2]");



    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void click_valid_button(){
        helpers.clickBy(Valid_Link);
    }

    
    public void click_Broken_button(){
        helpers.clickBy(Brok_Link);
    }


