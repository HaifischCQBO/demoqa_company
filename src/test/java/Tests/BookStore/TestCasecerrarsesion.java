package Tests.BookStore;

import Helpers.Helpers;
import Pages.bookstore.Page_cerrarsesion;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCasecerrarsesion {
    @Test
    public void Test_bookStoreApplication() {
        WebDriver driver = null;
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/login");

        // Ingresamos desde la pagina principal a la seccion BookStoreApplication
        Page_cerrarsesion page_cerrarSesion = new Page_cerrarsesion(driver);
        page_cerrarSesion.clickbuttoncerrarsesion();

    }
}
