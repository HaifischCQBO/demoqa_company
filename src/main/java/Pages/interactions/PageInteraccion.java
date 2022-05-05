package page;

import helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageInteraccion {
    public WebDriver driver;

    public Helpers helpers;

    public PageInteraccion(WebDriver driver){
        this.driver=driver;
        helpers=new Helpers(driver);
    }

    //webelement

    public By select_interacciones = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[1]");
    public By ir_a_selectable = By.xpath("//*[@id='item-1']");


    //metodos

    public void clickinteraccione(){
        helpers.click(select_interacciones);
    }
    public void click_selectable(){
        helpers.click(ir_a_selectable);
    }

    public void espera(){
        helpers.wait(6);
    }

}
