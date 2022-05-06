package test;

import baseclass.BaseClase;
import helpers.Helpers;
import org.testng.annotations.Test;
import page.PageBookStore;

public class TestLibro extends BaseClase {



    @Test

    public void TestBook()  {
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/");
        helpers.max();

        PageBookStore pageBookStore = new PageBookStore(driver);
        pageBookStore.clickbook();
        pageBookStore.espera();
        pageBookStore.findautor();
        pageBookStore.espera();
        pageBookStore.limpiar();
        pageBookStore.findtitle();
        pageBookStore.espera();
        pageBookStore.limpiar();
        pageBookStore.findeditor();
        pageBookStore.espera();




    }

}
