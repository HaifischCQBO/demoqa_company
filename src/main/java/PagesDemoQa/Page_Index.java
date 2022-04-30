package PagesDemoQa;


import Helpers.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Index {
    public WebDriver driver;
    public Helpers helpers;

    public Page_Index(WebDriver driver) {
        this.driver = driver;
        helpers = new Helpers(driver);
    }

    public By botonElements = By.xpath("//div[@id=\"app\"]/div/div/div[2]/div/div[1]");

    public void click_btnElements(){
        helpers.clickBy(botonElements);

        //driver.findElement(botonElements).click();

    }

}
