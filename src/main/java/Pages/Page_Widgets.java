package Pages;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Page_Widgets implements Page {

    private final String URL = URL_INDEX + "widgets";
    public WebDriver driver;
    public Helpers helpers;

    public Page_Widgets(WebDriver driver){
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    /**Web elements
     *
     * */
    public By accordian = By.xpath("//div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[1]");
    public By card_body_button = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");

    /**Functions
     *
     * */

    public void click_widgets(){
        helpers.scrollDown(500);
        helpers.clickBy(card_body_button);
    }


    private List<WebElement> getCategoryCards(){
        List<WebElement> categoryCards = driver.findElements(By.xpath("//div[contains(@class,'category-cards')]/div"));
        System.out.println(categoryCards);
        return categoryCards;
    }


    @Override
    public String getUrl() {
        return this.URL;
    }
}
