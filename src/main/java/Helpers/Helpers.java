package Helpers;

import com.github.javafaker.Faker;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Reporter;

import javax.swing.*;
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
        Print("Se realiza Click a Elemento:"+ by);
    }
    public void double_clickBy(WebElement element){
        Actions actions =  new Actions(driver);
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
        actions.doubleClick(element).perform();
        Print("Se realiza Click a Elemento:"+ element);
    }

    public void click_drag(WebElement element, int x, int y){
        Actions actions = new Actions(driver);
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
        actions.dragAndDropBy(element,x,y).build().perform();
    }
    public void click_drag_element(WebElement element, WebElement target){
        Actions actions = new Actions(driver);
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
        actions.dragAndDrop(element, target).build().perform();
    }
    public void zoom(){
        WebElement zoomPage = driver.findElement(By.tagName("html"));
        zoomPage.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
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
    public String returnFullAdress(){
        Faker f = new Faker();
        String street =f.address().streetAddress();
        String appartment= f.address().secondaryAddress();
        String address = street + " " + appartment;

        return address;
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
        System.out.println(select);
        int option_number = select.getOptions().size();
        int index_option = r.nextInt(option_number-1);
        //size: 1,2,3,4,5
        //index: 0,1,2,3,4
        select.selectByIndex(index_option);
        return  select.getFirstSelectedOption().getText();

    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,500)");
    }

    public int GetRandomNumber(int bound){
        return new Random().nextInt(bound);
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






}
