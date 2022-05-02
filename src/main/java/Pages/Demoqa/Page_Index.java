package Pages.demoqa;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class Page_Index implements Page  {
    private final String URL = Page.URL_INDEX;
    private List<WebElement> listCategoryCards;
    public WebDriver driver;
    public Helpers helpers;


    public Page_Index(){
        driver = SingletonDriver.getWebDriver();
        helpers = new Helpers(driver);
    }

    @Override
    public String getUrl() {
        return this.URL;
    }

    /**
     * WebElements.
     */
    public By categoryCards = By.name("category-cards");

    private List<WebElement> getCategoryCards(){
        List<WebElement> categoryCards = driver.findElements(By.xpath("//div[contains(@class,'category-cards')]/div"));
        System.out.println(categoryCards);
        return categoryCards;
    }

    public WebElement findCategoryCard(int indexCategory){
        if(this.listCategoryCards == null){
            this.listCategoryCards = getCategoryCards();
        }
        if(!this.listCategoryCards.isEmpty()){
            try{
                return this.listCategoryCards.get(indexCategory);
            }catch (IndexOutOfBoundsException e){
                helpers.Print("Indice fuera de rango");
            }
        }
        else{
            helpers.Print("la lista de categoorias Está vacia");
        }
        return null;
    }

}
