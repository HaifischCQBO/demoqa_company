package Pages.Elements;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
    private By DynamicsProperties_button = By.xpath("//li[@id=\"item-8\"]");
    private By will_enable_button = By.xpath("//button[@id=\"enableAfter\"]");
    private By color_change_button = By.xpath("//button[@id=\"colorChange\"]");
    private By visible_After_button = By.xpath("//button[@id=\"visibleAfter\"] ");


    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void click_DynamicsProperties_button() {

        helpers.clickBy(DynamicsProperties_button);
    }

    public void wait_seconds(int seconds){
        helpers.Pause(seconds);
        System.out.println("Han pasado "+seconds+ " segundos");
    }
    public String getTextVisibleButton(){

        helpers.goToElement(driver.findElement(visible_After_button));

        return helpers.getValue(visible_After_button);
    }

    public boolean DynamicsP_confirmation(){
        boolean present;

        try{
            driver.findElement(visible_After_button);
            present = true;
        }catch(NoSuchElementException e){
            present = false;
        }
        return present;
    }


}
