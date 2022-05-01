package Pages.Demoqa;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pages_Alerts_Frame&Windows {

    public WebDriver driver;
    public Helpers helpers;

    public Page_Index(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }



    public By card_body_button = By.xpath("//div[@class='card_body']");
}
