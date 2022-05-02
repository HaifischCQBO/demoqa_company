package test;

import baseclass.Baseclass;
import helper.Helpers;
import org.testng.annotations.Test;
import paginas.PageIndex;
import paginas.PageInteracion;

public class TesTConPom extends Baseclass {

@Test
    public void Prueba(){
    Helpers helpers = new Helpers(driver);
    helpers.getURL("https://demoqa.com/");
    helpers.max();

    PageIndex index = new PageIndex(driver);
    index.selecciona_biblioteca();
    index.findautor();
    index.findtitulo();
    index.findpublicador();
    index.LoginInicial();
    index.nombre_de_usuario();
    index.contrasena();
    index.buton();







    }
}
