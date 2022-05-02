package Pages.bookstore;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import org.openqa.selenium.*;

import java.util.List;

public class Pages_books {
    public WebDriver driver;
    public Helpers helpers;

    public Pages_books(){
        this.driver= SingletonDriver.getWebDriver();
        helpers = new Helpers(driver);
    }

    // WEB ELEMENT // WEB ELEMENT //WEB ELEMENT //WEB ELEMENT //WEB ELEMENT //WEB ELEMENT

    public By html = By.tagName("html");
    // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES

    public void selectBook(List<String> list) {
        List<WebElement> books = driver.findElements(By.xpath("//div[@class='action-buttons']/span/a"));
        int index = books.size();
        System.out.println(index);
        int select = helpers.GetRandomNumber(index-1);
        String title = books.get(select).getText();
        if( list.contains(title)){
            select = helpers.GetRandomNumber(index-1);
            title = books.get(select).getText();
        }
        books.get(select).click();
    }

    public String selectBookConfirmation() {
        List<WebElement> books = driver.findElements(By.xpath("//div[@class='action-buttons']/span/a"));
        int index = books.size();
        System.out.println(index);
        int select = helpers.GetRandomNumber(index-1);
        String title= books.get(select).getText();
        books.get(select).click();
        return title;
    }

}
