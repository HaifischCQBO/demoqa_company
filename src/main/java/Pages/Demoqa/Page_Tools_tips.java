package Pages.Demoqa;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_Tools_tips {

    public  WebDriver driver;
    public Helpers helpers;

    public Page_Tools_tips(){
        driver = SingletonDriver.getWebDriver();
        helpers = new Helpers(driver);
    }

    public By Hover_me_to_see = By.id("toolTipButton");

    public void moveToElementHover_me_to_see()


}
