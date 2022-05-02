package Pages.interactions;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageResizable {

    public WebDriver driver;
    public Helpers helpers;

    public PageResizable(){
        this.driver = SingletonDriver.getWebDriver();
        helpers = new Helpers(driver);
    }

    public By cursor = By.xpath("//div[@id='resizableBoxWithRestriction']/span[@class='react-resizable-handle react-resizable-handle-se']");
    public By div_box= By.xpath("//div[@id='resizableBoxWithRestriction']");
    public void minimo(){
        WebElement element = driver.findElement(cursor);
        helpers.click_drag(element, -50,-50  );
    }
    public void pordebajo(){
        WebElement element = driver.findElement(cursor);
        helpers.click_drag(element, -51,-51  );
    }

    public void dentro_rangoY(){
        WebElement element = driver.findElement(cursor);
        helpers.click_drag(element, 0,100);
    }
    public void dentro_rangoX(){
        WebElement element = driver.findElement(cursor);
        helpers.click_drag(element, 250,0);
    }
    public void maximo(){
        WebElement element = driver.findElement(cursor);
        helpers.click_drag(element, 300, 100);
    }
    public void fuera_rango(){
        WebElement element = driver.findElement(cursor);
        helpers.click_drag(element, 301,101);
    }
    public boolean confirmation_minimo(){
        WebElement div = driver.findElement(div_box);
        String width =div.getCssValue("width");
        String height= div.getCssValue("height");
        System.out.println(width);
        System.out.println(height);
        if(width.equals("150px") && height.equals("150px")){
            return true;
        }
        return false;
    }
    public boolean confirmation_porDebajo(){
        WebElement div = driver.findElement(div_box);
        String width =div.getCssValue("width");
        String height= div.getCssValue("height");
        System.out.println(width);
        System.out.println(height);
        if(width.equals("149px") && height.equals("149px")){
            return true;
        }
        return false;
    }
    public boolean confirmation_dentro_rangoY(){
        WebElement div = driver.findElement(div_box);
        String width =div.getCssValue("width");
        String height= div.getCssValue("height");
        System.out.println(width);
        System.out.println(height);
        if(width.equals("200px") && height.equals("300px")){
            return true;
        }
        return false;
    }
    public boolean confirmation_dentro_rangoX(){
        WebElement div = driver.findElement(div_box);
        String width =div.getCssValue("width");
        String height= div.getCssValue("height");
        System.out.println(width);
        System.out.println(height);
        if(width.equals("450px") && height.equals("200px")){
            return true;
        }
        return false;
    }
    public boolean confirmation_maximo(){
        WebElement element = driver.findElement(div_box);
        int elementWidth = element.getSize().getWidth();
        int elementHeight = element.getSize().getHeight();
        System.out.println(elementHeight);
        System.out.println(elementWidth);
        if(elementWidth == 500 && elementHeight == 300){
            return true;
        }
        return false;
    }
    public Boolean confirmation_fuera_rango(){
        WebElement div = driver.findElement(div_box);
        String width =div.getCssValue("width");
        String height= div.getCssValue("height");
        System.out.println(width);
        System.out.println(height);
        if(width.equals("501px") && height.equals("301px")){
            return true;
        }
        return false;
    }
}
