package Pages.Widgets;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    public By opcion1Item2 = By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[1]/a");
    public By opcion2Item2 = By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[2]/a");
    public By opcion3Item2 = By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a");

    public By sublistaOne = By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]/a");
    public By sublistaDos = By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[2]/a");
    public By item_menu3 = By.xpath("//*[@id=\"nav\"]/li[3]");



    public void ClickedNav(){
        helpers.ClickAction(nav_lef_menu,990);
        helpers.ChangeWebElement(item_menu1);
    }

    public void ClickOptionsItem2(){
        helpers.ChangeWebElement(item_menu2);
        helpers.ChangeWebElement(opcion1Item2);
        helpers.ChangeWebElement(opcion2Item2);
    }

    public void ClickSublista(){
        helpers.ChangeWebElement(opcion3Item2);
        helpers.ChangeWebElement(sublistaOne);
        helpers.ChangeWebElement(sublistaDos);
    }

    public void ClickedNav3(){
        helpers.ChangeWebElement(item_menu3);
    }
}