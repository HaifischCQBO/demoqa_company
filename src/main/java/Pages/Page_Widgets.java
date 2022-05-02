package Pages;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Page_Widgets {

    public WebDriver driver;
    public Helpers helpers;

    public Page_Widgets(){
        driver = SingletonDriver.getWebDriver();
        helpers = new Helpers(driver);
    }

    public By accordian = By.xpath("//div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[1]");



    private List<WebElement> getCategoryCards(){
        List<WebElement> categoryCards = driver.findElements(By.xpath("//div[contains(@class,'category-cards')]/div"));
        System.out.println(categoryCards);
        return categoryCards;
    }

}
