package Pages;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageIndex {

    public WebDriver driver;
    public Helpers helpers;

    public PageIndex(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    private By card_Elements = By.xpath("//div[@id=\"app\"]/div/div/div[2]/div/div[1]");//By.xpath("//div[@class=\"card mt-4 top-card\"][1]")
    private By card_Forms = By.xpath("//div[@id=\"app\"]/div/div/div[2]/div/div[2]");




    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void click_card_Elements() {

        helpers.clickBy(card_Elements);
    } //click

    public void click_card_Forms() {

        helpers.clickBy(card_Forms);
    } //click

}
