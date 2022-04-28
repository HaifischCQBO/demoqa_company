package Pages.demoqa.elements;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PageIndex {
    public WebDriver driver;
    public Helpers helpers;

    public PageIndex(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
        JavascriptExecutor js = (JavascriptExecutor) this.driver; // scroll down
        js.executeScript("window.scrollBy(0,500)"); // scroll down

    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By elements_div = By.xpath("//div[@class=\"card mt-4 top-card\"][1]");





    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */
    public void click_elements_div(){
        helpers.clickBy(elements_div);
        //driver.findElement(find_flights_button).click();
    }
}
