package Tests.BookStore;

import Helpers.Helpers;
import Pages.bookstore.Page_register;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCaseregister {

    @Test
    public void Test_bookStoreApplication() {
        WebDriver driver = null;
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/register");

        // Ingresamos desde la pagina principal a la seccion BookStoreApplication
        Page_register page_register = new Page_register(driver);
        page_register.formRegister();
        page_register.clickregister();

    }
}
