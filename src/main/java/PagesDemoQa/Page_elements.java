package PagesDemoQa;

import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_elements {
    public WebDriver driver;
    public Helpers helpers;

    public Page_elements(WebDriver driver) {
        this.driver = driver;
        helpers = new Helpers(driver);
    }

                                    //*[@id="tree-node"]/ol/li/span/button


    public By checkHome= By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]");

    public void click_CheckHome(){
        helpers.clickBy(checkHome);
        //driver.findElement(botonElements).click();
    }

    public By buttonrct = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button");

    public void click_btnrct(){
        helpers.clickBy(buttonrct);
        //driver.findElement(botonElements).click();
    }

    public By buttonDesktop= By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button");

    public void click_buttonDesktop(){
        helpers.clickBy(buttonDesktop);
        //driver.findElement(botonElements).click();
    }

    public By checkDesktop= By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[1]");

    public void click_checkDesktop(){
        helpers.clickBy(checkDesktop);
        //driver.findElement(botonElements).click();
    }

    public By click_ButtonDocuments= By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button");

    public void click_buttonDocuments(){
        helpers.clickBy(click_ButtonDocuments);
        //driver.findElement(botonElements).click();
    }

    public By checkDocuments= By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]");

    public void click_checkDocuments(){
        helpers.clickBy(checkDocuments);
        //driver.findElement(botonElements).click();
    }


    public By ButtonWorkSpace= By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button");

    public void click_workSpace(){
        helpers.clickBy(ButtonWorkSpace);
        //driver.findElement(botonElements).click();
    }

    public By checkWorkSpace= By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/label/span[1]");

    public void click_checkWorkSpace(){
        helpers.clickBy(checkWorkSpace);
        //driver.findElement(botonElements).click();
    }

    public By buttonOffice= By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button");

    public void click_buttonOffice(){
        helpers.clickBy(buttonOffice);
        //driver.findElement(botonElements).click();
    }

    public By click_Downloads= By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button");

    public void click_buttonDownloads(){
        helpers.clickBy(click_Downloads);
        //driver.findElement(botonElements).click();
    }



    public By checkDownloads= By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]");

    public void click_checkDownloads(){
        helpers.clickBy(checkDownloads);
        //driver.findElement(botonElements).click();
    }
}
