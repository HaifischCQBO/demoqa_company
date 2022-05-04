package Pages;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Page_index {

    public WebDriver driver;
    public Helpers helpers;

    public Page_index(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**
     * ---------------------------------------------------------------------------------------------------------
     *  WebElements // WebElements // WebElements // WebElements // WebElements // WebElements // WebElements //
     * ---------------------------------------------------------------------------------------------------------
     */
    public By category_Cards = By.xpath("//div[@class='category-cards']");
    public By cards = By.cssSelector(".card");
    /**
     * -----------------------------------------------------------------------------------------------------------
     *  Funciones // Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones //  Funciones
     * -----------------------------------------------------------------------------------------------------------
     */
    public void clickElements() {
        WebElement categoryCard = driver.findElement(category_Cards);
        List<WebElement> cardsElements = categoryCard.findElements(cards);
        WebElement elements = cardsElements.get(0);
        helpers.clickWebElementByJs(elements);
    }

}
