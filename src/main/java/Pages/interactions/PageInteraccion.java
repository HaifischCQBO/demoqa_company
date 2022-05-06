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

    public By ir_a_selectable = By.xpath("//div[5]/div/ul/li[2]");

    public By cras = By.xpath("//*[@id=\"verticalListContainer\"]/li[1]");
    public By dapibus = By.xpath("//*[@id=\"verticalListContainer\"]/li[2]");

    private By morbi = By.xpath("//*[@id=\"verticalListContainer\"]/li[3]");

    public By porta = By.xpath("//*[@id=\"verticalListContainer\"]/li[4]");

    public By grid = By.xpath("//*[@id=\"demo-tab-grid\"]");

    public By gridd = By.xpath("//*[@id=\"row1\"]/li[1]");


    //metodos

    public void clickinteraccione(){

        helpers.click(select_interacciones);
    }
    public void click_selectable(){
        helpers.click(ir_a_selectable);
    }

    public void espera(){
        helpers.wait(10);
    }

    public void bajar(){
        helpers.desplazarhaciabajo();
    }

public void seleccionar(){
        helpers.click(cras);
        helpers.click(dapibus);
        helpers.click(morbi);
        helpers.click(porta);
}
public void clickgrid(){
        helpers.click(grid);
        helpers.click(gridd);
}
}
