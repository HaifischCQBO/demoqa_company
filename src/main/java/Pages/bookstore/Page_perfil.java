package Pages.bookstore;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

public class Page_perfil {

    public WebDriver driver;
    public Helpers helpers;

    public Page_perfil(){
        this.driver = SingletonDriver.getWebDriver();
        helpers = new Helpers(driver);
    }

    public By back_store_button = By.xpath("//button[@id='gotoStore']");
    public List<String> List_title() {
        List<String> title_book = new ArrayList<>();
        List<WebElement> titles = driver.findElements(By.xpath("//div[@class='action-buttons']/span/a"));
        int size = titles.size();
            for (int i = 0; i < size; i++) {
                title_book.add(titles.get(i).getText());
            }
            return title_book;
    }

    public void click_back_button(){
        helpers.clickElement(back_store_button);
    }
}
