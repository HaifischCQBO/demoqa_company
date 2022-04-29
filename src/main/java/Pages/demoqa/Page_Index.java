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
    public By card_widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    public By nav_lef_menu = By.id("item-7");
    public By nav = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[8]");
    public void ClickedCard(){
        helpers.ClickAction(card_widgets,400);
    }
    public void ClickedNav(){
       helpers.ClickAction(nav,700);
    }

}
