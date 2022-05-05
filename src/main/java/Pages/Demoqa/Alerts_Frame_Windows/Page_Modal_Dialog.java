package Pages.demoqa.Alerts_Frame_Windows;

import Helpers.Helpers;
import Helpers.SingletonDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Page_Modal_Dialog{

    public WebDriver driver;
    public Helpers helpers;

    public Page_Modal_Dialog() {
        driver = SingletonDriver.getWebDriver();
        helpers = new Helpers(driver);
    }

    


   public By smallModal = By.id("showSmallModal");
   public By showSmallModal = By.id("example-modal-sizes-title-sm");
   public By closeSmallModal = By.id("closeSmallModal");

   public By largeModal = By.id("showLargeModal");
   public By ShowlargeModal = By.id("example-modal-sizes-title-lg");
   public By closelargeModal = By.id("closeLargeModal");
   public void clickBtnSmallModal(){
        helpers.clickBy(smallModal);
    }

    public boolean findSmallModalAlert(){
        try{
            driver.findElement(showSmallModal);
            return true;
        }
        catch (NoSuchElementException e){
            return false;
        }
    }
    public void clickBtnCloseSmallModal(){
        helpers.clickBy(closeSmallModal);
    }
    public void clickBtnlargeModal(){
        helpers.clickBy(largeModal);
    }
    public boolean findlargeModalAlert(){
        try{
            driver.findElement(ShowlargeModal);
            return true;
        }
        catch (NoSuchElementException e){
            return false;
        }
    }
    public void clickBtnCloselargeModal(){
        helpers.clickBy(closelargeModal);
    }
}
