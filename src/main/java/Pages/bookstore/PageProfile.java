package page;

import helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageProfile {
    public WebDriver driver;

    public Helpers helpers;

    public PageProfile(WebDriver driver){
        this.driver=driver;
        helpers=new Helpers(driver);
    }

    public By libreria = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]");

    public By cuenta = By.xpath("//div[6]/div/ul/li[3]");

    public By click_login = By.xpath("//*[@id=\"notLoggin-label\"]/a[1]");

    public By usurio = By.id("userName");

    public By password = By.id("password");

    public By Login = By.id("login");

    public By eliminar = By.xpath("//*[@id=\"submit\"]");




    public void clic_book(){
        helpers.click(libreria);
    }

    public void espera(){
        helpers.wait(5);
    }
    public void registro(){
        helpers.click(click_login);
    }

    public void user(){
        helpers.message(usurio, "jsierra");
    }
    public void contrasena(){
        helpers.message(password, "Juliana2022*");
    }
    public void acceso(){
        helpers.click(Login);
    }
    public void clickprofile(){
        helpers.click(cuenta);
    }
    public void bajar(){
        helpers.desplazarhaciabajo();
    }

    public void eliminarcta(){
        helpers.click(eliminar);
    }

}
