package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.bookstore.Page_bookdescription;
import Pages.bookstore.Page_login;
import Pages.bookstore.Page_perfil;
import Pages.bookstore.Pages_books;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TCaseBookStore extends BaseClass {

   /** @Test
   public void test_case(){

       Helpers helpers = new Helpers(driver);
       helpers.getURL("https://demoqa.com/");
       //helpers.getURL(helpers.getXMLParameter("url"));
       Page_index page_index = new Page_index(driver);
       page_index.clickBookStore();

    }**/


    /**TEST CASE 3**/
    @Test
    public void test_double_click_add(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/login");
        //Nos logueamos
        Page_login page_login = new Page_login();
        page_login.formLogin();
        page_login.click_buttom_login();
        //
        //guardamos los libros que ya estan en nuestro perfil y nos vamos a la tienda
        Page_perfil page_perfil = new Page_perfil();
        List<String> list = new ArrayList<>();
        list = page_perfil.List_title();
        helpers.Pause(10);
        helpers.scrollDown();
        page_perfil.click_back_button();
        //Seleccionamos el libro que queremos añadir ya verificado que no esta repetido
        Pages_books pages_books = new Pages_books();
        helpers.Pause(10);
        helpers.scrollDown();
        pages_books.selectBook(list);
        //Hacemos doble click a añadir el libro a coleccion
        Page_bookdescription page_bookdescription = new Page_bookdescription();
        helpers.Pause(10);
        helpers.scrollDown();
        page_bookdescription.double_click_add();
        Assert.assertTrue(page_bookdescription.alert_confirmation(), "an error occurred");
        Assert.assertTrue(page_bookdescription.alert_error(), "an error occurred");
    }

    /**TEST CASE 4**/
    @Test
    public void test_add_book(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/login");
        //Nos logueamos
        Page_login page_login = new Page_login();
        page_login.formLogin();
        page_login.click_buttom_login();
        //guardamos los libros que ya estan en nuestro perfil y nos vamos a la tienda
        Page_perfil page_perfil = new Page_perfil();
        List<String> list = new ArrayList<>();
        list = page_perfil.List_title();
        helpers.Pause(10);
        helpers.scrollDown();
        page_perfil.click_back_button();
        //Seleccionamos el libro que queremos añadir ya verificado que no esta repetido
        Pages_books pages_books = new Pages_books();
        helpers.Pause(10);
        helpers.scrollDown();
        pages_books.selectBook(list);
        //Añadimos el libro
        Page_bookdescription page_bookdescription = new Page_bookdescription();
        helpers.Pause(10);
        helpers.scrollDown();
        page_bookdescription.click_button_add();
        Assert.assertTrue(page_bookdescription.alert_confirmation(), "The book could not be added");
    }

    /**TEST CASE 9**/
    @Test
    public void confirmation(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/books");
        Pages_books pages_books = new Pages_books();
        helpers.scrollDown();
        String title = pages_books.selectBookConfirmation();
        Page_bookdescription page_bookdescription = new Page_bookdescription();
        helpers.Pause(5);
        Assert.assertTrue(page_bookdescription.confirmation(title),
                "Something is not right, El titulo del libro seleccionado no conciden");
    }
}
