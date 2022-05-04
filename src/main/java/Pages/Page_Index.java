package Pages;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import interfaces.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Page_Index implements Page {
    private final String URL = URL_INDEX;
    private List<WebElement> listCategoryCards;
    public WebDriver driver;
    public Helpers helpers;

    public Page_Index(WebDriver driver){
        this.driver = driver;
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
    public By card_widgets = By.xpath("//div[4]");
    public By card_body_button = By.xpath("//div[@class='card_body']");
    public By hover_me_to_see = By.xpath("//input[@id='toolTipButton']");

    public void ClickedCard(){
        helpers.ClickAction(card_widgets,600);
    }

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
