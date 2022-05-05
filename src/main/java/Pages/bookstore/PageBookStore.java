package page;

import helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBookStore {
    public WebDriver driver;

    public Helpers helpers;

    public PageBookStore(WebDriver driver){
        this.driver=driver;
        helpers=new Helpers(driver);
    }

    //WebElement
    public By libreria = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]");
    public By buscar = By.id("searchBox");




    //Funciones
    public void clickbook(){
        helpers.click(libreria);
    }
    public void findautor(){
        helpers.sendtext(buscar);
    }
    public void findtitle(){
        helpers.buscartitle(buscar);
    }
    public void findeditor(){
        helpers.buscareditor(buscar);

    }
    public void espera(){
        helpers.wait(5);
    }
    public void limpiar(){
        helpers.borrar(buscar);
    }





}
