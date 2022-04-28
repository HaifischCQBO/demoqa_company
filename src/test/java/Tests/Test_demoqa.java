package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.PageForms;
import Pages.PageIndex;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Test_demoqa extends BaseClass {

    @Test
    public void Test_forms(){

        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        helpers.scrollDown();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollTo(0,500)");

        PageIndex pageIndex = new PageIndex(driver);
        pageIndex.click_card_Forms();

        PageForms pageForms = new PageForms(driver);
        pageForms.click_practice_Form_button();
        pageForms.fill_form_practice_Form();
        pageForms.click_submit_button();


    }
}
