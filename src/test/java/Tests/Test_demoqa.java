package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import Pages.PageElementsDynamicsProperties;
import Pages.PageForms;
import Pages.PageIndex;
import org.testng.annotations.Test;

public class Test_demoqa extends BaseClass {

    @Test
    public void Test_forms(){

        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        helpers.scrollDown();

        PageIndex pageIndex = new PageIndex(driver);
        pageIndex.click_card_Forms();

        PageForms pageForms = new PageForms(driver);
        pageForms.click_practice_Form_button();
        pageForms.fill_form_practice_Form();
        pageForms.press_submit_button();



    }

   // @Test
    public void Test_DynamicsProperties(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL(helpers.getXMLParameter("url"));
        helpers.scrollDown();

        PageIndex pageIndex = new PageIndex(driver);
        pageIndex.click_card_Elements();
        helpers.scrollDown();
        helpers.scrollDown();
        PageElementsDynamicsProperties pageElementsDynamicsProperties = new PageElementsDynamicsProperties(driver);
        pageElementsDynamicsProperties.click_DynamicsProperties_button();

    }
}
