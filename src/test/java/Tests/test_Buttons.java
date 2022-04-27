package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.Blazedemo.Page_Buttons;
import Pages.Blazedemo.Page_Index;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class test_Buttons extends BaseClass {

    @Test
    public void Test_elements() {
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,500)");

        Page_Index page_index = new Page_Index(driver);
        page_index.click_elements_div();

        // FUNCIONES CLICK

        Page_Buttons page_buttons = new Page_Buttons(driver);
        JavascriptExecutor js_2 = (JavascriptExecutor) driver;
        js_2.executeScript("window.scrollTo(0,10)");
        page_buttons.clickButtons();
        page_buttons.clickMe_buttons();
        page_buttons.doubleClick();
        page_buttons.rightClick();
    }
}