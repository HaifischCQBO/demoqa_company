package Pages.bookstore;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Page_bookdescription {


    public WebDriver driver;
    public Helpers helpers;


    public Page_bookdescription(){
        this.driver = SingletonDriver.getWebDriver();
        this.helpers = new Helpers(driver);
    }
    public By button_add_book= By.xpath("//button[contains(text(),'Add To Your Collection')]");
    public By title_description = By.xpath("//div[@id='title-wrapper']/*/label[@id='userName-value']");
    //div[@id='title-wrapper']/*/label[@id='userName-value']
    public void click_button_add(){
        helpers.clickBy(button_add_book);
      //WebElement element = driver.findElement(button_add_book);
      //helpers.clickWebelement(element);
    }

    public void double_click_add(){
        WebElement element = driver.findElement(button_add_book);
        helpers.double_clickBy(element);
    }
    public Boolean alert_confirmation(){
        String aux = new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent()).getText();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return aux.contains("Book added to your collection.");
    }

    public Boolean alert_error(){
        String aux = new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent()).getText();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return aux.contains("Book added to your collection.");
    }

    public Boolean confirmation(String title){
        String name_book = driver.findElement(title_description).getText();
        return name_book.equals(title);
    }




}
