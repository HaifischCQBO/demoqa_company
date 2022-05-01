package Helpers;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.Reporter;

import java.util.List;
import java.util.Random;

public class Helpers {
    private static WebDriver driver;

    public Helpers(){
        this.driver = SingletonDriver.getWebDriver();
    }
    public Helpers(WebDriver driver){
        this.driver = driver;
    }

    public String getXMLParameter(String key){
        return Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter(key);
    }

    public void getURL(String url) {
        Print("Se ingresa a la URL:" + url);
        driver.get(url);
    }
    public void Print(String texto){
        System.out.println(texto);
    }
    public void clickBy(By by){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(by)).click();
        Print("Se realiza Click a Elemento: "+  by);
    }
    public void clickWebelement(WebElement Elemento){
        Elemento.click();
        Print("Se realiza Click a Elemento:"+ Elemento);
    }
    public void SendText(By by, String text){
        WebElement elemento = driver.findElement(by);
        elemento.clear();
        elemento.sendKeys(text);
        Print("Se envia texto:"+ text + " al elemento: "+ by);
    }
    public String getText(By by) {
        String text = driver.findElement(by).getText();
        Print("Se Obtiene texto: "+ text + " del elemento: "+ by);
        return text;

    }
    public void Pause(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public String SelectByOptionValue(By by, String value){
    Select select = new Select(driver.findElement(by));
    select.selectByValue(value);
    return  select.getFirstSelectedOption().getText();
    }
    public String SelectByVisibleText(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
        return  select.getFirstSelectedOption().getText();
    }
    public String SelectByIndex(By by, int index){
        Select select = new Select(driver.findElement(by));
        select. selectByIndex(index);
        return  select.getFirstSelectedOption().getText();
    }
    public String SelectByIndex(By by){
        Random r = new Random();
        Select select = new Select(driver.findElement(by));
        int option_number = select.getOptions().size();
        int index_option = r.nextInt(option_number-1);
        select. selectByIndex(index_option);
        return  select.getFirstSelectedOption().getText();
    }

    public int GetRandomNumber(int bound){
        return new Random().nextInt(bound);
    }

    public void ejemplos(){
        Actions actions = new Actions(driver);
        //click derecho
        actions.contextClick();
        //double click
        actions.doubleClick();

        WebElement a = driver.findElement(By.xpath("xpath"));
        WebElement b = driver.findElement(By.xpath("xpath"));

        actions.dragAndDrop(a, b);

        new WebDriverWait(driver, 60).until(ExpectedConditions.alertIsPresent()).accept();
        if(a.getAttribute("class").contains("active")){

        }


    }

    /**
     *Esperas Dinamicas:
     * Esperas Explicitas -> Esperas donde EXPLICITAMENTE se aguarda poor un elemento o condicion del mismo
     * Esperas Implicitas -> que al buscar un elemento, este IMPLICITO que tiene que esperar una cantidad de tiempo.
     *
     *
     * Estaticas
     * Pauses -> !!!!!!!! NUNCA SE OCUPA!!!!!!!!!!!
     * **/

    public void ClickAction(By by, int HeightPage){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, "+HeightPage+")");
        clickBy(by);
    }

    public void ValidateAssert(String text, By by){
        if(driver.findElement(by).getText().equals(text)){
            Assert.assertEquals(driver.findElement(by).getText(), text);
            clickBy(by);
        }
    }

    public void ChangeWebElement(By by){
        WebElement valueText = driver.findElement(by);
        ValidateAssert(valueText.getText(), by);
    }

    public void SelectedOption(By by, String options){
        Select opcion = new Select(driver.findElement(by));
        opcion.selectByVisibleText(options);
        Print("la Opcion seleccionada es: "+ options);
    }



}
