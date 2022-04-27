package Pages.Blazedemo;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Index {

    public WebDriver driver;
    public Helpers helpers;

    public Page_Index(WebDriver driver) {
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */

    // private By elements_div = By.xpath("//div[@id=\\\"app\\\"]/div/div/div[2]/div/div[2]");
        private By elements_div = By.xpath("//div[@id=\"app\"]/div/div/div[2]/div/div[1]");
    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void click_elements_div() {
        helpers.clickBy(elements_div);
        //driver.findElement(elements_div).click();
    }
}