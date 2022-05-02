package paginas;

import helper.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageIndex {

    public WebDriver  driver;
    public Helpers helpers;

    public PageIndex(WebDriver driver){
        this.driver=driver;
        helpers = new Helpers(driver);
    }


    //WEBELEMENTOS
    public  By bookstore = By.xpath("//*['app']/div/div/div[2]/div/div[6]");
    public By barra_busqueda = By.id("searchBox");
    public By Login_acceso = By.id("login");
    public By usuario = By.id("userName");
    public By passwords = By.id("password");
    public By boton = By.id("login");


    //FUNCIONAES


    public void selecciona_biblioteca(){
        helpers.clickby(bookstore);
        helpers.wait(10);
    }
    public void findautor(){
        helpers.busqueda_por_autor(barra_busqueda);
        helpers.wait(5);
        helpers.borrar(barra_busqueda);
    }
    public void findtitulo(){
helpers.busqueda_por_titulo(barra_busqueda);
        helpers.wait(5);
        helpers.borrar(barra_busqueda);
    }
    public void findpublicador(){
        helpers.busqueda_por_publicador(barra_busqueda);
        helpers.wait(3);
    }
    public void limpiar(){
        helpers.borrar(barra_busqueda);
    }
    public void LoginInicial(){
        helpers.clickby(Login_acceso);
    }
    public void nombre_de_usuario(){
        helpers.Sendtexto(usuario);
    }
    public void contrasena(){
        helpers.id_password(passwords);
        helpers.wait(10);
    }
    public void buton(){
        helpers.clickby(boton);
    }



}
