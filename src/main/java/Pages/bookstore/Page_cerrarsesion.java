package Pages.bookstore;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_cerrarsesion {
    public WebDriver driver;
    public Helpers helpers;

    public Page_cerrarsesion(WebDriver driver) {
        this.driver = driver;
        helpers = new Helpers(driver);
    }
    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebBookStoreApplication // WebBookStoreApplication // WebBookStoreApplication // WebBookStoreApplication//
     * ---------------------------------------------------------------------------------------------------------
     */

    public By buttoncerrarsesion = By.xpath("//button[contains(text(),'Log out')]");

    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funtions // Funtions // Funtions // Funtions // Funtions // Funtions // Funtions // Funtions // Funtions //
     * -----------------------------------------------------------------------------------------------------------
     */

    public void clickbuttoncerrarsesion() {helpers.clickBy(buttoncerrarsesion);
    }
}
