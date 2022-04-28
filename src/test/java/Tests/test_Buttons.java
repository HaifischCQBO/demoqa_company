package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Blazedemo.PageRadioButtons;
import Pages.Blazedemo.PageIndex;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class test_Buttons extends BaseClass {

    @Test
    public void Test_elements() {
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));

        // Ingresamos desde la pagina principal a la seccion Elements
        PageIndex pageindex = new PageIndex(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,500)");
        pageindex.clickElements();

        // Recorremos desde elements hasta RadioButtons y los probamos
        PageRadioButtons pageRadiobuttons = new PageRadioButtons(driver);
        JavascriptExecutor jsButtons2 = (JavascriptExecutor) driver;
        jsButtons2.executeScript("window.scrollTo(0,300)");
        pageRadiobuttons.clickRadioButtons();
        helpers.Pause(3);
        pageRadiobuttons.clickRadioYes();
        helpers.Pause(3);
        pageRadiobuttons.clickRadioImpressive();
    }
}