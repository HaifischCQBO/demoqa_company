package Pages.Widgets;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import interfaces.Page;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Page_AutoComplete implements Page {
    private final String URL = Page.URL_INDEX + "auto-complete";
    public WebDriver driver;
    public Helpers helpers;
    public Page_AutoComplete() {
        this.driver = SingletonDriver.getWebDriver();
        this.helpers = new Helpers(driver);
    }

    public By singleColor = By.id("autoCompleteSingleInput");
    public By multipleColor = By.id("autoCompleteMultipleInput");
    public By listAutoCompleteMultipleC = By.xpath("//div[@class='auto-complete__menu-list auto-complete__menu-list--is-multi css-11unzgr']");
    public By listAutoCompleteMonoC = By.xpath("//div[@class='auto-complete__menu-list css-11unzgr']");

    public By elements_MultipleColorInput = By.xpath("//div[@class='css-1rhbuit-multiValue auto-complete__multi-value']");
    public By element_SingleColorInput = By.xpath("//div[@class='auto-complete__single-value css-1uccc91-singleValue']");

    public By label_elements_MultipleColorInput = By.xpath("//div[@class='css-12jo7m5 auto-complete__multi-value__label']");
    public By buttonDeleteMultipleColorInput = By.xpath("//div[@class='auto-complete__indicators css-1wy0on6']");
    public List<WebElement> elements_ListAutoComplete(By list){
      List<WebElement> Elements =  driver.findElement(list).findElements(By.xpath("div"));
      return Elements;
    }

    public ArrayList<String> getElements_ListAutoComplete(By list){
        ArrayList<String> strElements = new ArrayList<String>();
        for (WebElement element: elements_ListAutoComplete(list)) {
            strElements.add(element.getText());
        }
        return strElements;
    }

    public Boolean existElement_ListAutoComplete(String element,By list){
        return getElements_ListAutoComplete(list).contains(StringUtils.capitalize(element));
    }


    public int getIndexElement_ListAutoComplete(String element, By list){
        return getElements_ListAutoComplete(list).indexOf(StringUtils.capitalize(element));
    }

    public void clickElement_ListAutoComplete(int index, By list){
        WebElement element = driver.findElement(list).findElements(By.xpath("div")).get(index);
        helpers.clickWebelement(element);
    }

    public List<WebElement> label_elements_Input(By label_input){
        List<WebElement> Elements =  driver.findElements(label_input);
        return Elements;
    }
    public List<WebElement> elements_Input(By input){
        List<WebElement> Elements =  driver.findElements(input);
        return Elements;
    }

    public ArrayList<String> getLabel_elements_Input(By label){
        ArrayList<String> strElements = new ArrayList<String>();
        for (WebElement element: label_elements_Input(label)) {
            strElements.add(element.getText());
        }
        return  strElements;
    }

    public boolean isElementAdded_Label(String element, By label){

        return  getLabel_elements_Input(label).contains(StringUtils.capitalize(element));
    }

    public boolean areElementsAdded_Input(String[][] arrElements, By label){
        for (int i = 0; i < arrElements.length; i++) {
            if(!isElementAdded_Label(arrElements[i][1], label)){
                return false;
            }
        }
        return true;
    }

    public boolean inputHaveCloseButton_MultipleColor(){
        try {
            driver.findElement(buttonDeleteMultipleColorInput);
            return  true;
        }catch (NoSuchElementException e){
            return  false;
        }
    }


    public boolean elementsHaveCloseButton_Input(String[][] arrElements, By elementsInput){
        List<WebElement> Listelements = elements_Input(elementsInput);

        for (int i = 0; i < arrElements.length; i++) {
            try {
             Listelements.get(i).findElement(By.xpath("div[@class='css-xb97g8 auto-complete__multi-value__remove']"));
             if(!Listelements.get(i).findElement(By.xpath("div[@class='css-12jo7m5 auto-complete__multi-value__label']")).getText().equals(StringUtils.capitalize(arrElements[i][1]))){
                helpers.Print(arrElements[i][1]);
                 return false; //deben serguir el orden o retorna false.
             }
            }catch (NoSuchElementException e){
                helpers.Print("auxilio");
                return false; //si no encuentra algun elemento, devuelve false.
            }
        }
        return true;
    }

    public WebElement getCloseButtonElement_MultipleColor_Input(String element, By input){
        List<WebElement> Listelements = elements_Input(input);
        WebElement btnClose;
        for (int i = 0; i < Listelements.size(); i++) {
            try {
                btnClose = Listelements.get(i).findElement(By.xpath("div[@class='css-xb97g8 auto-complete__multi-value__remove']"));
                if(Listelements.get(i).findElement(By.xpath("div[@class='css-12jo7m5 auto-complete__multi-value__label']")).getText().equals(StringUtils.capitalize(element))){
                    return  btnClose; //deben serguir el orden o retorna false.
                }
            }catch (NoSuchElementException e){
                return null; //si no encuentra algun elemento, devuelve false.
            }
        }
        return null;
    }


    public int getSizeElements_Input(By elementsInput){
        return  elements_Input(elementsInput).size();
    }



    @Override
    public String getUrl() {
        return this.URL;
    }
}
