package Tests;

import org.testng.annotations.Test;

import Baseclass.BaseClass;
import Helpers.Helpers;
import pages.Page_Elements;
import pages.Page_Index;
import pages.Page_broken;
import pages.Page_text_box;


public class Test_POM  extends BaseClass{

    @Test
 public void Test_broken_links () {
     Helpers helpers = new Helpers(driver);
     helpers.getURL(helpers.getXMLParameter("url"));

     // En la pagina del index seleccionamos la opcion elements
        Page_Index page_Index = new Page_Index(driver);
        page_Index.clickElements();

     // En la pagina elements damos click en la opcion Broken links
         Page_Elements page_Elements = new Page_Elements(driver);
         Page_Elements.click_Broken_Links();

    // En la pagina broken damos click en el valid link
         Page_broken page_of_broken = new Page_broken(driver);
         page_of_broken.click_valid_button();

    // Como nos direcciona a la pagina index, nuevamente seleccionamos la opcion elements
        Page_Index page_Index = new Page_Index(driver);
       // page_Index.click_elements();

    // En la pagina elements seleccionamos la opcion Broken links
        Page_Elements page_Elements = new Page_Elements(driver);
        Page_Elements.click_Broken_Links();

        // En la pagina broken damos click en el broken link
        Page_broken page_broken = new Page_broken(driver);
        page_broken.click_Broken_button();


        // Nuevamente en la pagina del index seleccionamos la opcion elements
        Page_Index page_Index = new Page_Index(driver);
      //  page_Index.click_elements();


        // En la pagina elements damos click en la opcion Broken links
        Page_Elements page_Elements = new Page_Elements(driver);
        Page_Elements.click_Broken_Links();

        // En la pagina broken damos click en la imagen
        Page_broken page_broken_images = new Page_broken_images(driver);
        page_broken.click_image();

    }


 @Test
 public void Test2_text_box () {
     Helpers helpers = new Helpers(driver);
     helpers.getURL(helpers.getXMLParameter("url"));

     // En la pagina del index seleccionamos la opcion elements
         Page_Index page_Index = new Page_Index(driver);
         page_Index.clickElements();

     // En la pagina elements seleccionamos la opcion text_box
         Page_Elements page_Elements = new Page_Elements(driver);
         page_Elements.click_text_box();

     //En esta seccion diligenciamos formulario y damos click en el boton submit
        Page_text_box page_text_box = new Page_text_box(driver);
        Page_text_box.click_botton_submit();


 }   
}
