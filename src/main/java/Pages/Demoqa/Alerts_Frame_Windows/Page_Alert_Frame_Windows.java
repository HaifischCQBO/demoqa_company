package Pages.Demoqa.Alerts_Frame_Windows;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_Alert_Frame_Windows {

    public WebDriver driver;
    public Helpers helpers;


    public Page_Alert_Frame_Windows(WebDriver driver){

        this.driver = driver;
        helpers = new Helpers(driver);





    }
    public  By card_body_button = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    public void clickAlert_Frame_Windows() {
        helpers.clickBy(card_body_button);
    }
}
