package Pages.bookstore;

import Helpers.Helpers;
import org.openqa.selenium.By;
import Helpers.SingletonDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_index {
    public WebDriver driver;
    public Helpers helpers;

    public Page_index(WebDriver driver){
        this.driver = SingletonDriver.getWebDriver();
        helpers = new Helpers(driver);
    }

    // WEB ELEMENT // WEB ELEMENT //WEB ELEMENT //WEB ELEMENT //WEB ELEMENT //WEB ELEMENT

    public By cardBookStore = By.xpath("//div[@class='card mt-4 top-card'][6]");

    // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES

    public void clickBookStore(){
        helpers.clickBy(cardBookStore);
    }



}
