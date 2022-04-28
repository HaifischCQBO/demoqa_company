package Tests;

import Baseclass.BaseClass;
import Helpers.Helpers;
import PagesDemoQa.Page_Index;
import PagesDemoQa.Page_elements;
import org.testng.annotations.Test;

public class TestConPOM extends BaseClass {

     @Test
         public void scenario1(){
         Helpers helpers = new Helpers(driver);
         helpers.getURL("https://demoqa.com/checkbox");
         Page_Index page_index = new Page_Index(driver);
         page_index.click_btnElements();
    }



    @Test
    public void scenario2(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_CheckHome();
    }

    @Test
    public void scenario3(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
    }

    @Test
    public void scenario4(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
    }

    @Test
    public void scenario5(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
    }

    @Test
    public void scenario6(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
    }

    @Test
    public void scenario7(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
        page_elements.click_checkDocuments();
    }

    @Test
    public void scenario8(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
        page_elements.click_checkDocuments();
        page_elements.click_workSpace();
    }

    @Test
    public void scenario9(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
        page_elements.click_checkDocuments();
        page_elements.click_workSpace();
        page_elements.click_checkWorkSpace();
    }

    @Test
    public void scenarioDiez(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
        page_elements.click_checkDocuments();
        page_elements.click_workSpace();
        page_elements.click_checkWorkSpace();
        page_elements.click_buttonOffice();
    }

    @Test
    public void scenarioOnce(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
        page_elements.click_checkDocuments();
        page_elements.click_workSpace();
        page_elements.click_checkWorkSpace();
        page_elements.click_buttonOffice();
        page_elements.click_buttonDownloads();
    }

    @Test
    public void scenarioDoce(){
        Helpers helpers = new Helpers(driver);
        helpers.getURL("https://demoqa.com/checkbox");
        Page_elements page_elements = new Page_elements(driver);
        page_elements.click_btnrct();
        page_elements.click_buttonDesktop();
        page_elements.click_checkDesktop();
        page_elements.click_buttonDocuments();
        page_elements.click_checkDocuments();
        page_elements.click_workSpace();
        page_elements.click_checkWorkSpace();
        page_elements.click_buttonOffice();
        page_elements.click_buttonDownloads();
        page_elements.click_checkDownloads();
    }


}
