package Pages.bookstore;

import Helpers.Helpers;
import org.openqa.selenium.By;
import Helpers.SingletonDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Page_index {
    private List<WebElement> listCategoryCards;
    public WebDriver driver;
    public Helpers helpers;

    public Page_index(WebDriver driver){
        this.driver = SingletonDriver.getWebDriver();
        helpers = new Helpers(driver);
    }

    // WEB ELEMENT // WEB ELEMENT //WEB ELEMENT //WEB ELEMENT //WEB ELEMENT //WEB ELEMENT

    public By cardBookStore = By.xpath("//div[@class='card mt-4 top-card'][6]");
    public By botonElements = By.xpath("//div[@id=\"app\"]/div/div/div[2]/div/div[1]");
    private By card_Elements = By.xpath("//div[@class=\"card mt-4 top-card\"][1]");
    private By card_Forms = By.xpath("//div[@class=\"card mt-4 top-card\"][2]");
    public By categoryCards = By.name("category-cards");


    // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES // FUNCIONES

    public void clickBookStore(){
        helpers.clickElement(cardBookStore);
    }

    public void click_btnElements(){helpers.clickElement(botonElements);}

    public void click_card_Elements() {

        helpers.clickElement(card_Elements);
    } //click

    public void click_card_Forms() {

        helpers.clickElement(card_Forms);
    } //click


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
