package Pages.interactions;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Helpers.SingletonDriver;

public class PageDroppableSimple {
    public WebDriver driver;
    public Helpers helpers;

    public PageDroppableSimple(){
        this.driver = SingletonDriver.getWebDriver();
        helpers = new Helpers(driver);
    }
    public By Drag_Me =By.xpath("//div[@id='draggable']");
    public By section = By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']");
    public By dropp = By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']");

    public void click_section(){
        helpers.clickElement(section);
    }
    public void click_wr(){
        WebElement wr = driver.findElement(Drag_Me);
        WebElement d = driver.findElement(dropp);
        helpers.click_Drag_Me(wr, d);
    }
    public String postionInitialWrX(){
        WebElement wr = driver.findElement(Drag_Me);
        String widtht=wr.getCssValue("width");
        return widtht;
    }
    public String postionInitialWrY(){
        WebElement wr = driver.findElement(Drag_Me);
        String height=wr.getCssValue("height");
        return height;
    }

    public Boolean confirmation_color(){
        WebElement d = driver.findElement(dropp);
        if(d.getAttribute("class").contains("ui-active")){
            return true;
        }
        return false;
    }
    public Boolean confirmation_wr(String positionW, String positionH){
        WebElement d = driver.findElement(dropp);
        WebElement wr = driver.findElement(Drag_Me);
        String width =wr.getCssValue("width");
        System.out.println(width + "as");
        String height= wr.getCssValue("height");
        if(d.getAttribute("class").contains("ui-state-highlight") && d.getText().equals("Dropped!")
                && height.equals(positionH) && width.equals(positionW)){
            return true;
        }
        return false;
    }
}
