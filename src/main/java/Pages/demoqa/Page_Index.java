package Pages.Demoqa;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page_index {
    public WebDriver driver;
    public Helpers helpers;

    public Page_index(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }
    public By card_widgets = By.xpath("//div[4]");


    public void ClickedCard(){
        helpers.ClickAction(card_widgets,600);
    }


}