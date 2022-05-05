package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Helpers {
    private static WebDriver driver;
    public Helpers(){}


    public Helpers(WebDriver driver) {
        this.driver=driver;

    }

    public void getURL(String url){
        driver.get(url);
    }

    public void max(){
        driver.manage().window().maximize();
    }
    public void borrar(By by){
        driver.findElement(by).clear();
    }
    public void click(By by){
        driver.findElement(by).click();

    }
    public void sendtext(By by){
        driver.findElement(by).sendKeys("Addy Osmani");

    }

    public void buscartitle(By by){
        driver.findElement(by).sendKeys("Programming JavaScript Applications");
    }
    public void buscareditor(By by){
        driver.findElement(by).sendKeys("No Starch Press");
    }
    public void wait(int second){
        try {
            Thread.sleep(second*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }



}
