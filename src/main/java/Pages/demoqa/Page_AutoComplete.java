package Pages.demoqa;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Page_AutoComplete implements Page{
    private final String URL = Page.URL_INDEX + "auto-complete";
    public WebDriver driver;
    public Helpers helpers;
    public Page_AutoComplete() {
        this.driver = SingletonDriver.getWebDriver();
        this.helpers = new Helpers(driver);
    }

    public By singleColor = By.xpath("//div[@class='auto-complete__value-container css-1hwfws3']");
    public By multipleColor = By.id("autoCompleteMultipleInput");
    public By listAutoComplete = By.xpath("//div[@class='auto-complete__menu-list auto-complete__menu-list--is-multi css-11unzgr']");

    public By elements_MultipleColorInput = By.xpath("//div[@class='css-1rhbuit-multiValue auto-complete__multi-value']");
    public By label_elements_MultipleColorInput = By.xpath("//div[@class='css-12jo7m5 auto-complete__multi-value__label']");
    public By buttonDeleteMultipleColorInput = By.xpath("//div[@class='auto-complete__indicators css-1wy0on6']");
    public List<WebElement> elements_MultipleColor_ListAutoComplete(){
      List<WebElement> Elements =  driver.findElement(listAutoComplete).findElements(By.xpath("div"));
      return Elements;
    }

    public ArrayList<String> getElements_MultipleColor_List(){
        ArrayList<String> strElements = new ArrayList<String>();
        for (WebElement element: elements_MultipleColor_ListAutoComplete()) {
            strElements.add(element.getText());
        }
        return strElements;
    }

    public Boolean existElement_MultipleColorList(String element){
        return getElements_MultipleColor_List().contains(StringUtils.capitalize(element));
    }

    public int getIndexElementList_MultipleColorList(String element){
        return getElements_MultipleColor_List().indexOf(StringUtils.capitalize(element));
    }

    public void clickElementList_MultipleColor(int index){
        WebElement element = driver.findElement(listAutoComplete).findElements(By.xpath("div")).get(index);
        helpers.clickWebelement(element);
    }

    public List<WebElement> label_elements_MultipleColor_Input(){
        List<WebElement> Elements =  driver.findElements(label_elements_MultipleColorInput);
        return Elements;
    }
    public List<WebElement> elements_MultipleColor_Input(){
        List<WebElement> Elements =  driver.findElements(elements_MultipleColorInput);
        return Elements;
    }

    public ArrayList<String> getLabel_elements_MultipleColorInput(){
        ArrayList<String> strElements = new ArrayList<String>();
        for (WebElement element: label_elements_MultipleColor_Input()) {
            strElements.add(element.getText());
        }
        return  strElements;
    }

    public boolean isElementAdded_MultipleColorInput(String element){
        return  getLabel_elements_MultipleColorInput().contains(StringUtils.capitalize(element));
    }

    public boolean areElementsAdded_MultipleColorInput(String[][] arrElements){
        for (int i = 0; i < arrElements.length; i++) {
            if(!isElementAdded_MultipleColorInput(arrElements[i][1])){
                return false;
            }
        }
        return true;
    }

    public boolean inputHaveCloseBUtton_MultipleColor(){
        try {
            driver.findElement(buttonDeleteMultipleColorInput);
            return  true;
        }catch (NoSuchElementException e){
            return  false;
        }


    }

    public boolean elementsHaveCloseButton_MultipleColor_Input(String[][] arrElements){
        List<WebElement> Listelements = elements_MultipleColor_Input();
        for (int i = 0; i < arrElements.length; i++) {
            try {
             Listelements.get(i).findElement(By.xpath("div[@class='css-xb97g8 auto-complete__multi-value__remove']"));
             if(!Listelements.get(i).findElement(By.xpath("div[@class='css-12jo7m5 auto-complete__multi-value__label']")).getText().equals(StringUtils.capitalize(arrElements[i][1]))){
                 return false; //deben serguir el orden o retorna false.
             }
            }catch (NoSuchElementException e){
                return false; //si no encuentra algun elemento, devuelve false.
            }
        }
        return true;
    }

    public int getSizeElements_MultipleColor_Input(){
        return  elements_MultipleColor_Input().size();
    }

    @Override
    public String getUrl() {
        return this.URL;
    }
}
