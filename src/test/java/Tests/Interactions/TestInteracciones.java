package test;

import baseclass.BaseClase;
import helpers.Helpers;
import org.testng.annotations.Test;
import page.PageInteraccion;

public class TestInteracciones extends BaseClase {


   @Test
    public void Testinteracciones(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/");
        helpers.max();

       PageInteraccion pageInteraccion = new PageInteraccion(driver);
       pageInteraccion.clickinteraccione();
       pageInteraccion.espera();
       pageInteraccion.bajar();
       pageInteraccion.click_selectable();
       pageInteraccion.espera();
       pageInteraccion.bajar();
       pageInteraccion.seleccionar();
       pageInteraccion.clickgrid();








    }

    ;
}
