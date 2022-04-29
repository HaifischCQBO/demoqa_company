package pages.demoqa;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Page_Elements_Links {

    public WebDriver driver;
    public Helpers helpers;

    public Page_Elements_Links(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By select_link_home = By.id("simpleLink");
    public By Select_link_homeFWDZo = By.id("dynamicLink");
    public By Select_Link_created = By.id("created");
    public By api_response = By.id("linkResponse");
    public By Select_Link_nocontent = By.id("no-content");
    public By Select_Link_moved = By.id("moved");
    public By Select_Link_badrequest = By.id("bad-request");
    public By Select_Link_unauthorized = By.id("unauthorized");
    public By Select_Link_forbidden = By.id("forbidden");
    public By Select_Link_notfound = By.id("invalid-url");






    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */

    public void click_link_home(){
        helpers.clickBy(select_link_home);
        helpers.focoPage();
        //driver.findElement(find_flights_button).click();
    }
    public void click_link_homefwdzo(){
        helpers.clickBy(Select_link_homeFWDZo);
        helpers.focoPage();
        //driver.findElement(find_flights_button).click();
    }
    public void click_link_created(){
        helpers.clickBy(Select_Link_created);

    }
    public String  message_confirmation_created(){
        return helpers.getText(api_response);
    }
    public void click_link_nocontent(){
        helpers.clickBy(Select_Link_nocontent);

    }
    public String  message_confirmation_nocontent(){
        return helpers.getText(api_response);
    }
    public void click_link_moved(){
        helpers.clickBy(Select_Link_moved);

    }
    public String  message_confirmation_moved(){
        return helpers.getText(api_response);
    }
    public void click_link_badrequest(){
        helpers.clickBy(Select_Link_badrequest);

    }
    public String  message_confirmation_badrequest(){
        return helpers.getText(api_response);
    }
    public void click_link_unauthorized(){
        helpers.clickBy(Select_Link_unauthorized);

    }
    public String  message_confirmation_unauthorized(){
        return helpers.getText(api_response);
    }
    public void click_link_forbidden(){
        helpers.clickBy(Select_Link_forbidden);

    }
    public String  message_confirmation_forbidden(){
        return helpers.getText(api_response);
    }
    public void click_link_notfound(){
        helpers.clickBy(Select_Link_notfound);

    }
    public String  message_confirmation_notfound(){
        return helpers.getText(api_response);
    }


}