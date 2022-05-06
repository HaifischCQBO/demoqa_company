package Pages.interactions;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Page_Resizable_box2 {
    public WebDriver driver;
    public Helpers helpers;

    public Page_Resizable_box2(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    public By select_resizable = By.xpath("//div[5]/div/ul/li[3]");
    public By cursor = By.xpath("//*[@id=\"resizable\"]/span");
    public By div_box= By.xpath("//div[@id='resizable']");

    public void click_resizable(){
        helpers.clickElement(select_resizable);
    }

    public void redimensionar() {
        helpers.scrollDown(500);
        WebElement element = driver.findElement(cursor);
        helpers.click_drag(element, 100, 100);
    }
    public boolean confirmation_redimension(){
        WebElement div = driver.findElement(div_box);
        String width = div.getCssValue("width");
        String height = div.getCssValue("height");
        System.out.println(width);
        System.out.println(height);
        if(width.equals("300px") && height.equals("300px")){
            System.out.println("Medidas requeridas iguales con exito...");
        }
        return false;
    }
}