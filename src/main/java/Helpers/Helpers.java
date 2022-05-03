package Helpers;

import com.github.javafaker.Faker;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import java.util.ArrayList;
import javax.swing.*;
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
    public void clickElement(By by){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(by)).click();
        Print("Se realiza Click a Elemento:"+ by);
    }
    public void clickElement(WebElement WebElement){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(WebElement)).click();
        Print("Se realiza Click a Elemento:"+ WebElement);
    }

    public void rightClick(By by) {
        Actions clickDerecho = new Actions(driver);
        clickDerecho.contextClick();
    }

    public void double_clickBy(WebElement element){
        Actions actions =  new Actions(driver);
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
        actions.doubleClick(element).perform();
        Print("Se realiza Click a Elemento:"+ element);
    }
    public void double_clickBy(By by){
        Actions actions =  new Actions(driver);
        WebElement element= new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(by));
        actions.doubleClick(element).perform();
        Print("Se realiza Click a Elemento:"+ element);
    }

    public WebElement returnWebElement(By by){
        WebElement elemento = new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(by));
        return elemento;

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
    //Este método permite manipular el zoom de la página(@Autor: Jhon Sebastian Ramos Muñoz)
    public void zoomPage(double factor){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = "+factor+"");
    }

    public void focoPage(){
        String rutaAntigua = driver.getCurrentUrl();
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window(tabs.get(1).toString());
        String rutaNueva = driver.getCurrentUrl();
        if (rutaAntigua.equals(rutaNueva)){
            System.out.println("ERROR...");
        }else{
            System.out.println("Navegacion OK...");
        }
        System.out.println(rutaNueva);
    }
    public void SendText(By by, String text){
        // Espera dinamica
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        // ----------------------------------------------------
        WebElement elemento = driver.findElement(by);
        // ir al elemento (scroll)
        goToElement(elemento);
        // ----------------------------------------------------
        elemento.clear();
        elemento.sendKeys(text);
        Print("Se envia texto:"+ text + " al elemento: "+ by);
    }
    //Este método se usa para enviar el path de un archivo
    public void SendFile(By by, String text){
        // Espera dinamica
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        // ----------------------------------------------------
        WebElement elemento = driver.findElement(by);
        // ir al elemento (scroll)
        elemento.sendKeys(text);
        Print("Se envia archivo:"+ text + " al elemento: "+ by);
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

    public void PauseMilisegundos(long millis) {
        try {
            Thread.sleep(millis);
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
        select. selectByIndex(index_option);
        return  select.getFirstSelectedOption().getText();

    }



    public int GetRandomNumber(int bound){
        return new Random().nextInt(bound);
    }

    public void scrolls(int Up, int Down){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo("+Up+", "+Down+")");
    }
    //Este método captura lo contenido en el atributo "value" del elemento(@Autor: Jhon Sebastian Ramos Muñoz)
    public String getValue(By by) {
        String value = driver.findElement(by).getAttribute("value");
        Print("Se Obtiene value: " + value + " del elemento: " + by);
        return value;
    }
    public void goToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    //Este método permite realizar un scroll descendente dentro de la página(@Autor: Jhon Sebastian Ramos Muñoz)
    public void scrollDown(int distance){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, "+distance+")");
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
        clickElement(by);
    }

    public void ValidateAssert(String text, By by){
        if(driver.findElement(by).getText().equals(text)){
            Assert.assertEquals(driver.findElement(by).getText(), text);
            clickElement(by);
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
