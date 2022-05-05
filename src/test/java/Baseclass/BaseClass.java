package Baseclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import Helpers.Helpers;
import Helpers.SingletonDriver;

public class BaseClass {
    public WebDriver driver;
    Helpers helpers  = new Helpers();

@BeforeMethod
    public void setUp(){
        driver = SingletonDriver.getWebDriver();
        SingletonDriver.setCloseWhenFinished(false);
    }

<<<<<<< HEAD
@AfterMethod
    public void Finished(){
        if (SingletonDriver.getCloseWhenFinished())
        driver.quit();
    }
    
=======
    @AfterMethod
    public void Finished(){/*
        if(SingletonDriver.getCloseWhenFinished())
            driver.close();
            */
    }
    @AfterTest
    public void FinishedAll(){
        if(SingletonDriver.getCloseWhenFinished()) {
            //driver.quit();
            //SingletonDriver.setDriverNull();
        }
    }

>>>>>>> 2fd7f94d33c5bcbd2575a868e33b4a5db6229030
}
