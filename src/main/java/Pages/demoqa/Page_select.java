package Pages.Demoqa;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_select {

    public WebDriver driver;
    public Helpers helpers;

    public Page_select(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    public By SelectsMenu = By.xpath("//div[4]/div/ul/li[9]");

    public void ClickSelect(){
        helpers.ClickAction(SelectsMenu, 900);
    }
}
