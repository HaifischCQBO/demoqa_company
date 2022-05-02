package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {
    private static WebDriver driver;

    public Helpers() {

    }

    public Helpers(WebDriver driver) {
        this.driver = driver;
    }

    //metodos
    public void getURL(String url) {
        print("se ingresa a la url: " + url);
        driver.get(url);
    }

    public void max() {
        driver.manage().window().maximize();
    }

    public void print(String texto) {
        System.out.println(texto);
    }

    public void clickby(By by) {
        driver.findElement(by).click();
        print("se hace click al elemeto " + by);
    }
    public void Sendtexto(By by){
        driver.findElement(by).sendKeys("jsierra");

    }
    public void id_password(By by){
        driver.findElement(by).sendKeys("Juliana2015*");
    }

    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void busqueda_por_autor(By by) {
        driver.findElement(by).sendKeys("Marijn Haverbeke");
    }
    public void busqueda_por_titulo(By by) {
        driver.findElement(by).sendKeys("Speaking JavaScript");
    }
    public void busqueda_por_publicador(By by){
        driver.findElement(by).sendKeys("O'Reilly Media");
    }
    public void borrar(By by){
        driver.findElement(by).clear();
    }
    public void frames(){
        driver.switchTo().frame("google_center_div");
    }
}
