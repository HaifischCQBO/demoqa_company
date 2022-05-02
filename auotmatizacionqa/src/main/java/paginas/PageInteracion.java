package paginas;

import helper.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageInteracion {
    public WebDriver driver;
    public Helpers helpers;

    public PageInteracion(WebDriver driver){
        this.driver=driver;
        helpers = new Helpers(driver);
    }
    //Webelementes
    public By interacciones = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]/div/div[1]");


    //funciones
    public void click_interacciones(){
        helpers.clickby(interacciones);
    }


}
