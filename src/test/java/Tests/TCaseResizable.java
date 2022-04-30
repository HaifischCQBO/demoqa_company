package Tests;

import Helpers.Helpers;
import Pages.interactions.PageResizable;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TCaseResizable {

    /**TEST CASE 1**/
    @Test
    public void resizable_minBox1(){
        Helpers helpers = new Helpers();
        PageResizable pageResizable = new PageResizable();
        helpers.getURL("https://demoqa.com/resizable");
        pageResizable.minimo();
        Assert.assertTrue(pageResizable.confirmation_minimo(), "Error");
    }
    /**TEST CASE 2**/
    @Test
    public void rasizable_pordebajo(){
        Helpers helpers = new Helpers();
        PageResizable pageResizable = new PageResizable();
        helpers.getURL("https://demoqa.com/resizable");
        pageResizable.pordebajo();
        Assert.assertFalse(pageResizable.confirmation_porDebajo(), "Error");
    }
    /**TEST CASE 3**/
    @Test
    public void rasizable_rangoY(){
        Helpers helpers = new Helpers();
        PageResizable pageResizable = new PageResizable();
        helpers.getURL("https://demoqa.com/resizable");
        pageResizable.dentro_rangoY();
        Assert.assertTrue(pageResizable.confirmation_dentro_rangoY(), "Error");
    }
    /**TEST CASE 4**/
    @Test
    public void rasizable_rangoX(){
        Helpers helpers = new Helpers();
        PageResizable pageResizable = new PageResizable();
        helpers.getURL("https://demoqa.com/resizable");
        pageResizable.dentro_rangoX();
        Assert.assertTrue(pageResizable.confirmation_dentro_rangoX(), "Error");
    }
    /**TEST CASE 5**/
    @Test
    public void resizable_maximo(){
        Helpers helpers = new Helpers();
        PageResizable pageResizable = new PageResizable();
        helpers.getURL("https://demoqa.com/resizable");
        pageResizable.maximo();
        Assert.assertTrue(pageResizable.confirmation_maximo(), "Error");
    }
    @Test
    public void rasizable_fuera_rango(){
        Helpers helpers = new Helpers();
        PageResizable pageResizable = new PageResizable();
        helpers.getURL("https://demoqa.com/resizable");
        pageResizable.fuera_rango();
        Assert.assertFalse(pageResizable.confirmation_fuera_rango(), "Error");
    }

}
