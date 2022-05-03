package Helpers;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.Reporter;

import java.util.Objects;
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
        int option_number = select.getOptions().size();
        int index_option = r.nextInt(option_number-1);
        //size: 1,2,3,4,5
        //index: 0,1,2,3,4
        select.selectByIndex(index_option);
        return  select.getFirstSelectedOption().getText();
    }

    public int GetRandomNumber(int bound){
        return new Random().nextInt(bound);
    }

    /*
        oswaldo
    */

    /**
     * cargar la pagina
     */
    public void loadSite(String siteUrl){
        getURL(siteUrl);
    }

    /**
     * Validar titulo del sitio
     */
    public boolean validateSiteTitle(String siteUrl){
        String title = driver.getTitle();
        return Objects.equals(title, siteUrl);
    }

    /**
     * Cambiar el color del body(extra)
     */
    public void changeBodyColor(String BodyId, String color){
        ((JavascriptExecutor) driver).executeScript("" +
                "document.getElementById(" +
                "'"+ BodyId+ "" +
                "').style.backgroundColor = '"+ color+"';"
        );
    }

    /**
     * Click usando JS
     */

    public void clickUsingJs(String jsCommand){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript(jsCommand);
    }

    /**
     * Validando titulo de iframe
     */
    public String validateIframeTitle(){
        var element = driver.switchTo().frame(driver.findElement(By.id("frame1")));
        var element2 = element.findElement(By.id("sampleHeading"));
        return element2.getText();
    }

    /*
    * Miguel Herrera
    * */

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

    public void scrollDown(int distance){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, "+distance+")");
    }

    public String getValue(By by) {
        String value = driver.findElement(by).getAttribute("value");
        Print("Se Obtiene value: " + value + " del elemento: " + by);
        return value;
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
