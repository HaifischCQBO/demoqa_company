package Pages.Demoqa;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_menu {
    public WebDriver driver;
    public Helpers helpers;

    public Page_menu (WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    public By nav_lef_menu = By.xpath("//div[4]/div/ul/li[8]");
    public By item_menu1 = By.xpath("//*[@id=\"nav\"]/li[1]");
    public By item_menu2 = By.xpath("//*[@id=\"nav\"]/li[2]");
    public By item_menu3 = By.xpath("//*[@id=\"nav\"]/li[3]");

    public void ClickedNav(){
        helpers.ClickAction(nav_lef_menu,900);
        helpers.clickBy(item_menu1);
        helpers.clickBy(item_menu2);
        helpers.clickBy(item_menu3);
    }
}
