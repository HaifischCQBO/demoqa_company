package Pages.Demoqa;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_select {

    public WebDriver driver;
    public Helpers helpers;

    public Page_select(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    //elemtos Select
    public By SelectsMenu = By.xpath("//div[4]/div/ul/li[9]");
    public By SelectValue = By.xpath("//*[@id=\"withOptGroup\"]/div/div[1]/div[1]");
    public By SelectOne = By.xpath("//*[@id=\"selectOne\"]");
    public By OldStyleSelectMenu = By.id("oldSelectMenu");
    public By MultiDelectDropDown = By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div");
    public By StandardMultiSelect = By.id("cars");

    //valores
    public By  MultiDeleteOptions = By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[1]/div/div[1]/font/font");
    public void ClickSelect(){
        helpers.ClickAction(SelectsMenu, 900);
    }
    public void SelectValue(){
        helpers.clickBy(SelectValue);
    }
    public void SelectOne(){
        helpers.clickBy(SelectOne);
    }
    public void OldStyleSelectMenu(){
        helpers.clickBy(OldStyleSelectMenu);
        helpers.SelectedOption(OldStyleSelectMenu, "Blue");
    }
    public void MultipleDelectDropDown(){
        helpers.ClickAction(MultiDelectDropDown,600);

    }
    public void StandardMultiSelect(){
        helpers.ClickAction(StandardMultiSelect, 600);
        helpers.SelectedOption(StandardMultiSelect,"Saab");
    }
}
