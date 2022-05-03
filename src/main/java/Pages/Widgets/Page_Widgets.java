package Pages.Widgets;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Widgets {
    public WebDriver driver;
    public Helpers helpers;

    public Page_Widgets(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**Web elements
     *
     * */
    public By card_body_button = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");

    /**Functions
     *
     * */

    public void click_widgets(){
        helpers.scrollDown(500);
        helpers.clickElement(card_body_button);
    }


}

