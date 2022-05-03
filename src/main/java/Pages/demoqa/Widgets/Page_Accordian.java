package Pages.demoqa.Widgets;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import Pages.demoqa.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class Page_Accordian implements Page {
    private final String URL = Page.URL_INDEX + "accordian";
    public WebDriver driver;
    public Helpers helpers;
    public List<WebElement> cardsAccordian;

    public Page_Accordian (){
        this.driver = SingletonDriver.getWebDriver();
        this.helpers = new Helpers(driver);
    }



    private By accordian = By.id("accordianContainer");

    private List<WebElement> getCardsAccordian() {
        if(this.cardsAccordian == null) {
            try {
                System.out.println(accordian);
                WebElement Accordian = driver.findElement(this.accordian);
                this.cardsAccordian = Accordian.findElements(By.className("card"));
                return this.cardsAccordian;
            }catch (NoSuchElementException e){
                helpers.Print("No se pudieron obtener las cards");
                return null;
            }
        }
        else{
            return this.cardsAccordian;
        }


    }

    public int sizeCardsAccordian(){
        if(getCardsAccordian() != null){
            return getCardsAccordian().size();
        }
        return -1;
    }

    public void clickCardIndex(int index){
        helpers.clickWebelement(getCardsAccordian().get(index));
    }

    public boolean isCardIndexShow(int index){
       if(getCardsAccordian() != null){
           if(!getCardsAccordian().isEmpty()){
               try{
                   getCardsAccordian().get(index).findElement(By.className("show"));
                   return  true; //Si no tira la excepcion es porque lo encontró.
               }catch (NoSuchElementException e){
                   helpers.Print("la carta " + index + " no se está mostrando");
                   return false;
               }

           }
       }
       return false;
    }

    /*
        Verifica que solo la carta de ese indice esté visible.
     */
    public boolean isAllCardsNotShowExceptIndex(int index){
        boolean isValid = true;
        for (int i = 0; i < sizeCardsAccordian(); i++) {
            if(index == i){
                isValid = isCardIndexShow(i)? true: false; //Verifica que efectivamente la carta alojada en ese indice se esté mostrando
            }
            else{
                //se valida que las cartas no se esten mostrando
                if(isCardIndexShow(i)){
                    return false;
                }
            }
        }
        return  isValid;
    }

    @Override
    public String getUrl() {
        return this.URL;
    }
}
