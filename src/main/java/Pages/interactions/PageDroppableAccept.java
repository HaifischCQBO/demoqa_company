package Pages.interactions;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Helpers.SingletonDriver;

public class PageDroppableAccept {
    public WebDriver driver;
    public Helpers helpers;

    public PageDroppableAccept(){
        this.driver = SingletonDriver.getWebDriver();
        helpers = new Helpers(driver);
    }

    public By Acceptable =By.xpath("//div[@id='revertable']");
    public By section = By.xpath("//a[@id='droppableExample-tab-revertable']");
    public By dropp = By.xpath("//div[@id='revertableDropContainer']//div[@id='droppable']");
    public  By notacceptable = By.xpath("//div[@id='notRevertable']");

    public void click_section(){
        helpers.clickElement(section);
    }
    public void click_wr(){
        WebElement wr = driver.findElement(Acceptable);
        WebElement d = driver.findElement(dropp);
        helpers.click_drag_element(wr, d);
    }
    public String postionInitialWrX(){
        WebElement wr = driver.findElement(Acceptable);
        String widtht=wr.getCssValue("width");
        return widtht;
    }
    public String postionInitialWrY(){
        WebElement wr = driver.findElement(Acceptable);
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
        WebElement wr = driver.findElement(Acceptable);
        String width =wr.getCssValue("width");
        System.out.println(width + "as");
        String height= wr.getCssValue("height");
        if(d.getAttribute("class").contains("ui-state-highlight") && d.getText().equals("Dropped!")
                && height.equals(positionH) && width.equals(positionW)){
            return true;
        }
        return false;
    }

    public void click_not_revert(){
        WebElement nr = driver.findElement(notacceptable);
        WebElement d = driver.findElement(dropp);
        helpers.click_drag_element(nr, d);
    }

    public String positionInitialNwX() {
        WebElement nr = driver.findElement(notacceptable);
        String widtht = nr.getCssValue("width");
        return widtht;
    }
    public String positionInitialNrY(){
        WebElement nr = driver.findElement(notacceptable);
        String height=nr.getCssValue("height");
        return height;
    }

    public Boolean confirmationNr(String positionx, String positiony){
        WebElement d = driver.findElement(dropp);
        WebElement nr = driver.findElement(notacceptable);
        String width = nr.getCssValue("width");
        String height = nr.getCssValue("height");
        if(d.getAttribute("class").contains("ui-state-highlight") && d.getText().equals("Dropped!")
                && positionx.equals(height) && positiony.equals(width)) {
            return true;
        }
        return false;
    }

    public void click_not_Acceptable() {
    }
}
